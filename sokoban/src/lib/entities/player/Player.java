package lib.entities.player;

import java.util.ArrayList;
import lib.behaviour.CollidableEntity;
import lib.behaviour.MovableEntity;
import lib.general.GameObject;
import lib.general.MovableObject;
import lib.enums.GameState;
import main.Game;


public class Player extends MovableObject implements CollidableEntity, MovableEntity {

    private int initialX;
    private int initialY;

    /**
     *
     */
    public Player() {
        setImage("res/images/player.png");
    }

    /**
     *
     * @return
     */
    public int getInitialX() {
        return initialX;
    }

    /**
     *
     * @param initialX
     */
    public void setInitialX(int initialX) {
        this.initialX = initialX;
    }

    /**
     *
     * @return
     */
    public int getInitialY() {
        return initialY;
    }

    /**
     *
     * @param initialY
     */
    public void setInitialY(int initialY) {
        this.initialY = initialY;
    }
    
    /**
     *
     * @return
     */
    @Override
    public boolean isCollidingRight() {
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isCollidingBottom() {
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isCollidingLeft() {
        return false;
    }

    /**
     *
     * @return
     */
    @Override
    public boolean isCollidingTop() {
        return false;
    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean isCollidingWith(GameObject obj) {
        return false;}

    /**
     *
     * @param objs
     * @return
     */
    @Override
    public boolean isCollidingWithAnything(ArrayList<GameObject> objs) {
        return false;
    }

    /**
     *
     */
    @Override
    public void move() {
    
    }

    @Override
    public void move(int x, int y) {}
    
    @Override
    public void run() {
        while(Game.gameState == GameState.RUNNING) {
            move();
        }
    }

}
