package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.users.user1.CreditCard;
import com.gmail.andreylapin95.service.InformationService;

public class InformationOfCreditCard implements InformationService {
    @Override
    public String allInformation(CreditCard creditCard) {
        String str1 = "Amount number: ";
        String str2 = ", current amount: ";
        int number = creditCard.getAmountNumber();
        int current = creditCard.getCurrentAmount();
        return str1 + number  + str2 + current;
    }
}
