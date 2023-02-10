package spdvid.di03_tutoria01_componentesjavabeans;

import java.awt.Graphics;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Fer
 */
public class SelectFotosJPanel extends javax.swing.JPanel {
    public File[] arrayFotos;
    private File imagen;
    /**
     * Creates new form SelectFotosJPanel
     */
    public SelectFotosJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRuta = new javax.swing.JLabel();
        txtRuta = new javax.swing.JTextField();
        btnSeleccionarRuta = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        jblDebug = new javax.swing.JLabel();

        setLayout(null);

        lblRuta.setText("Ruta imágenes");
        add(lblRuta);
        lblRuta.setBounds(17, 18, 90, 16);
        add(txtRuta);
        txtRuta.setBounds(20, 40, 340, 30);

        btnSeleccionarRuta.setText("...");
        btnSeleccionarRuta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarRutaActionPerformed(evt);
            }
        });
        add(btnSeleccionarRuta);
        btnSeleccionarRuta.setBounds(150, 90, 23, 23);
        add(lblError);
        lblError.setBounds(20, 120, 330, 30);
        add(jblDebug);
        jblDebug.setBounds(80, 330, 320, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeleccionarRutaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarRutaActionPerformed
        JFileChooser fc = new JFileChooser();
        fc.setMultiSelectionEnabled(true);
        
        int resultado = fc.showOpenDialog(this);
        if (resultado == JFileChooser.APPROVE_OPTION){
            File[] fileArray = fc.getSelectedFiles();
            arrayFotos = fileArray;
            String fileNames = "";
            for (File file : fileArray){
                fileNames += file.getName() + "; ";
//                FilePath[index++]=(file.getAbsolutePath());
            }
//            txtRuta.setText("Se han adjuntado " + fileArray.length + " fotografías: " + fileNames);//guarda el path uno encima de otro, cambiar para que escriba una linea cada vez
            txtRuta.setText("Se han adjuntado " + fileArray.length + " fotografías: ");//guarda el path uno encima de otro, cambiar para que escriba una linea cada vez
            imagen = arrayFotos[0];
        }
        else{
            lblError.setText("Ha ocurrido un error al sellecionar los archivos");
        }
    }//GEN-LAST:event_btnSeleccionarRutaActionPerformed
    
    public SelectFotos getSelectedFotos(){
        SelectFotos deliverFotos = new SelectFotos(arrayFotos);
        return deliverFotos;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSeleccionarRuta;
    private javax.swing.JLabel jblDebug;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblRuta;
    private javax.swing.JTextField txtRuta;
    // End of variables declaration//GEN-END:variables
}