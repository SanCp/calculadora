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
public class Elipse extends FormaGeometrica {
    
    protected double x, y;
    double b;
    double a;
    double area;
    double perimetro;
    protected static double pi = Math.PI;

    public Elipse() {
    }

    
    public Elipse(double x, double y, double b, double a, double area, double perimetro) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.a = a;
        this.area = area;
        this.perimetro = perimetro;
    }

    public Elipse(double x, double y, double b, double a, double area, double perimetro, String nombre) {
        super(nombre);
        this.x = x;
        this.y = y;
        this.b = b;
        this.a = a;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public static double getPi() {
        return pi;
    }

   
 
    
    @Override
    public void visualizarForma(){
        super.visualizarForma();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la X = ");
        x = sc.nextDouble();
        System.out.println("Introduce el valor de la Y = ");
        y = sc.nextDouble();
        System.out.println("La posición de la ELIPSE"
                + " es X = " + x + " Y = " + y );
        System.out.println("Introduce el valor del semieje mayor =  ");
        b = sc.nextDouble();
        System.out.println("Introduce el valor del semieje menor = ");
        a = sc.nextDouble();
        
        area = pi*(b * a);
        System.out.println("El ÁREA DE LA ELIPE ES = " + area);
        
        perimetro = (2*pi*Math.sqrt((b*2) + (a * 2)/2));
        System.out.println("El PERÍMETRO de la ELIPSE es = " + perimetro);
    
        
    }
    
}
