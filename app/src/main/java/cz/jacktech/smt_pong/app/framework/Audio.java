package cz.jacktech.smt_pong.app.framework;

/**
 * Created by toor on 16.4.14.
 */
public interface Audio {
    public Music createMusic(String file);

    public Sound createSound(String file);
}
