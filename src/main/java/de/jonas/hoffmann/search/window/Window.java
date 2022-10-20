package de.jonas.hoffmann.search.window;


import de.jonas.hoffmann.search.main.SWBase;

import javax.swing.*;

public class Window {

    private int sizeX, sizeY;
    private JFrame frame;

    private SWBase swBase;

    public Window(SWBase swBase, int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;

        this.swBase = swBase;
        open();
    }

    public void open() {
        this.frame = new JFrame();
        this.frame.setSize(this.sizeX, this.sizeY);
        this.frame.setResizable(false);
        this.frame.setLocationRelativeTo(null);

        WindowComponents windowComponents = new WindowComponents(swBase);

        this.frame.setVisible(true);
    }

}
