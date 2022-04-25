/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasesconvectores;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class Clasesconvectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el numero de personas: ");
        ArrayPersona persona = new ArrayPersona(sc.nextInt());
        persona.llenarArrayPersona();
        persona.visualizarArrayPersona();
        persona.aleatorioPersona();
    }
    
}
