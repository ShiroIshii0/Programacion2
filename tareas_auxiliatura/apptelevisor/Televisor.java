/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apptelevisor;

/**
 *
 * @author casa
 */
public class Televisor {
    private String marca;
    private int resolucion;
    private String tipo[];

    public Televisor(String marca, int resolucion) {
        this.marca = marca;
        this.resolucion = resolucion;
        tipo = new String [3];
        tipo[0]= "oled";
        tipo[1]= "plasma";
        tipo[2]= "etc xd";
    }
    public void mostrarv(){
        for(int i = 0; i< 3; i++){
             System.out.println(tipo[i]);
        }
    }

    @Override
    public String toString() {
        return "Televisor{" + "marca=" + marca + ", resolucion=" + resolucion + '}';
    }
    
    
}
