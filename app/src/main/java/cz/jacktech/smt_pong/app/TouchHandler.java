package cz.jacktech.smt_pong.app;

/**
 * Created by toor on 16.4.14.
 */
import java.util.List;

import android.view.View.OnTouchListener;

import cz.jacktech.smt_pong.app.framework.Input;

public interface TouchHandler extends OnTouchListener {
    public boolean isTouchDown(int pointer);

    public int getTouchX(int pointer);

    public int getTouchY(int pointer);

    public List<Input.TouchEvent> getTouchEvents();
}
