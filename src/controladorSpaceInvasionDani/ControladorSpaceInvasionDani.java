/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladorSpaceInvasionDani;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    private String nombreJugador;
    private String nivel;
    private final String archivoNivel = "src/Nivel.txt";

    public ControladorSpaceInvasionDani(ModeloSpaceInvasionDani modeloSID, PresentacionSpaceInvasionDani presentacionSID, PrincipalSpaceInvasionDani principalSID, NivelSpaceInvasionDani nivelSID) {
        this.modeloSID = modeloSID;
        this.presentacionSID = presentacionSID;
        this.principalSID = principalSID;
        this.nivelSID = nivelSID;
        
        escuchadores(this);
    }
    
    public void escuchadores(ActionListener listener){
        principalSID.menuItemVerAyuda(this);
        principalSID.jDialogNuevaPartida(this);
        principalSID.jDialogNivel(this);
        principalSID.jDialogSalir(this);
        nivelSID.botonPrincipiante(this);
        nivelSID.botonIntermedio(this);
        nivelSID.botonAvanzado(this);
    }
    
    public void mostrarPresentacionSpaceInvasionDani(){
        presentacionSID.setVisible(true);
        porcentajeCarga();
    }
    
    public void mostrarPrincipalSpaceInvasionDani(){
        principalSID.setVisible(true);
    }
    
    public void jDialogNivel(){
        nivelSID.setVisible(true);
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
    
    /*public void guardarArchivoNivelTxt(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(archivoNivel))){
            writer.write(nombreJugador + "\n");
            writer.write(nivel + "\n");
            System.out.println("Configuracion del nivel elegido guardado en: " + archivoNivel);
        } catch (IOException ex) {
            Logger.getLogger(ControladorSpaceInvasionDani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cargarArchivoNivelTxt(){
        File archivo = new File(archivoNivel);
        
        if(archivo.exists()){
            try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
                nombreJugador = reader.readLine();
                nivel = reader.readLine();
                
                if(nombreJugador != null && nivel != null){
                    System.out.println("Archivo cargado: " + nombreJugador + " | " + nivel);
                }
            } catch (IOException ex) {
                Logger.getLogger(ControladorSpaceInvasionDani.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else{
            System.out.println("Archivo no encontrado");
        }
    }*/

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
            default:
                System.out.print("Error" + e.getActionCommand());
                break;
        }
    }
}