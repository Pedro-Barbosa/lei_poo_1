package lib.behaviour;

import java.util.ArrayList;
import lib.general.GameObject;

public interface CollidableEntity {

    /**
     *
     * @see Método utilizado para verificar colisão com algum objeto à direita
     * @return Se o objeto está a colidir com alguma coisa à direita
     */
    boolean isCollidingRight();

    /**
     *
     * @see Método utilizado para verificar colisão com algum objeto por baixo
     * @return Se o objeto está a colidir com alguma coisa em baixo
     */
    boolean isCollidingBottom();

    /**
     *
     * @see Método utilizado para verificar colisão com algum objeto à esquerda
     * @return Se o objeto está a colidir com alguma coisa à esquerda
     */
    boolean isCollidingLeft();

    /**
     *
     * @see Método utilizado para verificar colisão com algum objeto por cima
     * @return Se o objeto está a colidir com alguma coisa em cima
     */
    boolean isCollidingTop();

    /**
     *
     * @see Método utilizado para verificar colisão com um objeto
     * @param obj - Objeto com o qual se pretende testar a colisão
     * @return Se o objeto está a colidir com o objeto passado por argumento
     */
    boolean isCollidingWith(GameObject obj);

    /**
     *
     * @see Método utilizado para verificar colisão com qualquer objeto passado por argumento
     * @param objs - Objetos com o qual se pretende testar a colisão
     * @return Se o objeto está a colidir com algum dos objetos passados por argumento
     */
    boolean isCollidingWithAnything(ArrayList<GameObject> objs);
}
