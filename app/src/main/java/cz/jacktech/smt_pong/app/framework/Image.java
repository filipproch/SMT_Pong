package cz.jacktech.smt_pong.app.framework;

/**
 * Created by toor on 16.4.14.
 */
public interface Image {
    public int getWidth();
    public int getHeight();
    public Graphics.ImageFormat getFormat();
    public void dispose();
}