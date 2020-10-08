package com.company;

import javax.swing.*;
import java.awt.*;
public class DrawPanel extends JPanel {
    private Body body;
    private WindShield windShield;
    private Name name;
    private Tube tube;
    private Propeller propeller;
    private Flashlight flashlight;
    private BackGround backGround;
    private DrawWindows drawWindows;
    private Shoal shoal;
    private int width = 1500;
    private int height = 800;

    public DrawPanel(){
        this.body= new Body(0.5, 0.63, 0.62, 0.38);
        this.windShield = new WindShield(width,height);
        this.name= new Name(0.32, 0.76, 0.1 ,0.1);
        this.tube = new Tube(0.48, 0.39, 0.025, 0.1);
        this.tube = new Tube(0.48, 0.30, 0.08, 0.05);
        this.propeller = new Propeller();
        this.flashlight = new Flashlight(width,height);
        this.backGround = new BackGround(width,height);
        this.drawWindows = new DrawWindows(width,height);
        this.shoal = new Shoal(width,height);
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        backGround.draw(gr, getWidth(), getHeight());
        shoal.draw(gr, getWidth(), getHeight());
        body.draw(gr, getWidth(), getHeight());
        drawWindows.draw(gr, getWidth(), getHeight());
        flashlight.draw(gr, getWidth(), getHeight());
        name.draw(gr, getWidth(), getHeight());
        propeller.draw(gr, getWidth(), getHeight());
        tube.draw(gr, getWidth(), getHeight());
        windShield.draw(gr, getWidth(), getHeight());

    }
}