package com.company;

import java.awt.*;

public class Propeller implements Drawable {
    private int width;
    private int height;

    public Propeller(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawOval(85, 318, 10, 30);
        gr.drawOval(85, 372, 10, 30);
        gr.drawRect(90, 350, 60, 20);
        gr.setColor(Color.ORANGE);
        gr.fillOval(85, 318, 10, 30);
        gr.fillOval(85, 372, 10, 30);
        gr.fillRect(90, 350, 60, 20);
    }
}
