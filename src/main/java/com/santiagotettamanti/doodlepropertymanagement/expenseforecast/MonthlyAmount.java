package com.santiagotettamanti.doodlepropertymanagement.expenseforecast;

public class MonthlyAmount {
    private String month;
    private int year;
    private int monthlyAmountCalculation;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonthlyAmountCalculation() {
        return monthlyAmountCalculation;
    }

    public void setMonthlyAmountCalculation(int monthlyAmountCalculation) {
        this.monthlyAmountCalculation = monthlyAmountCalculation;
    }
}
