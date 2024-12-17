/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vistaSpaceInvasionDani;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Clase vista principal de mi programa Space Invasion Dani
 * @author Dani Angona
 */
public class PrincipalSpaceInvasionDani extends javax.swing.JFrame {

    /**
     * Creates new form PrincipalSpaceInvasionDani
     */
    public PrincipalSpaceInvasionDani() {
        System.out.println("LLamo a PrincipalSpaceInvasionDani");
        initComponents();
        this.setSize(470,400);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelMenu = new javax.swing.JPanel();
        jButtonNuevaPartida = new javax.swing.JButton();
        jButtonNivel = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jMenuBarHerramientas = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemVerAyuda = new javax.swing.JMenuItem();
        jMenuOpciones = new javax.swing.JMenu();
        jMenuItemPartida = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Space Invasion Dani");

        jPanelMenu.setLayout(new java.awt.GridBagLayout());

        jButtonNuevaPartida.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonNuevaPartida.setText("NUEVA PARTIDA");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelMenu.add(jButtonNuevaPartida, gridBagConstraints);

        jButtonNivel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonNivel.setText("NIVEL");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelMenu.add(jButtonNivel, gridBagConstraints);

        jButtonSalir.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonSalir.setText("SALIR");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelMenu.add(jButtonSalir, gridBagConstraints);

        getContentPane().add(jPanelMenu, java.awt.BorderLayout.CENTER);

        jMenuAyuda.setText("Ayuda");

        jMenuItemVerAyuda.setText("Ver la ayuda");
        jMenuAyuda.add(jMenuItemVerAyuda);

        jMenuBarHerramientas.add(jMenuAyuda);

        jMenuOpciones.setText("Opciones");

        jMenuItemPartida.setText("Partida");
        jMenuOpciones.add(jMenuItemPartida);

        jMenuBarHerramientas.add(jMenuOpciones);

        setJMenuBar(jMenuBarHerramientas);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNivel;
    private javax.swing.JButton jButtonNuevaPartida;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBarHerramientas;
    private javax.swing.JMenuItem jMenuItemPartida;
    private javax.swing.JMenuItem jMenuItemVerAyuda;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JPanel jPanelMenu;
    // End of variables declaration//GEN-END:variables
    
    public void menuItemVerAyuda(ActionListener l){
        jMenuItemVerAyuda.addActionListener(l);
    }
    
    public void jDialogNuevaPartida(ActionListener l){
        jButtonNuevaPartida.addActionListener(l);
    }
    
    public void jDialogNivel(ActionListener l){
        jButtonNivel.addActionListener(l);
    }
    
    public void jDialogSalir(ActionListener l){
        jButtonSalir.addActionListener(l);
    }
    
    public void mensajeVerAyuda(String mensajeSalir){
        JOptionPane.showMessageDialog(null, mensajeSalir, null, JOptionPane.WARNING_MESSAGE);
    }
}