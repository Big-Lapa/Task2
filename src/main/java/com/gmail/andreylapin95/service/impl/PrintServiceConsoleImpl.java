package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.service.PrintService;

public class PrintServiceConsoleImpl implements PrintService {
    @Override
    public void printString(String string) {
        System.out.println(string);
    }
}
