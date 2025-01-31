package com.example.portfolio_service.Services;

import java.util.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// FOR USE WHEN INTER-SERVICE COMMUNICATION AND DATABASE COMMUNICATION ARE IMPLEMENTED
// import com.example.portfolio_service.model.Portfolio;
// import com.example.portfolio_service.exceptions.PortfolioNotFoundException;
// import com.example.portfolio_service.Repositories.PortfolioRepository;

@Service
@Component
public class PortfolioService {
    // private final PortfolioRepository portfolioRepository;
    // private final PhotographerClient photographerClient; // Calls the photographer micro-service

    private final List<Porfolio> portfolio = Arrays.asList(
        // Sample data for testing
        new Portfolio(1L, "user1", "Photographer A", "2025-02-27", "10:00", "Nairobi", "Confirmed"),
        new Portfolio(2L, "user2", "Photographer B", "2025-02-27", "12:00", "Nairobi", "Pending")
    );

    public List<Portfolio> getAllPortfolios() {
        return portfolios;
    }

    public Optional<Portfolio> getPortfolioById(Long id) {
        return portfolios.stream().filter(b -> b.getId().equals(id)).findFirst();
    }
}