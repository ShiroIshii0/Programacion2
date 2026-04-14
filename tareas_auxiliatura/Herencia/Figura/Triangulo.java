/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appfigura;

/**
 *
 * @author casa
 */
public class Triangulo extends FG{
    private int l1;
    private int l2;
    private int l3;

    public Triangulo(int l1, int l2, int l3) {
        super();
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    @Override
    String color(){
        return "verde";
    }
    @Override
    public double getArea(){
        double s = (l1 + l2 + l3) / 2;
        return Math.sqrt(s * (s - l1) * (s - l2) * (s - l3));
    }

    @Override
    public String toString() {
        return super.toString()+ "Triangulo{" + "l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + '}';
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }
    
}
