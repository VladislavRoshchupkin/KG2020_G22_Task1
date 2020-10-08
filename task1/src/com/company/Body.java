package com.company;

import java.awt.*;

public class Body implements Drawable {
    private double x, y;
    private double w;
    private double h;

    public Body(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int tx = (int)((x - w / 2) *width);
        int ty = (int)((y - h / 2) *height);
        gr.setColor(Color.YELLOW);
        gr.fillOval(tx, ty, (int)(w*width), (int)(h*height));
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawOval(tx, ty, (int)(w*width), (int)(h*height));
        //gr.drawOval(150, 250, 500, 220);
    }
}
