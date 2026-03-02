/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apptelevisor;

/**
 *
 * @author casa
 */
public class AppTelevisor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Televisor t1 = new Televisor("marca",4);
        t1.mostrarv();
        System.out.println(t1.toString());
    }
    
}
