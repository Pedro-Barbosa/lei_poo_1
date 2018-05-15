package lib.general;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameObject extends JLabel {

    private int x;
    private int y;
    
    public GameObject() {
        initComponents();
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public GameObject(String imgUrl) {
        initComponents();
        this.setImage(imgUrl);
    }
    
    private void initComponents() {
        this.setText(null);
    }
    
    public void setImage(String url) {
        ImageIcon image = new ImageIcon(url);
        this.setIcon(image);
    }
    
}
