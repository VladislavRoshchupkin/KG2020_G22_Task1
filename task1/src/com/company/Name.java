package com.company;

import java.awt.*;

public class Name implements Drawable{
    private double x, y;
    private double w;
    private double h;

    public Name(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.w = width;
        this.h = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        int tx = (int)((x - w / 2) *width);
        int ty = (int)((y - h / 2) *height);
        gr.setColor(Color.ORANGE);
        gr.setFont(new Font("Arial", Font.BOLD, 35));
        gr.drawString("Комсомолец", tx, ty);
    }
}
