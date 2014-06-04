package cz.jacktech.smt_pong.app.screen;

import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import cz.jacktech.smt_pong.app.framework.Game;
import cz.jacktech.smt_pong.app.framework.Screen;
import cz.jacktech.smt_pong.app.objects.Ball;
import cz.jacktech.smt_pong.app.objects.Player;
import cz.jacktech.smt_pong.app.objects.Wall;

/**
 * Created by toor on 7.5.14.
 */
public class GameScreen extends Screen {

    public static String TAG = GameScreen.class.getSimpleName();

    private Ball ball;
    private Player player;
    private Wall wall;

    public GameScreen(Game game) {
        super(game);
        ball=new Ball(game.getGraphics().getWidth(),game.getGraphics().getHeight());
        player=new Player(game.getGraphics().getHeight());
        wall=new Wall(game.getGraphics().getWidth(),game.getGraphics().getHeight());
    }


    @Override
    public void update(float deltaTime) {
        ball.update(deltaTime);
        player.update(deltaTime,game.getInput());

        if(ball.addx > 0 && ball.hit(wall))
            ball.switchx();
        if(ball.addx < 0 && ball.hit(player))
            ball.switchx();

        if(ball.addx < 0 && ball.x <= 0){
            ball.reset(game.getGraphics().getWidth(),game.getGraphics().getHeight());
            player.die(game.getGraphics().getHeight());
        }
        if(ball.y <= 0 && ball.addy < 0)
            ball.switchy();
        if(ball.y >= game.getGraphics().getHeight() && ball.addy > 0)
            ball.switchy();
    }

    @Override
    public void paint(float deltaTime) {
        game.getGraphics().drawARGB(155, 0, 0, 0);

        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        game.getGraphics().drawString(player.life+"", game.getGraphics().getWidth()/2, game.getGraphics().getHeight()/2,paint);

        player.paint(deltaTime,game.getGraphics());
        wall.paint(deltaTime,game.getGraphics());
        ball.paint(deltaTime,game.getGraphics());

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
