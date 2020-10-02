package com.company;

import java.awt.*;
import java.util.ArrayList;


public class Shoal implements Drawable {
    public static int getRandom(int to) {
        int from = 1;
        return from + (int) (Math.random() * to);
    }
    private int width;
    private int height;
    private ArrayList<OneFish> fishes = new ArrayList<>();
    public Shoal(int width, int height) {
        this.width = width;
        this.height = height;
        for (int i = 10; i < width ; i += 80 + getRandom(150)) {
            for (int j = 240; j <  height; j += 56 + getRandom(150)) {
                fishes.add(new OneFish(i, j, width, height));
            }
        }
    }
    @Override
    public void draw(Graphics2D gr, int width, int height) {
        for(int i = 0; i < fishes.size(); i++){
            fishes.get(i).draw(gr, width, height);
        }
    }
}
