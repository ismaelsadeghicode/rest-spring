package com.javasa.rest.service;

import com.javasa.rest.constants.RestConstants;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.HttpMethod;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
public class Service<T> {

    @Autowired
    private Client client;

    private Class<T> result;

    public Service(Class<T> result) {
        this.result = result;
    }

    public T callService(String httpMethod, String url, String token) throws ExecutionException, InterruptedException {
        javax.ws.rs.core.Response response = null;
        Future<Response> asyncResponse;

        try {
            WebTarget service = client.target(url);
            Invocation.Builder request = service.request();

            request.header(RestConstants.X_HEADER, String.format(RestConstants.TOKEN, token));

            if (HttpMethod.GET.equals(httpMethod)) {
                asyncResponse = request.async().get();
                response = asyncResponse.get();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return checkResponseStatus(response, result);
    }

    private <T> T checkResponseStatus(javax.ws.rs.core.Response response, Class<T> result) {
        try {
            if (javax.ws.rs.core.Response.Status.OK.getStatusCode() == response.getStatus()) {
                return response.readEntity(result);
            }
            return null;
        } finally {
            response.close();
        }
    }
}
