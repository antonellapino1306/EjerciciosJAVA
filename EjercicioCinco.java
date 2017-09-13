/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocinco;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     * se necesita pedir dos numeros y sumarlos, mostrar el resultado
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno;
        int numeroDos;
        int Suma;
        Scanner gabriela = new Scanner (System.in);
        System.out.println("ingrese el primer numero");
        numeroUno=gabriela.nextInt();
        System.out.println("ingrese el segundo numero");
        numeroDos=gabriela.nextInt();
        Suma=numeroUno+numeroDos;
        System.out.println("suma"+Suma);
                
        
                
               
        System.out.println("estoy en el ejercicio cinco");
        
    }
    
}
