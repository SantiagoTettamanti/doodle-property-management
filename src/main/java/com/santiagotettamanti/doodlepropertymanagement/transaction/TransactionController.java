package com.santiagotettamanti.doodlepropertymanagement.transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping ("/transaction")
    public ArrayList<Transaction> getAllRents() {
        ArrayList<Transaction> transactions = transactionService.getTransactions();
        return transactions;
    }

    @PostMapping ("/transaction")
    public Transaction createTransaction(@RequestBody Transaction transaction){
        return transactionService.addTransaction(transaction);
    }

    @PutMapping ("/transaction/{id}")
    public Transaction updateTransaction (@RequestBody Transaction transaction, @PathVariable int id) {
        Transaction updatedTransaction = transactionService.updateTransaction(transaction, id);
        return updatedTransaction;
    }
}
