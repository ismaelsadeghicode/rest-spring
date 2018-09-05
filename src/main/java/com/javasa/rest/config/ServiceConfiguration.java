package com.javasa.rest.config;

import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.ClientProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Copyright 2016 (C) sefryek.com
 *
 * @author: ismael.sadeghi
 * @email: ismaelsadeghi111@gmail.com
 * @date: 09/04/2018
 */
@Configuration
public class ServiceConfiguration {

    private RelaxedPropertyResolver propertyResolver;
    @Autowired
    private ClientConfig clientConfig;

    public void setEnvironment(Environment environment) {
        this.propertyResolver = new RelaxedPropertyResolver(environment, "service.timeout.");
    }

    @Bean
    public Client jerseyClient() {
        clientConfig.property(ClientProperties.SUPPRESS_HTTP_COMPLIANCE_VALIDATION, true);
        Client client = ClientBuilder.newClient(clientConfig);
        client.property(ClientProperties.CONNECT_TIMEOUT, 20000);
        client.property(ClientProperties.READ_TIMEOUT, 20000);
        return client;
    }

    @Bean
    public ClientConfig ClientConfig() {
        return new ClientConfig();
    }

}
