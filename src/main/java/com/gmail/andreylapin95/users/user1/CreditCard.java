package com.gmail.andreylapin95.users.user1;

public class CreditCard{
    public CreditCard(int amountNumber, int currentAmount) {
        this.amountNumber = amountNumber;
        this.currentAmount = currentAmount;
    }

    private int amountNumber;
    private int currentAmount;

    public int getAmountNumber() {
        return amountNumber;
    }

    public void setAmountNumber(int amountNumber) {
        this.amountNumber = amountNumber;
    }

    public int getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(int currentAmount) {
        this.currentAmount = currentAmount;
    }
}
