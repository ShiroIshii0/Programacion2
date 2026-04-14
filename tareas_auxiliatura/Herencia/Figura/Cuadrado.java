/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfigura;

/**
 *
 * @author casa
 */
public class Cuadrado extends FG {
    private int lado;
     Cuadrado(int lado){
        super();
        this.lado = lado;
    }
    @Override
    String color(){
        return "rojo";
    }
    @Override
    public double getArea(){
        return lado * lado;
    }

    @Override
    public String toString() {
        return super.toString()+ "Cuadrado{" + "lado=" + lado + '}';
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
        

}
