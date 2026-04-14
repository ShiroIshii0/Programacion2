/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppersona5;

import java.awt.BorderLayout;

/**
 *
 * @author casa
 */
public class Estudiante extends Persona {
    private int matricula;
    private String carrera;

    public Estudiante(int matricula, String carrera, String nombre, int Ci, int edad) {
        super(nombre, Ci, edad);
        this.matricula = matricula;
        this.carrera = carrera;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int getCi() {
        return Ci;
    }

    @Override
    public void setCi(int Ci) {
        this.Ci = Ci;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void verificar(Estudiante x, Estudiante y){
        if (x.carrera.equals(y.carrera)){
            System.out.println("estan en la misma carrera");
        }else{
            System.out.println("diferente");
        }
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" + "matricula=" + matricula + ", carrera=" + carrera + '}';
    }
    
}
