package cz.jacktech.smt_pong.app;

import android.os.Bundle;

import cz.jacktech.smt_pong.app.framework.Screen;
import cz.jacktech.smt_pong.app.framework.implementation.AndroidGame;


public class PongActivity extends AndroidGame {

    @Override
    public Screen getInitScreen() {
        return null;
    }

    @Override
    public void onBackPressed() {
        getCurrentScreen().backButton();
    }

}
