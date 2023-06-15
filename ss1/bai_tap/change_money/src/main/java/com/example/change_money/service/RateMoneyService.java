package com.example.change_money.service;

import org.springframework.stereotype.Service;

@Service
public class RateMoneyService implements IRateMoneyService {

    @Override
    public int change(int usd) {
        int vnd = 23000;
        int result;
        if (usd > 0) {
            result = usd * vnd;
            return result;
        } else {
            return 0;
        }
    }
}
