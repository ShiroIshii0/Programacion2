/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appjugadores;

/**
 *
 * @author casa
 */
public class ServidorMinecraft {
    private Jugador[] jugadores;
    private int contador;
    public ServidorMinecraft() {
        jugadores = new Jugador[10];
        contador = 0;
    }
    public boolean agregarJugador(Jugador jugador) {
        if (contador >= jugadores.length) {
            System.out.println("No se pueden agregar más jugadores. El servidor está lleno.");
            return false;
        }
        jugadores[contador] = jugador;
        contador++;
        System.out.println("Jugador " + jugador.getNombre() + " ha sido agregado al servidor.");
        return true;
}
     public void mostrarJugadores() {
        System.out.println("Jugadores en el servidor:");
        for (int i = 0; i < contador; i++) {
            System.out.println("Nombre: " + jugadores[i].getNombre() + ", Diamantes: " + jugadores[i].getDiamantes());
        }
}}
