/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_practica2;

/**
 *
 * @author PcNitro
 */
public class Rutas {
    
    private String inicio;
    private String fin;
    private double distancia;
    
    public Rutas(String inicio, String fin, double distancia) {
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
    }
    
    
    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }
    
}
