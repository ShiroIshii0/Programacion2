/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appjugadores;

/**
 *
 * @author casa
 */
public class Jugador {
        private String nombre;
    private int diamantes;

    public Jugador(String nombre, int diamantes) {
        this.nombre = nombre;
        this.diamantes = diamantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDiamantes() {
        return diamantes;
    }

    public void setDiamantes(int diamantes) {
        this.diamantes = diamantes;
    }
}


