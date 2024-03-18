/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo_practica2;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author PcNitro
 */
public class Transporte extends JPanel implements Runnable {
    
    private String nombre;
    private boolean viajeEnCurso;
    private double gasolinaMaxima;
    private double gasolinaActual;
    private double distancia;
    private double gastoGasolina;
    private Piloto piloto;
    
    private int x;
    private int y;
    private int dx = 1;
    
    JButton btnrecarga = new JButton("Recarga gasolina");
    JLabel lbgasolina = new JLabel("");
    private String pathcarro = "src/imagenes/carro.gif";
    Image imgcarro = new ImageIcon(pathcarro).getImage().getScaledInstance(150, 100, Image.SCALE_DEFAULT);
    
    public Transporte(String nombre, double gasolinaMaxima, double gastoGasolina) {
        this.nombre = nombre;
        this.gasolinaMaxima = gasolinaMaxima;
        this.gasolinaActual = gasolinaMaxima;
        this.gastoGasolina = gastoGasolina;
        this.viajeEnCurso = false;
        this.setSize(1200, 200);
        this.add(btnrecarga);
        this.add(lbgasolina);
    }
    
    public void liberarPiloto() {
        if (piloto != null) {
            System.out.println("Se libero el piloto " + piloto.getNombre());
            piloto.liberarPiloto();
            piloto = null;
        }
    }
    
    public void asignarPilotoTransporte(Piloto piloto) {
        this.piloto = piloto;
    }
    
    public void iniciarViaje(double distancia) {
        this.distancia = distancia;
        System.out.println(this.viajeEnCurso + " - " + gasolinaActual);
        if (!this.viajeEnCurso && gasolinaActual > 0) {
            this.viajeEnCurso = true;
            System.out.println("El viaje a comenzado");
        } else {
            System.out.println("No se puede iniciar el viaje");
        }
    }
    
    public void retomarViaje() {
        if (!this.viajeEnCurso) {
            this.viajeEnCurso = true;
            new Thread(this).start();
        }
    }
    
    public void recargarGasolina() {
        this.gasolinaActual = this.gasolinaMaxima;
        retomarViaje();
        System.out.println("La gasolina ha sido recargada");
    }
    
    public void actualizarDistancia() {
        if (this.viajeEnCurso && gasolinaActual > 0) {
            this.distancia -= 1;
            this.gasolinaActual -= this.gastoGasolina;
            System.out.println("El transporte " + this.nombre + " ha recorrido 1km. " + this.distancia + " km");
            System.out.println("La gasolina restante es: " + this.gasolinaActual);
            if (distancia == 0) {
                this.viajeEnCurso = false;
                System.out.println("El viaje ha terminado para el transporte " + this.nombre);
                JOptionPane.showMessageDialog(null, "El viaje ha terminado para el transporte " + this.nombre);
                liberarPiloto();
            }
            if (gasolinaActual < gastoGasolina) {
                this.viajeEnCurso = false;
                btnrecarga.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        recargarGasolina();
                    } 
                });
                System.out.println("El transporte " + this.nombre + " se ha quedado sin gasolina");
            }
        }
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.drawImage(imgcarro, x, y, this);
        lbgasolina.setBounds(x, y, 150, 30);
        lbgasolina.setText("Gasolina restante: " + gasolinaActual);
        
        if (gasolinaActual < gastoGasolina) {
            btnrecarga.setVisible(true);
            btnrecarga.setBounds(x, y, 180, 30);
        } else {
            btnrecarga.setVisible(false);
        }
    }

    @Override
    public void run() {
        while (this.viajeEnCurso) {
            actualizarDistancia();
            
            x += dx;
            System.out.println("Posx: " + x);
            
            if (x < 0 || x > getWidth() - 150) {
                dx = -dx;
            }
            
            try {
                Thread.sleep(50);
            } catch(InterruptedException e) {
                
            }
        }
    }
    
    public String getNombre() {
        return nombre;
    }
    
}
