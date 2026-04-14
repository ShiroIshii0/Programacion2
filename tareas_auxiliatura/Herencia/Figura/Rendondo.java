/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfigura;

/**
 *
 * @author casa
 */
public class Rendondo extends FG {
    private int radio;

    public Rendondo(int radio) {
        this.radio = radio;
    }
    @Override
    String color(){
        return"Amarillo";
    }
    public double getArea(){
        return 2 * Math.PI * Math.sqrt(radio); 
    }

    @Override
    public String toString() {
        return super.toString()+"Rendondo{" + "radio=" + radio + '}';
    }
    
}
