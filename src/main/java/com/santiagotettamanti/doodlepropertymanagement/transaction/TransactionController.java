package com.santiagotettamanti.doodlepropertymanagement.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping ("/rent")
    public ArrayList<Transaction> getAllRents() {
        ArrayList<Transaction> transactions = transactionService.getTransactions();
        return transactions;
    }
}
