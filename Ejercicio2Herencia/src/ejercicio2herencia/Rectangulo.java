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
public class Rectangulo extends FormaGeometrica{
    
    protected double x, y;
    protected double b;
    protected double h;
    protected double area;
    protected double perimetro;

    public Rectangulo() {
    }

    
    public Rectangulo(double x, double y, double b, double h, double area, double perimetro) {
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h; 
        
        this.area = area;
        this.perimetro = perimetro;
    }

    public Rectangulo(double x, double y, double b, double h, double area, double perimetro, String nombre) {
        super(nombre);
        this.x = x;
        this.y = y;
        this.b = b;
        this.h = h;
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

    public double getH() {
        return h;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }
    
    
    
  
    @Override
    public void visualizarForma(){
        super.visualizarForma();
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el valor de la X = ");
        x = sc.nextDouble();
        System.out.println("Introduce el valor de la Y = ");
        y = sc.nextDouble();
        System.out.println("La posición del RECTÁNGULO es X = " + x + " Y = " + y );
        System.out.println("Introduce la base = ");
        b = sc.nextDouble();
        System.out.println("Introduce la altura = ");
        h = sc.nextDouble();
        
        area = (b*h);
        System.out.println("El ÁREA del RECTÁNGULO ES: " + area);
        
        perimetro = (b*2 + h*2);
        System.out.println("El PERÍMETRO del RECTÁNGULO es: " + perimetro);
        
        
    }
}
