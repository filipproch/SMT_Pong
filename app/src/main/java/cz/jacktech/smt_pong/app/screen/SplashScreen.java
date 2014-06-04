package cz.jacktech.smt_pong.app.screen;

import android.graphics.Color;
import android.graphics.Paint;

import cz.jacktech.smt_pong.app.framework.Game;
import cz.jacktech.smt_pong.app.framework.Graphics;
import cz.jacktech.smt_pong.app.framework.Screen;

/**
 * Created by toor on 7.5.14.
 */
public class SplashScreen extends Screen{

    public SplashScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        game.setScreen(new GameScreen(game));

    }

    @Override
    public void paint(float deltaTime) {
        Graphics g=game.getGraphics();
        Paint p=new Paint();
        p.setColor(Color.WHITE);
        g.drawString("pong",0,0,p);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }

    @Override
    public void backButton() {

    }

}
