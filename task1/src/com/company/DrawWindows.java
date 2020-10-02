package com.company;

import java.awt.*;

public class DrawWindows implements Drawable {
    private int width;
    private int height;

    public DrawWindows(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setStroke(new BasicStroke(3.0f));
        for (int i = 200; i < 401; i += 100) {
            gr.setColor(Color.WHITE);
            gr.fillOval(i, 320, 50, 50);
            gr.setColor(Color.BLACK);
            gr.drawOval(i, 320, 50, 50);
        }
    }
}
