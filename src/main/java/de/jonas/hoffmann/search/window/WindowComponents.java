package de.jonas.hoffmann.search.window;

import de.jonas.hoffmann.search.main.SWBase;
import lombok.Getter;

@Getter
public class WindowComponents {

    private SWBase swBase;

    private final int 

    public WindowComponents(SWBase swBase) {
        this.swBase = swBase;
    }

    public void generateGrid() {
        for(int i = 0; i < swBase.getHEIGHT()/20; i++) {
            for(int j = 0; j < swBase.getWIDTH()/20; j++) {

            }
        }
    }

}
