package com.usmb.monopoly.model;

import java.util.Random;

public class Dès {
    private Random r = new Random();

    public int tirer() {
        return r.nextInt(6) + 1;
    }
}
