/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appinstrumento;

/**
 *
 * @author casa
 */
public class AppInstrumento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrumento a1= new Instrumento("patito","acero galbanisado");
        System.out.println(a1.toString());
        a1.mostrarv();
        
    }
    
}
