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
public class Círculo extends Elipse{

    public Círculo() {
    }

    public Círculo(double x, double y, double b, double a, double area, double perimetro) {
        super(x, y, b, a, area, perimetro);
    }

    public Círculo(double x, double y, double b, double a, double area, double perimetro, String nombre) {
        super(x, y, b, a, area, perimetro, nombre);
    }

   
    
    @Override
    public void visualizarForma(){
        super.visualizarForma();
        Scanner sc = new Scanner(System.in);
        
        area = (Math.PI*b);
        System.out.println("El ÁREA del CÍRCULO = " + area);
        
        perimetro = 2*Math.PI*b;
        System.out.println("El PERÍMETRO del CÍRCULO = " + perimetro);
    
    }
    
}
