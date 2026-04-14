/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apppersona5;

/**
 *
 * @author casa
 */
public class AppPersona5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante e1 = new Estudiante(123, "psicologia","juan",99823,18);
        Estudiante e2 = new Estudiante(4343, "psicologia","juan",94534,16);
        Docente d1 =  new Docente (4, 0.111,"juan",99823,18 );
        System.out.println(e1.toString());
        System.out.println(d1.toString());
        e1.verificar(e1, e2);
        System.out.println(edad(d1, e1));
        
    }   
    public static boolean edad(Docente x, Estudiante y) {
        if (x.getEdad()== y.getEdad()){
            return true;
        }else{
            return false;
        }
    }
    
}
