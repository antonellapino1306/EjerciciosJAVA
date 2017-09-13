/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciodos;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioDos {

    /**
     * @param args the command line arguments
     * se debe pedir un nombre y se debe mostrar el mismo nombre
     * 
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Mins = new Scanner (System.in);
        String nombre;
        
        System.out.println("ingresar un nombre");
        nombre= Mins.nextLine();
        System.out.println("el nombre ingresado es: "+nombre);
        }
    
}
