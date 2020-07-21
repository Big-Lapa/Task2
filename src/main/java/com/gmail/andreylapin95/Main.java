package com.gmail.andreylapin95;

import com.gmail.andreylapin95.users.user1.CreditCard;
import com.gmail.andreylapin95.service.InformationService;
import com.gmail.andreylapin95.service.OperationWithMoneyService;
import com.gmail.andreylapin95.service.PrintService;
import com.gmail.andreylapin95.service.RandomService;
import com.gmail.andreylapin95.service.impl.InformationOfCreditCard;
import com.gmail.andreylapin95.service.impl.OperationWithMoneyServiceCreditCard;
import com.gmail.andreylapin95.service.impl.PrintServiceConsoleImpl;
import com.gmail.andreylapin95.service.impl.RandomServiceImpl;

public class Main {
    public static void main(String[] args) {
        RandomService random = new RandomServiceImpl();
        int number1 = random.randomNumber();
        int number2 = random.randomNumber();
        int number3 = random.randomNumber();
        CreditCard creditCard1 = new CreditCard(number1, 5000);
        CreditCard creditCard2 = new CreditCard(number2, 5000);
        CreditCard creditCard3 = new CreditCard(number3, 5000);
        OperationWithMoneyService operationWithMoneyServiceCreditCard = new OperationWithMoneyServiceCreditCard();
        InformationService informationOfCreditCard = new InformationOfCreditCard();
        PrintService printServiceConsole = new PrintServiceConsoleImpl();
        operationWithMoneyServiceCreditCard.depositMoney(creditCard1,1000);
        operationWithMoneyServiceCreditCard.depositMoney(creditCard2,5000);
        operationWithMoneyServiceCreditCard.withdrawingMoney(creditCard3, 2500);
        printServiceConsole.printString(informationOfCreditCard.allInformation(creditCard1));
        printServiceConsole.printString(informationOfCreditCard.allInformation(creditCard2));
        printServiceConsole.printString(informationOfCreditCard.allInformation(creditCard3));
    }
}
