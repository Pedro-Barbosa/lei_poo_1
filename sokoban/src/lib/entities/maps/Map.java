package lib.entities.maps;

import java.util.ArrayList;
import javafx.scene.media.AudioClip;
import lib.general.GameObject;


public class Map {
    
    private ArrayList<GameObject> mapObjects;
    private AudioClip mapMusic;
    private GameObject backgroundImage;
    private String mapName;
    private int mapIdentification;

    /**
     * @see Método utilizado para definir um nome de um mapa
     * @param name - Nome do mapa
     */
    public void setName(String name) {
        this.mapName = name;
    }
    
    /**
     *
     * @see Método utilizado para obter o nome do mapa
     * @return Nome do Mapa
     */
    public String getName() {
        return this.mapName;
    }
    
    /**
     *
     * @see Método utilizado para adicionar uma música de fundo ao mapa
     * @param url - Diretório do clip de música
     */
    public void setMusic(String url) {
        mapMusic = new AudioClip(url);
    }
    
    /**
     *
     * @see Método utilizado para adicionar uma imagem de fundo ao mapa
     * @param url - Diretório da imagem de fundo
     */
    public void setBackground(String url) {
        backgroundImage = new GameObject(url);
    }
    
    /**
     *
     * @see Método utilizado para adicionar objetos ao mapa
     * @param obj - Objeto a adicionar ao mapa
     */
    public void addObject(GameObject obj) {
        
    }
    
    /**
     * @see Método utilizado para remover objetos do mapa
     * @param obj - Objeto a remover do mapa
     */
    public void removeObject(GameObject obj) {
        
    }
    
}
