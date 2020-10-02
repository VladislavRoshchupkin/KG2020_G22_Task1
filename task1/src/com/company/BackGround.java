package com.company;

import java.awt.*;

public class BackGround implements Drawable {
    private int width;
    private int height;

    public BackGround(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLUE);
        gr.fillRect(0, 220, width, 600);
        gr.setColor(Color.CYAN);
        gr.fillRect(0, 0, width, 220);
    }
}
