package com.usmb.monopoly.model;
import java.util.ArrayList;

public class Gobelet {
    public boolean estDernierLancerDouble;

    public ArrayList<Dès> dès = new ArrayList<Dès> ();

    public Gobelet() {
        this.dès.add(new Dès());
        this.dès.add(new Dès());
    }

    public int tirer() {
        int lancer1 = dès.get(0).tirer();
        int lancer2 = dès.get(1).tirer();
        estDernierLancerDouble = (lancer1 == lancer2);
        return lancer1 + lancer2;
    }

    public boolean getEstDernierLancerDouble() {
        return estDernierLancerDouble;
    }

}
