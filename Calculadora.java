/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapoo;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Calculadora {
    
    public static void ArrancarCalculadora()
    {
        String Opcion = "Nada";
        Scanner miTeclado = new Scanner (System.in);
        System.out.println("Bienvenido a la Calculadora");
        while(!Opcion.equals("6"))
        {
            Calculadora.MostrarMenu();
        }
    }
     private static void MostrarMenu()
     {
      System.out.println("1-Sumar");
      System.out.println("2-Restar");
      System.out.println("3-Multiplicacion");
      System.out.println("4-Dividir");
      System.out.println("6-Salir");
      System.out.println("Ingrese Opcion deseada");
      
        
     }
}
