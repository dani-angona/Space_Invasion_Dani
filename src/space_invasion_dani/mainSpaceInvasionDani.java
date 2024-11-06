/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package space_invasion_dani;

/**
 *
 * @author Dani Angona
 */
public class mainSpaceInvasionDani {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Inicio.....");
        VistaSpaceInvasionDani VentanaSID = new VistaSpaceInvasionDani();      
        VentanaSID.setVisible(true);
        
        ModeloSpaceInvasionDani modeloSID = new ModeloSpaceInvasionDani();
        VistaSpaceInvasionDani vistaSID = new VistaSpaceInvasionDani();
        ControladorSpaceInvasionDani controladorSID = new ControladorSpaceInvasionDani(modeloSID, vistaSID);
    }  
}