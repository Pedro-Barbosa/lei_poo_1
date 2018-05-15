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

    public void setName(String name) {
        this.mapName = name;
    }
    
    public String getName() {
        return this.mapName;
    }
    
    public void setMusic(String url) {
        mapMusic = new AudioClip(url);
    }
    
    public void setBackground(String url) {
        backgroundImage = new GameObject(url);
    }
    
    public void addObject(GameObject obj) {
        
    }
    
    public void removeObject(GameObject obj) {
        
    }
    
}
