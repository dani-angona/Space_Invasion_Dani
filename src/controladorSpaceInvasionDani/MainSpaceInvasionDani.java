/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controladorSpaceInvasionDani;

import vistaSpaceInvasionDani.PresentacionSpaceInvasionDani;
import modeloSpaceInvasionDani.ModeloSpaceInvasionDani;
import vistaSpaceInvasionDani.PrincipalSpaceInvasionDani;

/**
 * Clase main de mi programa Space Invasion Dani
 * @author Dani Angona
 */
public class MainSpaceInvasionDani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio.....");
        
        ModeloSpaceInvasionDani modeloSID = new ModeloSpaceInvasionDani();
        PresentacionSpaceInvasionDani presentacionSID = new PresentacionSpaceInvasionDani();
        PrincipalSpaceInvasionDani principalSID = new PrincipalSpaceInvasionDani();
        ControladorSpaceInvasionDani controladorSID = new ControladorSpaceInvasionDani(modeloSID, presentacionSID, principalSID);
        
        controladorSID.mostrarPresentacionSpaceInvasionDani();
    }  
}