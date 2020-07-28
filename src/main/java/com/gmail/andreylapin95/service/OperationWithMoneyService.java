package com.gmail.andreylapin95.service;

import com.gmail.andreylapin95.users.user1.CreditCard;

public interface OperationWithMoneyService {
    void depositMoney(CreditCard creditCard, int amountOfMoney);
    void withdrawingMoney(CreditCard creditCard, int amountOfMoney);
}
