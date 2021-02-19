package com.usmb.monopoly;
import java.util.ArrayList;
import java.util.List;

public class Gobelet {
    public boolean estDernierLancerDouble;

    public ArrayList<Dès> dès = new ArrayList<Dès> ();

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
