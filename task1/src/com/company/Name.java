package com.company;

import java.awt.*;

public class Name implements Drawable{
    private int width;
    private int height;

    public Name(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.ORANGE);
        gr.setFont(new Font("Arial", Font.BOLD, 35));
        gr.drawString("Комсомолец", 220, 410);
    }
}
