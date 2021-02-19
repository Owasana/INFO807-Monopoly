package com.usmb.monopoly;

import java.util.Random;

public class Dès {
    private Random r = new Random();

    public int tirer() {
        return r.nextInt(6) + 1;
    }
}
