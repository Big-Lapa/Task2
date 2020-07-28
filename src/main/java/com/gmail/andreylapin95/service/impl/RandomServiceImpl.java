package com.gmail.andreylapin95.service.impl;

import com.gmail.andreylapin95.constants.Numbers;
import com.gmail.andreylapin95.service.RandomService;

import java.util.Random;

public class RandomServiceImpl implements RandomService {
    @Override
    public int randomNumber() {
        Numbers numbers = new Numbers();
        int max = numbers.max;
        final Random random = new Random();
        return random.nextInt(max);
    }
}
