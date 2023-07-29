package com.santiagotettamanti.doodlepropertymanagement.expenseforecast;

import java.util.ArrayList;

public class ExpenseForecastResponse {
    private ArrayList <MonthlyAmount> monthlyAmounts;

    public ArrayList<MonthlyAmount> getMonthlyAmounts() {
        return monthlyAmounts;
    }

    public void setMonthlyAmounts(ArrayList<MonthlyAmount> monthlyAmounts) {
        this.monthlyAmounts = monthlyAmounts;
    }
}
