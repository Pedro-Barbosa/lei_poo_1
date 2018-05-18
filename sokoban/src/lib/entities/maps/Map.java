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
     * Utilizado para definir um nome de um mapa
     * @param name - Nome do mapa
     */
    public void setName(String name) {
        this.mapName = name;
    }
    
    /**
     *
     * Utilizado para obter o nome do mapa
     * @return Nome do Mapa
     */
    public String getName() {
        return this.mapName;
    }
    
    /**
     *
     * Utilizado para adicionar uma música de fundo ao mapa
     * @param url - Diretório do clip de música
     */
    public void setMusic(String url) {
        mapMusic = new AudioClip(url);
    }
    
    /**
     *
     * Utilizado para adicionar uma imagem de fundo ao mapa
     * @param url - Diretório da imagem de fundo
     */
    public void setBackground(String url) {
        backgroundImage = new GameObject(url);
    }
    
    /**
     *
     * Utilizado para adicionar objetos ao mapa
     * @param obj - Objeto a adicionar ao mapa
     */
    public void addObject(GameObject obj) {
        
    }
    
    /**
     * Utilizado para remover objetos do mapa
     * @param obj - Objeto a remover do mapa
     */
    public void removeObject(GameObject obj) {
        
    }
    
}
