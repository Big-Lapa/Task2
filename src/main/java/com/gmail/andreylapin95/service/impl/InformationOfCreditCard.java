package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.constants.Strings;
import com.gmail.andreylapin95.users.user1.CreditCard;
import com.gmail.andreylapin95.service.InformationService;

public class InformationOfCreditCard implements InformationService {
    @Override
    public String allInformation(CreditCard creditCard) {
        Strings strings = new Strings();
        String str1 = strings.str1;
        String str2 = strings.str2;
        int number = creditCard.getAmountNumber();
        int current = creditCard.getCurrentAmount();
        return str1.concat(String.valueOf(number)).concat(str2).concat(String.valueOf(current));
    }
}