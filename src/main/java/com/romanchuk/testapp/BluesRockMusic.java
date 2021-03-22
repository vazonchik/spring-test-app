package com.romanchuk.testapp;

import org.springframework.stereotype.Component;

@Component
public class BluesRockMusic implements Music{
    @Override
    public String getSong() {
        return "Sister";
    }
}
