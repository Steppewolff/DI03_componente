package spdvid.di03_tutoria01_componentesjavabeans;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import spdvid.di03_tutoria01_componentesjavabeans.SelectFotos;

/**
 *
 * @author Fer
 */
public class ETVImageViewerDI03 extends JPanel implements Serializable{
    private SelectFotos selectFotos;
    private File[] fotos;
    private File imagen;
    private int n;
    private boolean modo;

    public ETVImageViewerDI03() {
    }

    public SelectFotos getSelectFotos() {
        return selectFotos;
    }

    public void setSelectFotos(SelectFotos selectFotos) {
        this.selectFotos = selectFotos;
    }



    public File[] getFotos() {
        return fotos;
    }

    public void setFotos(File[] fotos) {
        this.fotos = fotos;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public boolean isModo() {
        return modo;
    }

    public void setModo(boolean modo) {
        this.modo = modo;
    }

    public File getImagen() {
        return imagen;
    }

    public void setImagen(File imagen) {
        this.imagen = imagen;
    }
    
    public void prevImage(){
        
    }

    public void nextImage(){
        
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (selectFotos != null){
            fotos = selectFotos.getFotos();
            imagen = fotos[0];
            if(imagen != null && imagen.exists()){
                ImageIcon imageIcon = new ImageIcon (imagen.getAbsolutePath());
                g.drawImage(imageIcon.getImage(), 0, 0, null);
    //        g.drawImage(imageIcon.getImage(), 0, 0, WIDTH, HEIGHT, this)
            }
        }
    }
}
