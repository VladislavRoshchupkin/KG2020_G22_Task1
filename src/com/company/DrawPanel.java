package com.company;

import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel {
    public static void Submarine(Graphics2D gr) {
        gr.setColor(Color.YELLOW);
        gr.fillOval(150, 250, 500, 220);
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawOval(150, 250, 500, 220);
    }
        public static void windShield(Graphics2D gr){
        gr.setColor(Color.BLACK);
        gr.setStroke(new BasicStroke(3.0f));
        gr.drawLine(519, 277, 519, 443);
        gr.setStroke(new BasicStroke(5.0f));
        gr.drawArc(395, 275, 250, 170, 270, 180);
        gr.setColor(Color.WHITE);
        gr.fillArc(395, 275, 250, 170, 270, 180);
        }

    public static void Name(Graphics2D gr) {
        gr.setColor(Color.ORANGE);
        gr.setFont(new Font("Arial", Font.BOLD, 35));
        gr.drawString("Комсомолец", 220, 410);
    }
    public static void tube(Graphics2D gr) {
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
    public static void propeller(Graphics2D gr) {
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
    public static void flashlight(Graphics2D gr) {
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
    public static void backGround(Graphics2D gr, int width, int height) {
        gr.setColor(Color.BLUE);
        gr.fillRect(0, 220, width, 600);
        gr.setColor(Color.CYAN);
        gr.fillRect(0, 0, width, 220);
    }
    public static void drawWindows(Graphics2D gr) {
        gr.setStroke(new BasicStroke(3.0f));
        for (int i = 200; i < 401; i += 100) {
            gr.setColor(Color.WHITE);
            gr.fillOval(i, 320, 50, 50);
            gr.setColor(Color.BLACK);
            gr.drawOval(i, 320, 50, 50);
        }
    }
    public static void drawOneFish(Graphics2D gr, int x, int y) {
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
    public static int getRandom(int to) {
        int from = 1;
        return from + (int) (Math.random() * to);
    }
    public static void drawFish(Graphics2D gr, int width, int height) {
        for (int i = 10; i < width ; i += 80 + getRandom(150)) {
            for (int j = 240; j <  width; j += 56 + getRandom(150)) {
                drawOneFish(gr, i, j);
            }
        }
    }
    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        backGround(gr, getWidth(),getHeight());
        drawFish(gr,getWidth(),getHeight());
        Submarine(gr);
        drawWindows(gr);
        flashlight(gr);
        propeller(gr);
        tube(gr);
        Name(gr);
        windShield(gr);
    }

}