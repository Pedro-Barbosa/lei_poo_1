package lib.menu;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.function.Consumer;
import javafx.scene.layout.Border;
import javafx.util.Pair;
import javax.swing.JPanel;
import lib.enums.MenuOption;
import lib.general.GameObject;

/**
 *******************************
 * Implemented by Paulo Pereira
 *******************************
 */

public class MainMenu extends JPanel {
   
    private ArrayList<Pair<MenuOption, GameObject>> menuOptions;
    
    /**
     *
     * @see Construtor da classe MainMenu passando uma posição, uma largura e uma altura.
     * @param x
     * @param y
     * @param width
     * @param height
     */
    public MainMenu(int x, int y, int width, int height) {
        initComponents(x, y, width, height);
    }

    /**
     * @see Construtor por defeito da classe MainMenu
     */
    public MainMenu() {
        this(0, 0, 500, 500);
    }
    
    private void initComponents(int x, int y, int width, int height) {
        this.menuOptions = new ArrayList<>();
        this.setBounds(x, y, width, height);
        this.setBackground(Color.red);
        
        addMenuOption(MenuOption.START, new GameObject("res/images/player.png"));
        addMenuOption(MenuOption.EDITOR, new GameObject("res/images/player.png"));
        addMenuOption(MenuOption.ABOUT, new GameObject("res/images/player.png"));
        addMenuOption(MenuOption.QUIT, new GameObject("res/images/player.png"));
    }
    
    private void addMenuOption(MenuOption type, GameObject obj) {
        menuOptions.add(new Pair(type, obj));
        this.add(obj);
    }
    
    /**
     *
     * @see Método utilizado para adicionar comportamentos ao clique nas opções do menu
     * @param type - Tipo de opção
     * @param toDo - Comportamento a efetuar
     */
    public void addClickListener(MenuOption type, Consumer<MenuOption> toDo) {
        GameObject obj = new GameObject();
        switch(type) {
            case START:
                obj = menuOptions.get(0).getValue();
                break;
            case EDITOR:
                obj = menuOptions.get(1).getValue();
                break;
            case ABOUT:
                obj = menuOptions.get(2).getValue();
                break;
            case QUIT:
                obj = menuOptions.get(3).getValue();
                break;
        }
        
        
        obj.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                toDo.accept(type);
            }

            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });
    }
}
