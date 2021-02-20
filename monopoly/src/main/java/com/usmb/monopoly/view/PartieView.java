package com.usmb.monopoly.view;

import com.usmb.monopoly.model.Partie;

import java.awt.*;

public class PartieView extends Panel {
    public PartieView(Partie partie) {
        super();

        setLayout(new BorderLayout());

        /*PlateauView plateau = new PlateauView(partie.getPlateau());
        add(new Label("Monopoly"), BorderLayout.NORTH);
        add(plateau, BorderLayout.CENTER);
        setVisible(true);*/
    }
}
