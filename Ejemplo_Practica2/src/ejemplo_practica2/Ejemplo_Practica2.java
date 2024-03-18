/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_practica2;

import javax.swing.SwingUtilities;

/**
 *
 * @author PcNitro
 */
public class Ejemplo_Practica2 {

    /**
     * @param args the command line arguments
     */
    public static Listas listas = new Listas();
    
    public static void main(String[] args) {
        
        //Lista Pilotos
        listas.guardarPilotos(new Piloto("Piloto 1"));
        
        // TODO code application logic here
        listas.guardarRutas(new Rutas("Tiquisate", "El palmar", 60));
        
        //Transportes
        listas.guardarTransporte(new Motocicleta("Motocicleta 1", 6, 0.5));
        
        
        SwingUtilities.invokeLater(() -> {
            VentanaTransportes vent1 = new VentanaTransportes();
            vent1.setVisible(true);
        });

        
    }
    
}
