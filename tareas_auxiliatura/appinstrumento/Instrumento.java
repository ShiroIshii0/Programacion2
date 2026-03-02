/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appinstrumento;

/**
 *
 * @author casa
 */
public class Instrumento {
    public String nombre;
    private String material;
    private String tipo[];

    public Instrumento(String nombre, String material) {
        this.nombre = nombre;
        this.material = material;
        tipo = new String[2];
        tipo[0]= "cuerda";
        tipo[1]= "aire";
    }
    public void mostrarv(){
        for(int i = 0; i< 2; i++){
            System.out.println(tipo[i]);
        }
    }

    @Override
    public String toString() {
        return "Instrumento{" + "nombre=" + nombre + ", material=" + material + '}';
    }
    
    
}
