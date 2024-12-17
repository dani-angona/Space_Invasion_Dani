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

    public ControladorSpaceInvasionDani(ModeloSpaceInvasionDani modeloSID, PresentacionSpaceInvasionDani presentacionSID, PrincipalSpaceInvasionDani principalSID) {
        this.modeloSID = modeloSID;
        this.presentacionSID = presentacionSID;
        this.principalSID = principalSID;
        
        escuchadores(this);
    }
    
    public void escuchadores(ActionListener listener){
        principalSID.menuItemVerAyuda(this);
        principalSID.botonNuevaPartida(this);
        principalSID.botonNivel(this);
        principalSID.botonSalir(this);
    }
    
    public void mostrarPresentacionSpaceInvasionDani(){
        presentacionSID.setVisible(true);
        porcentajeCarga();
    }
    
    public void mostrarPrincipalSpaceInvasionDani(){
        principalSID.setVisible(true);
    }
    
    public void porcentajeCarga(){
        try{
            for(int i = 0; i <= 100; i += 25){
                presentacionSID.setPorcentajeCarga(i + "%");
                Thread.sleep(1500);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(ControladorSpaceInvasionDani.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        presentacionSID.dispose();
        mostrarPrincipalSpaceInvasionDani();
    }
    
    public void botonNivel(){
        NivelSpaceInvasionDani nivelSID = new NivelSpaceInvasionDani(principalSID, true);
        nivelSID.setVisible(true);
    }

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
                botonNivel();
                break;
            case "SALIR":
                System.out.println("Has elegido Salir");
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
            default:
                System.out.print("Error" + e.getActionCommand());
                break;
        }
    }
}