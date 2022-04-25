/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesconvectores;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author usuario
 */
public class Persona {
    //atributos--------------
    private String nombre;
    private int tel;
    private String apellidos1;
    private String apellidos2;
    //-----------------------
    
    //constructores---------------------------
    public Persona(){
        //nombre = "Alex";
        //tel = 12343851;
    }
    public Persona(String nombre, int tel){
        this.nombre = nombre;
        this.tel = tel;
    }
    //----------------------------------------
    
    // metodos getter y setter-------------
        
        //getter (leer)--------------------
    public String getNombre(){
        return nombre;
    }
    public int getTelefono(){
        return tel;
    }
        //---------------------------------
    
        //setter (escribir)----------------
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTelefono(int tel){
        this.tel = tel;
    }

    public Persona(String apellidos1, String apellidos2) {
        this.apellidos1 = apellidos1;
        this.apellidos2 = apellidos2;
    }

    public String getApellidos1() {
        return apellidos1;
    }

    public void setApellidos1(String apellidos1) {
        this.apellidos1 = apellidos1;
    }

    public String getApellidos2() {
        return apellidos2;
    }

    public void setApellidos2(String apellidos2) {
        this.apellidos2 = apellidos2;
    }
    
        //---------------------------------
    
    //----------------------------------------
    
    //metodo--------------------------------------------
    public void pedirPersona(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        nombre = sc.nextLine();
        System.out.print("Teléfono: ");
        tel = sc.nextInt();
        System.out.print("Apellido 1: ");
        apellidos1 = sc.nextLine();
        System.out.print("Apellido 2: ");
        apellidos2 = sc.nextLine();
        
    }
    
    public String visualizarPersona(){
        return String.format("%-20s%-8d\n", nombre, tel);
    }
    
    public void aleatorioPersona(){
        String [] nombres = {"Ana", "Sol", "Paco", "Manu"};
        int [] telefonos = {1313514, 345343135, 1348413, 1358135};
        String [] apellidos = {"Pascual", "Gonzalez", "Hernandez", "Martin"};
    }
    //--------------------------------------------------
}
