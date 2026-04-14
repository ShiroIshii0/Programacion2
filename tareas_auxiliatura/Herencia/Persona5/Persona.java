/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apppersona5;

/**
 *
 * @author casa
 */
public class Persona {
    protected String nombre;
    protected int Ci;
    protected int edad;

    public Persona(String nombre, int Ci, int edad) {
        this.nombre = nombre;
        this.Ci = Ci;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCi() {
        return Ci;
    }

    public void setCi(int Ci) {
        this.Ci = Ci;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Ci=" + Ci + ", edad=" + edad + '}';
    }
    
}
