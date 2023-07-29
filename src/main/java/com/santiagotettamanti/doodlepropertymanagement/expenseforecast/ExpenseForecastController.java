package com.santiagotettamanti.doodlepropertymanagement.expenseforecast;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ExpenseForecastController {

    private final ExpenseForecastService expenseForecastService;

    @Autowired
    public ExpenseForecastController (ExpenseForecastService expenseForecastService) {
        this.expenseForecastService = expenseForecastService;
    }

    @GetMapping ("/expense-forecast-request")
    public ExpenseForecastResponse calculateExpenseForecast (ExpenseForecastRequest expenseForecastRequest) {
        return expenseForecastService.getExpenseForecastRequests(expenseForecastRequest);
    }


}
