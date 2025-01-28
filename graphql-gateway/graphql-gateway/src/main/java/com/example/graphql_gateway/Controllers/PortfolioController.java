package com.example.graphql_gateway.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Controller
public class PortfolioController {

    @Autowired
    private RestTemplate restTemplate;

    @QueryMapping
    public Portfolio getPortfolioById(@Argument String id) {
        // Calls the Portfolio Service via REST (could be gRPC or GraphQL Federation)
    }

    @QueryMapping
    public List<Portfolio> portfolios() {
        // Call the Portfolio Service to get all portfolios
    }
}