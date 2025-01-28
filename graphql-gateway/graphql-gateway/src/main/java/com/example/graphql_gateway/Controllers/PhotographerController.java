package com.example.graphql_gateway.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class PhotographerController {

    @Autowired
    private RestTemplate restTemplate;

    @QueryMapping
    public Photographer getPhotographerById(@Argument String id) {
        // Calls the Photographer Service via REST (could be gRPC or GraphQL Federation)
    }

    @QueryMapping
    public List<Photographer> photographers() {
        // Call the Photographer Service to get all photographers
    }
}