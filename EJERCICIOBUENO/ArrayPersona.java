/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesconvectores;

import persona.Persona;

/**
 *
 * @author usuario
 */
public class ArrayPersona {
    private Persona[] per;

    public ArrayPersona() {
    }
    
    public ArrayPersona(int lon){
        per = new Persona[lon];
    }
    
    public void llenarArrayPersona(){
        for (int i = 0; i < per.length; i++){
            Persona p1 = new Persona();
            p1.
            per[i] = p1;
        }
    }
    
    public void visualizarArrayPersona(){
        System.out.printf("%-20s%-8s%n", "Nombre", "Telefono");
        for(Persona p : per){
            System.out.printf(p.visualizarPersona());
        }
    }
}
