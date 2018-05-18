package lib.general;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class GameObject extends JLabel {
    
    /**
     *
     * @see Construtor da classe GameObject com uma imagem, definindo uma largura e altura específica.
     * @param imgUrl - Diretório da imagem
     * @param width - Largura da imagem
     * @param height - Altura da imagem
     */
    public GameObject(String imgUrl, int width, int height) {
        initComponents(imgUrl, width, height);
    }
    
    /**
     *
     * @see Construtor da classe GameObject com uma imagem
     * @param imgUrl - Diretório da imagem
     */
    public GameObject(String imgUrl) {
        initComponents(imgUrl);
    }
    
    /**
     * @see Construtor por defeito da classe GameObject
     */
    public GameObject() {
        initComponents();
    }
    
    
    private void initComponents() {
        this.setText(null);
    }
    
    private void initComponents(String imgUrl) {
        this.setText(null);
        this.setImage(imgUrl);
    }
    
    private void initComponents(String imgUrl, int width, int height) {
        this.setText(null);
        this.setImage(imgUrl, width, height);
    }
    
    /**
     *
     * @see Método utilizado para definir uma imagem.
     * @param url - Diretório da imagem
     */
    public void setImage(String url) {
        ImageIcon image = getImageIcon(url);
        this.setIcon(image);
    }
    
    /**
     *
     * @see Método utilizado para definir uma imagem com uma largura e altura específica.
     * @param url - Diretório da imagem
     * @param width - Largura da imagem
     * @param height - Altura da imagem
     */
    public void setImage(String url, int width, int height) {
        ImageIcon image = getImageIcon(url);
        Image scaledImg = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        image = new ImageIcon(scaledImg);
        this.setIcon(image);
    }
    
    private ImageIcon getImageIcon(String url) {
        ImageIcon image;
        if(url.isEmpty()) {
            image = new ImageIcon();
        } else {
            image = new ImageIcon(getClass().getClassLoader().getResource(url));
        }
        return image;
    }
}
