/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appjugadores;

/**
 *
 * @author casa
 */
public class AppJugadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServidorMinecraft servidor = new ServidorMinecraft();
        Jugador jugador1 = new Jugador("Alex", 10);
        Jugador jugador2 = new Jugador("Steve", 15);
        servidor.agregarJugador(jugador1);
        servidor.agregarJugador(jugador2);
        servidor.mostrarJugadores();
    }
    
}
