/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.entities.player;

import java.util.ArrayList;
import lib.behaviour.CollidableEntity;
import lib.behaviour.MovableEntity;
import lib.general.GameObject;
import lib.general.MovableObject;

/**
 *
 * @author 6100353
 */
public class Player extends MovableObject implements CollidableEntity, MovableEntity {

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
    public void move() {}

    @Override
    public void move(int x, int y) {}

    @Override
    public void run() {}
    
}
