package de.jonas.hoffmann.search.main;

import de.jonas.hoffmann.search.window.Window;
import lombok.Getter;

@Getter
public class SWBase {

    private Window window;
    private final int WIDTH = 800, HEIGHT = 800;

    public SWBase() {
        this.window = new Window(this, WIDTH, HEIGHT);

    }

}
