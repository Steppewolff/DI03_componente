package spdvid.di03_tutoria01_componentesjavabeans;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import spdvid.di03_tutoria01_componentesjavabeans.SelectFotos;

/**
 *
 * @author Fer
 */
public class ETVImageViewerDI03 extends JPanel implements Serializable,ActionListener {
    private SelectFotos selectFotos;
    private File[] fotos;
    private File imagen;
    private int fotoActiva;
    private int n;
    private boolean modo;

    public ETVImageViewerDI03() {
        fotoActiva = 0;
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

    public int getFotoActiva() {
        return fotoActiva;
    }

    public void setFotoActiva(int fotoActiva) {
        this.fotoActiva = fotoActiva;
    }
    
    public void prevImage(){
        if (this.selectFotos != null){
            this.fotos = selectFotos.getFotos();
            if (this.fotoActiva == 0){
                this.fotoActiva = this.fotos.length-1;
            }else{
                this.fotoActiva -= 1;
            }
            this.imagen = this.fotos[this.fotoActiva];
        }
    }

    public void nextImage(){
        if (this.selectFotos != null){
            this.fotos = selectFotos.getFotos();
            if (this.fotoActiva == this.fotos.length-1){
                this.fotoActiva = 0;
            }else{
                this.fotoActiva += 1;
            }
            this.imagen = this.fotos[this.fotoActiva];
        }
    }
    
    public void timerFoto(){
        
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        if (selectFotos != null){
            fotos = selectFotos.getFotos();
            imagen = fotos[0];
        }
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
//        if (selectFotos != null){
//            fotos = selectFotos.getFotos();
//            imagen = fotos[0];
            if(imagen != null && imagen.exists()){
                ImageIcon imageIcon = new ImageIcon (imagen.getAbsolutePath());
                g.drawImage(imageIcon.getImage(), 0, 0, null);
    //        g.drawImage(imageIcon.getImage(), 0, 0, WIDTH, HEIGHT, this)
            }
        }
//    }
}
