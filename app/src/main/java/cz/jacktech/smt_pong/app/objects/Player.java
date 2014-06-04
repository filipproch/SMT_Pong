package cz.jacktech.smt_pong.app.objects;

import android.graphics.Color;

import java.util.List;

import cz.jacktech.smt_pong.app.framework.Graphics;
import cz.jacktech.smt_pong.app.framework.Input;

/**
 * Created by mhubata on 28.5.14.
 */
public class Player extends Reflector {
    public int life=3;
    public Player (int h){
        this.x=0;
        this.y=h/2-50;
        this.w=20;
        this.h=100;
    }
    public void paint(float delta,Graphics g){
        g.drawRect(x,y,w,h, Color.RED);

    }
    public boolean die(int h){
        this.y=h/2-50;
        life--;
        return life>0;
    }

    public void update(float deltaTime, Input input) {
        List<Input.TouchEvent> events=input.getTouchEvents();
        for(int i=0;i<events.size();i++){
            if(events.get(i).type== Input.TouchEvent.TOUCH_DRAGGED);
            this.y=events.get(i).y-50;
        }
    }
}
