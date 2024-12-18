/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modeloSpaceInvasionDani;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase modelo de mi programa Space Invasion Dani
 * @author Dani Angona
 */
public class ModeloSpaceInvasionDani {
    
    /**
     * Método que guarda el nombre del jugador y el nivel en el archivo Nivel.txt
     * @param nombreJugador String Nombre del jugador
     * @param nivelSeleccionado String Nivel selecccionado por el jugador
     */
    public void guardarNivelEnArchivoTxt(String nombreJugador, String nivelSeleccionado){
        String ruta = "src/Nivel.txt";
        
        try{
            BufferedWriter bf = new BufferedWriter(new FileWriter(ruta, true));
            bf.write(nombreJugador + " ha escogido " + nivelSeleccionado);
            bf.newLine();
            bf.close();
        } catch (IOException ex) {
            Logger.getLogger(ModeloSpaceInvasionDani.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}