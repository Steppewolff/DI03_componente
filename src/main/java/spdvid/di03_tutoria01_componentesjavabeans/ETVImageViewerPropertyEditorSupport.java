package spdvid.di03_tutoria01_componentesjavabeans;

import java.awt.Component;
import java.beans.PropertyEditorSupport;
import java.io.File;

/**
 *
 * @author Fer
 */
public class ETVImageViewerPropertyEditorSupport extends PropertyEditorSupport{
    private SelectFotosJPanel selectFotosJPanel = new SelectFotosJPanel();
    @Override
    public boolean supportsCustomEditor() {
        return true;
    }

    @Override
    public Component getCustomEditor() {
        return selectFotosJPanel;
    }

    @Override
    public String getJavaInitializationString() {
        SelectFotos selectFotos = selectFotosJPanel.getSelectedFotos();
        
        File[] images = selectFotos.getFotos();
        String path = "";
        for (int i = 0; i < images.length; i++){
//            path += "\"" + images[i].getAbsolutePath() + "\",";
            path += "new File(\"" + images[i].getAbsolutePath() + "\"),";
        }
//hacerlo aqui, en cada bucle del path, un new io.File("path")        
        path = (path.substring(0, path.length()-1));
        path = path.replace('\\', '/');
//        return "new spdvid.di03_tutoria01_componentesjavabeans.SelectFotos("+"new java.io.File[]{" + path + "}";
        return "new spdvid.di03_tutoria01_componentesjavabeans.SelectFotos("+"new java.io.File[]{" + path + "})";
    }
//declarar los objetos dentro del string? new java.io.File[]{new(java.io.File(""))" + 
    @Override
    public Object getValue() {
        return selectFotosJPanel.getSelectedFotos();
    }
    
    
}
