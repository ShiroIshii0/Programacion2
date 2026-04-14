/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appfigura;

/**
 *
 * @author casa
 */
public class AppFigura {

    public static void main(String[] args) {
        FG[] figuras = new FG[6];
        figuras[0] = new Cuadrado(4);
        figuras[1] = new Rendondo(8);
        figuras[2] = new Triangulo(9,4,7);
        figuras[3] = new Cuadrado(9);
        figuras[4] = new Rendondo(45);
        figuras[5] = new Triangulo(7,9,98);
        for(int i = 0; i < figuras.length; i++){
            System.out.println("color; "+ figuras[i].color());
            System.out.println("Área: " + figuras[i].getArea());
            if(i < figuras.length - 1){
        mayor(figuras[i], figuras[i+1]); // ✔ correcto
    }
        }
      
    }
    public static void mayor ( FG x, FG y) {
        if (x.getArea()>= y.getArea()){
            System.out.println("el cuadrado es mayor" + x.color());
        }else{
            System.out.println("el triangulo es mayor");
            y.color();
        }
    }
}
