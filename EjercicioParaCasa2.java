/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.para.casa.pkg2;

import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class EjercicioParaCasa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int numeroTres;
        int numeroCuatro;
        int Suma;
        Scanner entradaporteclado=new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        numeroUno= entradaporteclado.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroDos= entradaporteclado.nextInt();
        System.out.println("ingrese el tercer numero");
        numeroTres= entradaporteclado.nextInt();
        System.out.println("ingerse el cuarto numero");
        numeroCuatro= entradaporteclado.nextInt();
        Suma= numeroUno + numeroDos + numeroTres + numeroCuatro;
        System.out.println("la suma es: "+Suma);
        10
        
        
    }
    
}
