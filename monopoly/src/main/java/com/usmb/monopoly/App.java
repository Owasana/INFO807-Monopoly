package com.usmb.monopoly;

import com.usmb.monopoly.model.Jeu;
import com.usmb.monopoly.tui.MenuCréation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Jeu jeu = new Jeu();
        new MenuCréation(jeu);
    }
}
