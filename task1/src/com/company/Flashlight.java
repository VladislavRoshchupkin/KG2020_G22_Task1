package com.company;

import java.awt.*;

public class Flashlight implements Drawable {
    private int width;
    private int height;

    public Flashlight(int width, int height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLACK);
        gr.drawLine(550, 450, 640, 450);
        int[] ArrayX = {640, 660, 660};
        int[] ArrayY = {450, 435, 465};
        Polygon poly = new Polygon(ArrayX, ArrayY, 3);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawPolygon(poly);
        gr.setColor(Color.YELLOW);
        gr.fillPolygon(poly);
    }
}
