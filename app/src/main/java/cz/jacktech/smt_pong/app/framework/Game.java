package cz.jacktech.smt_pong.app.framework;

/**
 * Created by toor on 16.4.14.
 */
public interface Game {

    public Audio getAudio();

    public Input getInput();

    public FileIO getFileIO();

    public Graphics getGraphics();

    public void setScreen(Screen screen);

    public Screen getCurrentScreen();

    public Screen getInitScreen();
}