package com.santiagotettamanti.doodlepropertymanagement.expenseforecast;

import java.util.ArrayList;

public class ExpenseForecastRequest {
    private ArrayList <EscalationRate> escalationRates;
    private int initialExpense;

    public ArrayList <EscalationRate> getEscalationRates() {
        return escalationRates;
    }

    public void setEscalationRates(ArrayList <EscalationRate> escalationRates) {
        this.escalationRates = escalationRates;
    }

    public int getInitialExpense() {
        return initialExpense;
    }

    public void setInitialExpense(int initialExpense) {
        this.initialExpense = initialExpense;
    }
}


