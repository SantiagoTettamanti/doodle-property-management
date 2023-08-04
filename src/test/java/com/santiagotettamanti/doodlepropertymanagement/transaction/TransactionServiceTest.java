package com.santiagotettamanti.doodlepropertymanagement.transaction;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class TransactionServiceTest {
    TransactionService transactionService = new TransactionService();

    @Test
    void addTransaction() {

        // 1. Create a transaction giving values to all its attributes(set methods)
        Transaction newTransaction = new Transaction();
        newTransaction.setPaymentDate(LocalDate.of(2023, 4, 3));
        newTransaction.setPaymentMethod("Credit Card");
        newTransaction.setPaymentAmount(2500);
        newTransaction.setTenantId(1);

        /* 2. Add the newTransaction by passing it in as a an argument in the addTransaction method
              Store it in a variable. */
        Transaction transaction = transactionService.addTransaction(newTransaction);

        /* 3. We need to find a way to prove the method works. In this case, if you create
              a transaction in the test, it is the only one that has been created and therefore ID = 1.
              (In the addTransaction method from the service, every transaction that gets created gets
              an ID)
              So getTransactionNumber (which is 1), and write 1 as the expected value. */
        assertEquals(1, transaction.getTransactionNumber());
    }

    @Test
    void getTransaction() {

        // 1. We need a transaction to run the test, so use the method from above since it's already made.
        addTransaction();

        // 2. Access the getTransactions method from the service and store it in a variable.
        ArrayList<Transaction> transactions = transactionService.getTransactions();

        /* 3. Just like before, to check if the method works, both values must be equal.
              We provide 1 as the expected value, and since we've only added one transaction to the
              ArrayList, then the size of this ArrayList is 1. --> 1 = 1. */
        assertEquals(1, transactions.size());
    }
}
