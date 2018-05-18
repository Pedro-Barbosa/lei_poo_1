package lib.behaviour;

public interface MovableEntity {

    /**
     * Utilizado para movimentar uma entidade
     */
    void move();

    /**
     *
     * Utilizado para movimentar uma entidade para uma posição específica
     * @param x
     * @param y
     */
    void move(int x, int y);
}
