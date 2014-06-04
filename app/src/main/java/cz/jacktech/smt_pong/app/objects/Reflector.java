package cz.jacktech.smt_pong.app.objects;

import android.util.Log;

/**
 * Created by mhubata on 28.5.14.
 */
public class Reflector {
    public static String TAG = Reflector.class.getSimpleName();
    public int x,y,w,h;
    public boolean hit(Reflector reflector){
        return (reflector.x < x+w && x< reflector.x + reflector.w && reflector.y < y+h && y < reflector.y+reflector.h);
    }

    @Override
    public String toString() {
        return "["+x+","+y+","+w+","+h+"]";
    }
}
