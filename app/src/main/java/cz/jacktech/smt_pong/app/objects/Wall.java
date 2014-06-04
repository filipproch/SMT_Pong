package cz.jacktech.smt_pong.app.objects;

import android.graphics.Color;

import cz.jacktech.smt_pong.app.framework.Graphics;

/**
 * Created by mhubata on 28.5.14.
 */
public class Wall extends Reflector{
    public Wall (int w,int h){
        this.x=w-40;
        this.y=0;
        this.w=40;
        this.h=h;
    }
    public void paint(float delta,Graphics g){
        g.drawRect(x,y,w,h,Color.RED);
    }
}
