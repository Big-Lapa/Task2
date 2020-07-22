package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.users.user1.CreditCard;
import com.gmail.andreylapin95.service.OperationWithMoneyService;

public class OperationWithMoneyServiceCreditCard implements OperationWithMoneyService {
    @Override
    public void depositMoney(CreditCard creditCard, int amountOfMoney) {
        int currentAmount = creditCard.getCurrentAmount();
        creditCard.setCurrentAmount(currentAmount+amountOfMoney);
    }

    @Override
    public void withdrawingMoney(CreditCard creditCard, int amountOfMoney) {
        int currentAmount = creditCard.getCurrentAmount();
        creditCard.setCurrentAmount(currentAmount-amountOfMoney);
    }
}
