/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appbus;
import java.util.Random;
/**
 *
 * @author casa
 */
public class Bus {
    private  boolean cobro;
    private int pasaje;
    private boolean asientos[][];
    private int matricula;
    private Random r ;

    public Bus(boolean cobro, int pasaje, int matricula, Random r, int filas , int columnas) {
        this.cobro = cobro;
        this.pasaje = pasaje;
        asientos = new boolean[filas][columnas];
        this.matricula = matricula;
        this.r = r;
        AO();
    }

  private void AO(){
      for(int i = 0; i< asientos.length; i++){
          for(int j = 0; j< asientos[i].length; j++){
              asientos[i][j] = r.nextBoolean();
          }
      }
  }
  public boolean gB(){
      return r.nextBoolean();
  }
  public void mostrarEstadoAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.println("Asiento (" + i + "," + j + "): " + (asientos[i][j] ? "Ocupado" : "Libre"));
            }
        }
    }
     

    
}
