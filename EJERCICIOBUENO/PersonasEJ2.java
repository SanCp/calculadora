/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesconvectores;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Persona {
    //atributos--------------
    private String nombre;
    private int tel;
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
        //---------------------------------
    
    //----------------------------------------
    
    //metodo--------------------------------------------
    public void pedirPersona(){
        Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un nombre: ");
            nombre = sc.nextLine();
            System.out.print("Introduce un telefono: ");
            tel = sc.nextInt();
    }
    
    public String visualizarPersona(){
        return String.format("%-20s%-8d\n", nombre, tel);
    }
    
    public void aleatorioPersona(){
        String [] nombres = {"Ana", "Sol", "Paco", "Manu"};
        int [] telefonos = {1313514, 345343135, 1348413, 1358135};
    }
    //--------------------------------------------------
}
