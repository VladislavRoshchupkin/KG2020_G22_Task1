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
        this.body= new Body(width,height);
        this.windShield = new WindShield(width,height);
        this.name= new Name(width,height);
        this.tube = new Tube(width,height);
        this.propeller = new Propeller(width,height);
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