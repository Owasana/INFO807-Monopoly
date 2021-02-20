package com.usmb.monopoly.view;

import com.usmb.monopoly.model.Jeu;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CréationPartieView extends Panel {
    TextField t1;
    TextField t2;
    TextField t3;

    public CréationPartieView(final Window window) {
        super();

        setLayout(new GridLayout(4, 1));

        t1 = new TextField();
        t2 = new TextField();
        t3 = new TextField();

        add(t1);
        add(t2);
        add(t3);

        final Button demarrer = new Button("Démarrer");
        demarrer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                window.demarrer(t1.getText(), t2.getText(), t3.getText());
            }
        });
        add(demarrer);
    }

}
