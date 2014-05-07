package cz.jacktech.smt_pong.app.framework.implementation;

import java.util.List;

import android.view.View.OnTouchListener;

import cz.jacktech.smt_pong.app.framework.Input.TouchEvent;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);
    
    public int getTouchX(int pointer);
    
    public int getTouchY(int pointer);
    
    public List<TouchEvent> getTouchEvents();
}
