package com.company;

import java.awt.*;

public class WindShield implements Drawable {
    private int width;
    private int height;

    public WindShield(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(3.0f));
        gr.drawLine(519, 277, 519, 443);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawArc(395, 275, 250, 170, 270, 180);
        gr.setColor(Color.WHITE);
        gr.fillArc(395, 275, 250, 170, 270, 180);
    }
}
