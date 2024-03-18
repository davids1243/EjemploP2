/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_practica2;

/**
 *
 * @author PcNitro
 */
public class Piloto {

    private Viaje viajeAsignado;
    private String nombre;
    
    public Piloto(String nombre) {
        this.nombre = nombre;
    }
    
    public void liberarPiloto() {
        this.viajeAsignado = null;
    }
    
    public boolean estaDisponible() {
        return this.viajeAsignado == null;
    }
    
    public void asignarViaje(Viaje viaje) {
        this.viajeAsignado = viaje;
    }
    
    public Viaje getViajeAsignado() {
        return viajeAsignado;
    }

    public void setViajeAsignado(Viaje viajeAsignado) {
        this.viajeAsignado = viajeAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
