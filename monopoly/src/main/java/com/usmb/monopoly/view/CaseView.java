package com.usmb.monopoly.view;

import com.usmb.monopoly.model.Case;

import java.awt.*;

public class CaseView extends Panel {

    public CaseView(Case aCase) {
        setSize(10, 10);
        Label label = new Label(aCase.getNom());
        add(label);
        setVisible(true);
    }
}
