package com.javasa.rest.service;

import com.javasa.rest.constants.UrlConstants;
import com.javasa.rest.dto.request.ChangeBrokerRequest;
import com.javasa.rest.dto.response.ChangeBroker;
import com.javasa.rest.dto.response.Response;
import com.javasa.rest.dto.response.server.response.ChangeBrokerResponse;
import org.springframework.stereotype.Component;

import javax.ws.rs.HttpMethod;

/**
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
@Component
public class ChangeBrokerService extends Service<ChangeBrokerResponse> {

    public ChangeBrokerService() {
        super(ChangeBrokerResponse.class);
    }

    public Response<ChangeBroker> findChangeBroker(ChangeBrokerRequest request) {
        Response<ChangeBroker> result = new Response<ChangeBroker>();

        try {
            ChangeBrokerResponse response = callService(HttpMethod.GET, UrlConstants.CHANGE_BROKER_URL, UrlConstants.TOKEN_TEMPORARY);
            if (response.isSuccessful()) {
                result.setSuccessful(true);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return result;
    }
}
