package cz.jacktech.smt_pong.app.objects;

import android.graphics.Color;

import cz.jacktech.smt_pong.app.framework.Graphics;

/**
 * Created by mhubata on 29.5.14.
 */
public class Ball extends Reflector {
    public int addx=2;
    public int addy=2;

    public Ball(int w, int h){
        this.x=w/2-10;
        this.y=h/2-10;
        this.w=20;
        this.h=20;}
    public void update(float delta){
        this.x+=delta*addx;
        this.y+=delta*addy;}
    public void switchx(){
        addx=-addx;}
    public void switchy(){
        addy=-addy;}

    public void paint(float deltaTime, Graphics graphics) {
        graphics.drawRect(x,y,w,h, Color.WHITE);
    }

    public void reset(int w, int h) {
        this.x=w/2-10;
        this.y=h/2-10;
    }
}