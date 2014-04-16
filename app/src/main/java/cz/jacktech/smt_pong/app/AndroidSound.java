package cz.jacktech.smt_pong.app;

import android.media.SoundPool;

import cz.jacktech.smt_pong.app.framework.Sound;

/**
 * Created by toor on 16.4.14.
 */
public class AndroidSound implements Sound {
    int soundId;
    SoundPool soundPool;

    public AndroidSound(SoundPool soundPool, int soundId) {
        this.soundId = soundId;
        this.soundPool = soundPool;
    }

    @Override
    public void play(float volume) {
        soundPool.play(soundId, volume, volume, 0, 0, 1);
    }

    @Override
    public void dispose() {
        soundPool.unload(soundId);
    }

}