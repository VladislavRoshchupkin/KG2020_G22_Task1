package com.company;

import java.awt.*;

public class Tube implements Drawable {
    private double x, y;
    private double w;
    private double h;


    public Tube(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
    }

    @Override
    public void draw(Graphics2D gr, int width,int height) {
        int tx = (int)((x - w / 2) *width);
        int ty = (int)((y - h / 2) *height);
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawRect(tx, ty, (int)(w*width), (int)(h*height));
        gr.drawRoundRect(tx, ty, (int)(w*width), (int)(h*height), 10, 10);
        gr.setColor(Color.ORANGE);
        gr.fillRect(tx, ty, (int)(w*width), (int)(h*height));
        gr.fillRoundRect(tx, ty, (int)(w*width), (int)(h*height), 10, 10);
        gr.setColor(Color.WHITE);
        gr.fillOval(396, 180, 18, 18);
    }
}
