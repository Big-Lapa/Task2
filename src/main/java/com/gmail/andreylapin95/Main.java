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
        int amountOfMoney1 = 1000;
        int amountOfMoney2 = 5000;
        int amountOfMoney3 = 2500;
        operationWithMoneyServiceCreditCard.depositMoney(creditCard1,amountOfMoney1);
        operationWithMoneyServiceCreditCard.depositMoney(creditCard2,amountOfMoney2);
        operationWithMoneyServiceCreditCard.withdrawingMoney(creditCard3, amountOfMoney3);
        String informationCard1 = informationOfCreditCard.allInformation(creditCard1);
        String informationCard2 = informationOfCreditCard.allInformation(creditCard2);
        String informationCard3 = informationOfCreditCard.allInformation(creditCard3);
        printServiceConsole.printString(informationCard1);
        printServiceConsole.printString(informationCard2);
        printServiceConsole.printString(informationCard3);
    }
}
