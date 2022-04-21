/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2herencia;

import java.util.Scanner;

/**
 *
 * @author Administrador
 */
public class FormaGeometrica {
    private String nombre;
    
    public FormaGeometrica (){
        
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public FormaGeometrica(String nombre) {
        this.nombre = nombre;
    }
    public void visualizarForma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("El orden para realizar el programa es: Rectángulo-cuadrado / Elipse-circulo");
        System.out.println("Nombre: ");
        nombre = sc.nextLine();
    }
}
