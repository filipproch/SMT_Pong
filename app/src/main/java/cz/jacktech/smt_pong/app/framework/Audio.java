package cz.jacktech.smt_pong.app.framework;


public interface Audio {
    public Music createMusic(String file);

    public Sound createSound(String file);
}
