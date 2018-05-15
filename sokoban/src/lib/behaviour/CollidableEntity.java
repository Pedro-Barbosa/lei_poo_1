/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.behaviour;

import java.util.ArrayList;
import lib.general.GameObject;

/**
 *
 * @author 6100353
 */
public interface CollidableEntity {
    boolean isCollidingRight();
    boolean isCollidingBottom();
    boolean isCollidingLeft();
    boolean isCollidingTop();
    boolean isCollidingWith(GameObject obj);
    boolean isCollidingWithAnything(ArrayList<GameObject> objs);
}
