/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_practica2;

import java.util.ArrayList;

/**
 *
 * @author PcNitro
 */
public class Listas {
    
    ArrayList<Rutas> lista_rutas;
    ArrayList<Viaje> lista_viajes;
    ArrayList<Transporte> lista_transporte;
    ArrayList<Piloto> lista_pilotos;
    
    public Listas() {
        this.lista_rutas = new ArrayList<>();
        this.lista_viajes = new ArrayList<>();
        this.lista_transporte = new ArrayList<>();
        this.lista_pilotos = new ArrayList<>();
    }
    
    public void guardarPilotos(Piloto piloto) {
        this.lista_pilotos.add(piloto);
    }
    
    public void guardarRutas(Rutas ruta) {
        this.lista_rutas.add(ruta);
    }
    
    public void guardarViajes(Viaje viaje) {
        this.lista_viajes.add(viaje);
    }
    
    public void guardarTransporte(Transporte transporte) {
        this.lista_transporte.add(transporte);
    }
    
    public String[] obtenerPuntoInicial() {
        ArrayList<String> listaRutaInicial = new ArrayList<>();
        
        for (Rutas ruta: this.lista_rutas) {
            listaRutaInicial.add(ruta.getInicio());
        }
        String []arregloInicio = new String[listaRutaInicial.size()];
        return listaRutaInicial.toArray(arregloInicio);
    }
    
    public String[] obtenerPuntoFinal() {
        ArrayList<String> listaRutaFinal = new ArrayList<>();
        
        for (Rutas ruta: this.lista_rutas) {
            listaRutaFinal.add(ruta.getFin());
        }
        String []arregloFinal = new String[listaRutaFinal.size()];
        return listaRutaFinal.toArray(arregloFinal);
    }
    
    public String[] obtenerTransportes() {
        ArrayList<String> listaTransportes = new ArrayList<>();
        
        for (Transporte transporte: this.lista_transporte) {
            listaTransportes.add(transporte.getNombre());
        }
        String []arregloTransportes = new String[listaTransportes.size()];
        return listaTransportes.toArray(arregloTransportes);
    }
    
    public Transporte obtenerObjetoTransporte(String nombre) {
        for (Transporte transporte: this.lista_transporte) {
            if (transporte.getNombre().equals(nombre)) {
                return transporte;
            }
        }
        return null;
    }
    
    public double obtenerDistancia(String inicio, String fin) {
        for (Rutas ruta: this.lista_rutas) {
            if (ruta.getInicio().equals(inicio) && ruta.getFin().equals(fin)) {
                return ruta.getDistancia();
            }
        }
        return 0;
    } 
    
}
