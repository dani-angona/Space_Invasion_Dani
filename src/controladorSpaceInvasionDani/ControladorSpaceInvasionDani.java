/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorSpaceInvasionDani;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import vistaSpaceInvasionDani.PresentacionSpaceInvasionDani;
import modeloSpaceInvasionDani.ModeloSpaceInvasionDani;
import vistaSpaceInvasionDani.NivelSpaceInvasionDani;
import vistaSpaceInvasionDani.PrincipalSpaceInvasionDani;

/**
 * Clase controlador de mi programa Space Invasion Dani
 * @author Dani Angona
 */
public class ControladorSpaceInvasionDani implements ActionListener {
    private ModeloSpaceInvasionDani modeloSID;
    private PresentacionSpaceInvasionDani presentacionSID;
    private PrincipalSpaceInvasionDani principalSID;
    private NivelSpaceInvasionDani nivelSID;

    /**
     * Constructor de la clase ControladorSpaceInvasionDani
     * @param modeloSID Instancia de la clase ModeloSpaceInvasionDani
     * @param presentacionSID Instancia de la clase PresentacionSpaceInvasionDani
     * @param principalSID Instancia de la clase PrincipalSpaceInvasionDani
     * @param nivelSID Instancia de la clase NivelSpaceInvasionDani
     */
    public ControladorSpaceInvasionDani(ModeloSpaceInvasionDani modeloSID, PresentacionSpaceInvasionDani presentacionSID, PrincipalSpaceInvasionDani principalSID, NivelSpaceInvasionDani nivelSID) {
        this.modeloSID = modeloSID;
        this.presentacionSID = presentacionSID;
        this.principalSID = principalSID;
        this.nivelSID = nivelSID;
        
        escuchadores(this);
    }
    
    /**
     * Método de los escuchadores
     * @param listener ActionListener
     */
    public void escuchadores(ActionListener listener){
        principalSID.menuItemVerAyuda(this);
        principalSID.jDialogNuevaPartida(this);
        principalSID.jDialogNivel(this);
        principalSID.jDialogSalir(this);
        nivelSID.botonPrincipiante(this);
        nivelSID.botonIntermedio(this);
        nivelSID.botonAvanzado(this);
        nivelSID.guardarNivel(this);
    }
    
    /**
     * Método que muestra la ventana PresentacionSpaceInvasionDani
     */
    public void mostrarPresentacionSpaceInvasionDani(){
        presentacionSID.setVisible(true);
        porcentajeCarga();
    }
    
    /**
     * Método que muestra la ventana PrincipalSpaceInvasionDani
     */
    public void mostrarPrincipalSpaceInvasionDani(){
        principalSID.setVisible(true);
    }
    
    /**
     * Método que muestra el JDialog de Nivel
     */
    public void jDialogNivel(){
        nivelSID.setVisible(true);
    }
    
    /**
     * Método que simula la carga de la ventana PresentacionSpaceInvasionDani
     */
    public void porcentajeCarga(){
        try{
            for(int i = 0; i <= 100; i += 25){
                presentacionSID.setPorcentajeCarga(i + "%");
                Thread.sleep(1000);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorSpaceInvasionDani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        presentacionSID.dispose();
        mostrarPrincipalSpaceInvasionDani();
    }
    
    /**
     * Método actionPerformed donde se añaden funciones a los escuchadores
     * @param e ActionEvent
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Ver la ayuda":
                System.out.println("Has elegido Ver la ayuda");
                principalSID.mensajeVerAyuda("Hablar con el desarrollador del juego.");
                break;
            case "NUEVA PARTIDA":
                System.out.println("Has elegido Nueva Partida");
                break;
            case "NIVEL":
                System.out.println("Has elegido Nivel");
                jDialogNivel();
                break;
            case "SALIR":
                System.out.println("Has elegido Salir");
                System.exit(0);
                break;
            case "PRINCIPIANTE":
                System.out.println("Has puesto la dificultad en Principiante");
                break;
            case "INTERMEDIO":
                System.out.println("Has puesto la dificultad en Intermedio");
                break;
            case "AVANZADO":
                System.out.println("Has puesto la dificultad en Avanzado");
                break;
            case "GUARDAR":
                System.out.println("Has elegido Guardar");
                
                String nombreJugador = nivelSID.getNombreJugador();
                System.out.println("Contenido de jTextFieldNombreJugador: " + nivelSID.getNombreJugador());
                String nivelSeleccionado = nivelSID.getNivelSeleccionado();
                
                if(nombreJugador.isEmpty() || nivelSeleccionado.isEmpty()){
                    nivelSID.errorNivelSeleccionado("Por favor, ingrese un nombre de jugador y seleccione un nivel");
                }
                else{
                    modeloSID.guardarNivelEnArchivoTxt(nombreJugador, nivelSeleccionado);
                    nivelSID.aciertoNivelSeleccionado("Nivel guardado correctamente");
                }
                break;
            default:
                System.out.print("Error" + e.getActionCommand());
                break;
        }
    }
}