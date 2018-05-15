package lib.behaviour;

import java.util.ArrayList;
import lib.general.GameObject;

public interface CollidableEntity {
    boolean isCollidingRight();
    boolean isCollidingBottom();
    boolean isCollidingLeft();
    boolean isCollidingTop();
    boolean isCollidingWith(GameObject obj);
    boolean isCollidingWithAnything(ArrayList<GameObject> objs);
}
