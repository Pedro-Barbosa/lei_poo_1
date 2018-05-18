package lib.behaviour;

public interface MovableEntity {

    /**
     * @see Método utilizado para movimentar uma entidade
     */
    void move();

    /**
     *
     * @see Método utilizado para movimentar uma entidade para uma posição específica
     * @param x
     * @param y
     */
    void move(int x, int y);
}
