package com.example.graphql_gateway.Controllers;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ReviewController {
    @QueryMapping
    public Review getReviewById(@Argument String id) {
        // Logic to call the Review Service
        // NOTE-TO-SELF: Sholuld I use REST(already know it) or GraphQL(also know it) or gRPC(haven't used it in 2 years) to call the service?
    }
}