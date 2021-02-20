package com.usmb.monopoly.view;

import com.usmb.monopoly.model.Case;
import com.usmb.monopoly.model.Partie;
import com.usmb.monopoly.model.Plateau;

import java.awt.*;

public class PlateauView extends Panel {
    public PlateauView(Plateau plateau) {
        super();

        setLayout(new BorderLayout());

        Panel axe1 = new Panel();
        axe1.setLayout(new GridLayout(1, 11));
        add(axe1, BorderLayout.NORTH);

        Panel axe2 = new Panel();
        axe2.setLayout(new GridLayout(11, 1));
        add(axe2, BorderLayout.EAST);

        Panel axe3 = new Panel();
        axe3.setLayout(new GridLayout(1, 11));
        add(axe3, BorderLayout.SOUTH);

        Panel axe4 = new Panel();
        axe4.setLayout(new GridLayout(11, 1));
        add(axe4, BorderLayout.WEST);

        for (int i = 0; i < 10; ++i) {
            {
                Case _case = plateau.getCase(i);
                CaseView view = new CaseView(_case);
                axe1.add(view);
            }

            {
                Case _case = plateau.getCase(i + 10);
                CaseView view = new CaseView(_case);
                axe2.add(view);
            }

            {
                Case _case = plateau.getCase(9 - i + 20);
                CaseView view = new CaseView(_case);
                axe3.add(view);
            }

            {
                Case _case = plateau.getCase(9 - i + 30);
                CaseView view = new CaseView(_case);
                axe4.add(view);
            }
        }
    }
}
