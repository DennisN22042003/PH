package com.example.portfolio_service.Services;

import java.util.*;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.portfolio_service.model.Portfolio;

// FOR USE WHEN INTER-SERVICE COMMUNICATION AND DATABASE COMMUNICATION ARE IMPLEMENTED

// import com.example.portfolio_service.exceptions.PortfolioNotFoundException;
// import com.example.portfolio_service.Repositories.PortfolioRepository;

@Service
@Component
public class PortfolioService {
    // private final PortfolioRepository portfolioRepository;
    // private final PhotographerClient photographerClient; // Calls the photographer micro-service


    private final List<Portfolio> portfolio = Arrays.asList(
        // Sample data for testing
        new Portfolio(1L, "Photographer A", "Wedding", "A wedding in Nairobi!"),
        new Portfolio(2L, "Photographer B", "Birthday", "A birthday party in Mombasa!")
    );

    public List<Portfolio> getAllPortfolios() {
        return portfolio;
    }

    public Optional<Portfolio> getPortfolioById(Long id) {
        return portfolio.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
}