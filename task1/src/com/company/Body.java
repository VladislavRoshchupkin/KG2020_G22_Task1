package com.company;

import java.awt.*;

public class Body implements Drawable {
    private int width;
    private int height;

    public Body(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.YELLOW);
        gr.fillOval(150, 250, 500, 220);
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawOval(150, 250, 500, 220);
    }
}
