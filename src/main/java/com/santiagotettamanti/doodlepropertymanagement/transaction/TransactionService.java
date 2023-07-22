package com.santiagotettamanti.doodlepropertymanagement.transaction;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class TransactionService {
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public boolean addRent(Transaction transaction) {
        transactions.add(transaction);
        return true;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public Transaction getTransactionById(int id) {
        for(int i = 0; i< transactions.size(); i++) {
            Transaction currentTransaction = transactions.get(i);
            int TransactionId = currentTransaction.getTransactionNumber();
            if(TransactionId==id) {
                return currentTransaction;
            }
        }
        return null;
    }

    public Transaction deleteTransactionById(int id) {
        for(int i = 0; i< transactions.size(); i++) {
            Transaction currentTransaction = transactions.get(i);
            int transactionId = currentTransaction.getTenantId();
            if(transactionId==id) {
                transactions.remove(currentTransaction);
                return currentTransaction;
            }
        }
        return null;
    }
}
