/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.para.casa.pkg1;

import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class EjercicioParaCasa1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int Multiplicacion;
        Scanner entradaporteclado= new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        numeroUno= entradaporteclado.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroDos= entradaporteclado.nextInt();
        System.out.println("ingrese el tercer numero");
        numeroTres= entradaporteclado.nextInt();
        Multiplicacion= numeroUno * numeroDos * numeroTres;
        System.out.println("la Multiplicacion es: "+ Multiplicacion);
  
                
        
    }
    
}
