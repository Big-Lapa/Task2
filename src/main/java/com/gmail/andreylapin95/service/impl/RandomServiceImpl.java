package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.service.RandomService;

import java.util.Random;

public class RandomServiceImpl implements RandomService {
    @Override
    public int randomNumber() {
        int max = 100000;
        Random random = new Random();
        return random.nextInt(max);
    }
}
