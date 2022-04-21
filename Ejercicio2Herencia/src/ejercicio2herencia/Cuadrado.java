/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2herencia;

import java.util.Scanner;

/**
 *
 * @author sandr
 */
public class Cuadrado extends Rectangulo {

    public Cuadrado() {
    }

    public Cuadrado(double x, double y, double b, double h, double area, double perimetro) {
        super(x, y, b, h, area, perimetro);
    }

    public Cuadrado(double x, double y, double b, double h, double area, double perimetro, String nombre) {
        super(x, y, b, h, area, perimetro, nombre);
    }
   
 
    
    @Override
    public void visualizarForma(){
        super.visualizarForma();
        Scanner sc = new Scanner(System.in);
        /*System.out.println("Introduce el valor del lado = ");
        super.getB();*/
        area = (b*b);
        System.out.println("El ÁREA del CUADRADO ES =  " + area);
        
        perimetro = (b + b + b + b);
        System.out.println("El PERIMETRO del cuadrado es = " + perimetro);
                
                
    }
}
