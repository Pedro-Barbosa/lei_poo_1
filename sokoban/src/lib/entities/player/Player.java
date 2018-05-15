package lib.entities.player;

import java.util.ArrayList;
import lib.behaviour.CollidableEntity;
import lib.behaviour.MovableEntity;
import lib.general.GameObject;
import lib.general.MovableObject;
import lib.states.GameState;
import main.Game;

public class Player extends MovableObject implements CollidableEntity, MovableEntity {

    private int initialX;
    private int initialY;

    public Player() {
        setImage("res/images/player.png");
    }

    public int getInitialX() {
        return initialX;
    }

    public void setInitialX(int initialX) {
        this.initialX = initialX;
    }

    public int getInitialY() {
        return initialY;
    }

    public void setInitialY(int initialY) {
        this.initialY = initialY;
    }
    
    @Override
    public boolean isCollidingRight() {
        return false;
    }

    @Override
    public boolean isCollidingBottom() {
        return false;
    }

    @Override
    public boolean isCollidingLeft() {
        return false;
    }

    @Override
    public boolean isCollidingTop() {
        return false;
    }

    @Override
    public boolean isCollidingWith(GameObject obj) {
        return false;}

    @Override
    public boolean isCollidingWithAnything(ArrayList<GameObject> objs) {
        return false;
    }

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
