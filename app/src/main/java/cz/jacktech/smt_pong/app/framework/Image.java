package cz.jacktech.smt_pong.app.framework;

import cz.jacktech.smt_pong.app.framework.Graphics.ImageFormat;

public interface Image {
    public int getWidth();
    public int getHeight();
    public ImageFormat getFormat();
    public void dispose();
}
