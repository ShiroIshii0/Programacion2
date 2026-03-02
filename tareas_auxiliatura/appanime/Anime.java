/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appanime;

import java.util.Scanner;

/**
 *
 * @author casa
 */
public class Anime {
    public String nombre;
    public String genero;
    private int nroE;
    private String []epi ;
    Scanner x = new Scanner(System.in);

    public Anime(String nombre, String genero, int nroE) {
        this.nombre = nombre;
        this.genero = genero;
        this.nroE = nroE;   
        this.epi = new String[nroE];
    }
    public void leer(){
        for(int i = 0; i< nroE ; i++){
             System.out.print("Ingrese valor " + i + ": ");
            epi[i] = x.nextLine();
        }
    }

    @Override

    public String toString() {

    String texto = "Anime{" +
            "nombre=" + nombre +
            ", genero=" + genero +
            ", nroE=" + nroE +
            ", episodios=";

    for(int i = 0; i < nroE; i++) {
        texto += epi[i] + ", ";
    }

    texto += "}";

    return texto;
}
    
    
}
