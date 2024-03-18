/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_practica2;

/**
 *
 * @author PcNitro
 */
public class Viaje {

    private String inicio;
    private String fin;
    private double gasolinaConsumida;
    private Transporte transporte;
    private double distancia;
    private Piloto piloto;
    
    public Viaje(String inicio, String fin, double distancia, Transporte transporte) {
        this.inicio = inicio;
        this.fin = fin;
        this.distancia = distancia;
        this.transporte = transporte;
    }
    
    public void asignarPilotoViaje(Piloto piloto) {
        if (piloto.estaDisponible()) {
            this.piloto = piloto;
            this.piloto.asignarViaje(this);
        } else {
            System.out.println("El piloto " + piloto.getNombre() + " no esta disponible");
        }
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

    public double getGasolinaConsumida() {
        return gasolinaConsumida;
    }

    public void setGasolinaConsumida(double gasolinaConsumida) {
        this.gasolinaConsumida = gasolinaConsumida;
    }

    public Transporte getTransporte() {
        return transporte;
    }

    public void setTransporte(Transporte transporte) {
        this.transporte = transporte;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public Piloto getPiloto() {
        return piloto;
    }

    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
}
