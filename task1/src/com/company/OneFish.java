package com.company;

import java.awt.*;

public class OneFish implements Drawable {
    private int x;
    private  int y;
    private  int width;
    private int height;

    public OneFish(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw(Graphics2D gr,int width, int height) {
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(3.0f));
        gr.drawOval(x, y, 35, 10);
        int[] ArrX = {x + 35, x + 45, x + 45};
        int[] ArrY = {y + 5, y, y + 10};
        Polygon fish = new Polygon(ArrX, ArrY, 3);
        gr.drawPolygon(fish);
        gr.setColor(Color.MAGENTA);
        gr.fillOval(x, y, 35, 10);
        gr.fillPolygon(fish);
        gr.setColor(Color.BLACK);
        gr.drawLine(x +9, y+4, x+9, y+4);
    }
}