package com.javasa.rest.rest;

import com.javasa.rest.constants.AppConstants;
import com.javasa.rest.dto.request.ChangeBrokerRequest;
import com.javasa.rest.dto.response.ChangeBroker;
import com.javasa.rest.service.ChangeBrokerService;
import org.glassfish.jersey.server.ManagedAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 *
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
@Component
@Path("/rest-spring")
@Produces(AppConstants.APPLICATION_JSON)
public class ChangeBrokerEndpoint {

    private ChangeBrokerService service;

    @Autowired
    public ChangeBrokerEndpoint(ChangeBrokerService service) {
        this.service = service;
    }

    @POST
    @Path("m/change-broker")
    @ManagedAsync
    @Consumes(AppConstants.APPLICATION_JSON)
    public Response findChangeBroker(@Valid ChangeBrokerRequest request){
        com.javasa.rest.dto.response.Response<ChangeBroker> response = service.findChangeBroker(request);
        return Response.ok(response).build();
    }
}
