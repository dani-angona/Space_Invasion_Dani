/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vistaSpaceInvasionDani;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 * Clase JDialog Nivel de mi programa Space Invasion Dani
 * @author Dani Angona
 */
public class NivelSpaceInvasionDani extends javax.swing.JDialog {
    private String nombreJugador;
    private String nivelSeleccionado;
    
    /**
     * Constructor de la clase NivelSpaceInvasionDani
     * Creates new form JDialogSpaceInvasionDani
     */
    public NivelSpaceInvasionDani(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setResizable(false);
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

        GrupoBotonesNivel = new javax.swing.ButtonGroup();
        jPanelLabel = new javax.swing.JPanel();
        jLabelSeleccionaNivelJuego = new javax.swing.JLabel();
        jPanelNiveles = new javax.swing.JPanel();
        jRadioButtonPrincipiante = new javax.swing.JRadioButton();
        jRadioButtonIntermedio = new javax.swing.JRadioButton();
        jRadioButtonAvanzado = new javax.swing.JRadioButton();
        jPanelGuardarNivel = new javax.swing.JPanel();
        jLabelNombreJugador = new javax.swing.JLabel();
        jTextFieldNombreJugador = new javax.swing.JTextField();
        jButtonGuardarNivel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Space Invasion Dani: Nivel");

        jLabelSeleccionaNivelJuego.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabelSeleccionaNivelJuego.setText("SELECCIONA EL NIVEL DEL JUEGO");
        jPanelLabel.add(jLabelSeleccionaNivelJuego);

        getContentPane().add(jPanelLabel, java.awt.BorderLayout.PAGE_START);

        jPanelNiveles.setLayout(new java.awt.GridBagLayout());

        GrupoBotonesNivel.add(jRadioButtonPrincipiante);
        jRadioButtonPrincipiante.setText("PRINCIPIANTE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelNiveles.add(jRadioButtonPrincipiante, gridBagConstraints);

        GrupoBotonesNivel.add(jRadioButtonIntermedio);
        jRadioButtonIntermedio.setText("INTERMEDIO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelNiveles.add(jRadioButtonIntermedio, gridBagConstraints);

        GrupoBotonesNivel.add(jRadioButtonAvanzado);
        jRadioButtonAvanzado.setText("AVANZADO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanelNiveles.add(jRadioButtonAvanzado, gridBagConstraints);

        getContentPane().add(jPanelNiveles, java.awt.BorderLayout.CENTER);

        jLabelNombreJugador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabelNombreJugador.setText("NOMBRE DEL JUGADOR");

        jTextFieldNombreJugador.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jButtonGuardarNivel.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButtonGuardarNivel.setText("GUARDAR");

        javax.swing.GroupLayout jPanelGuardarNivelLayout = new javax.swing.GroupLayout(jPanelGuardarNivel);
        jPanelGuardarNivel.setLayout(jPanelGuardarNivelLayout);
        jPanelGuardarNivelLayout.setHorizontalGroup(
            jPanelGuardarNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelGuardarNivelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabelNombreJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jTextFieldNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(jPanelGuardarNivelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jButtonGuardarNivel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelGuardarNivelLayout.setVerticalGroup(
            jPanelGuardarNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelGuardarNivelLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanelGuardarNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombreJugador)
                    .addComponent(jTextFieldNombreJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonGuardarNivel)
                .addGap(16, 16, 16))
        );

        getContentPane().add(jPanelGuardarNivel, java.awt.BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoBotonesNivel;
    private javax.swing.JButton jButtonGuardarNivel;
    private javax.swing.JLabel jLabelNombreJugador;
    private javax.swing.JLabel jLabelSeleccionaNivelJuego;
    private javax.swing.JPanel jPanelGuardarNivel;
    private javax.swing.JPanel jPanelLabel;
    private javax.swing.JPanel jPanelNiveles;
    private javax.swing.JRadioButton jRadioButtonAvanzado;
    private javax.swing.JRadioButton jRadioButtonIntermedio;
    private javax.swing.JRadioButton jRadioButtonPrincipiante;
    private javax.swing.JTextField jTextFieldNombreJugador;
    // End of variables declaration//GEN-END:variables

    /**
     * Método que añade un ActionListener al Button Principiante
     * @param l ActionListener
     */
    public void botonPrincipiante(ActionListener l){
        jRadioButtonPrincipiante.addActionListener(l);
    }
    
    /**
     * Método que añade un ActionListener al Button Intermedio
     * @param l ActionListener
     */
    public void botonIntermedio(ActionListener l){
        jRadioButtonIntermedio.addActionListener(l);
    }
    
    /**
     * Método que añade un ActionListener al Button Avanzado
     * @param l ActionListener
     */
    public void botonAvanzado(ActionListener l){
        jRadioButtonAvanzado.addActionListener(l);
    }
    
    /**
     * Getter del nombre del jugador del JTextField
     * @return texto del jTextFieldNombreJugador
     */
    public String getNombreJugador(){
        return jTextFieldNombreJugador.getText();
    }
    
    /**
     * Método que añade un ActionListener al Button Guardar
     * @param l ActionListener
     */
    public void guardarNivel(ActionListener l){
        jButtonGuardarNivel.addActionListener(l);
    }
    
    /**
     * Getter para seleccionar el nivel de dificultad
     * @return String texto del boton seleccionado
     */
    public String getNivelSeleccionado(){
        if(jRadioButtonPrincipiante.isSelected()){
            return "Principiante";
        }
        else if(jRadioButtonIntermedio.isSelected()){
            return "Intermedio";
        }
        else if(jRadioButtonAvanzado.isSelected()){
            return "Avanzado";
        }
        
        return "";
    }
    
    /**
     * Método que muestra un cuadro de diálogo con el mensaje de error
     * @param mensaje String mensaje de error al guardar el archivo
     */
    public void errorNivelSeleccionado(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, null, JOptionPane.ERROR_MESSAGE);
    }
    
    /**
     * Método que muestra un cuadro de diálogo con el mensaje de acierto
     * @param mensaje String mensaje de archivo guardado correctamente
     */
    public void aciertoNivelSeleccionado(String mensaje){
        JOptionPane.showMessageDialog(this, mensaje, null, JOptionPane.INFORMATION_MESSAGE);
    }
}