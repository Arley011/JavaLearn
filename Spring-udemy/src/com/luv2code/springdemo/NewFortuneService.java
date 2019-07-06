package com.luv2code.springdemo;

import java.util.Random;

public class NewFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        String[] strArr = new String[3];
        for(int i=0;i<3;i++){
            strArr[i] = "Here is string " + i;
        }
        Random rand = new Random();
        return strArr[rand.nextInt(3)];
    }


}
