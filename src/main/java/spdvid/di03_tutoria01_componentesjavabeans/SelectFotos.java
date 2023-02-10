package spdvid.di03_tutoria01_componentesjavabeans;

import java.io.File;
import java.io.Serializable;

/**
 *
 * @author Fer
 */
public class SelectFotos implements Serializable{
    private File[] fotos;

    public SelectFotos() {
    }
    
    public SelectFotos(File[] fotos) {
        this.fotos = fotos;
    }

    public File[] getFotos() {
        return fotos;
    }

    public void setFotos(File[] fotos) {
        this.fotos = fotos;
    }
    

}
