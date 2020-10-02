package com.company;

import java.awt.*;

public class Tube implements Drawable {
    private int width;
    private int height;

    public Tube(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics2D gr, int width,int height) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawRect(370, 180, 18, 70);
        gr.drawRoundRect(370, 180, 42, 18, 10, 10);
        gr.setColor(Color.ORANGE);
        gr.fillRect(370, 180, 18, 70);
        gr.fillRoundRect(370, 180, 42, 18, 10, 10);
        gr.setColor(Color.WHITE);
        gr.fillOval(396, 180, 18, 18);
    }
}
