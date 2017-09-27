/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoinfonumerica;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoInfonumerica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se brinda la informacion sobre un nùmero ingresado.
        // modulo %
    //    Integer NumeroUno;
    //    Integer NumeroDos;
    //    Integer Resultado;
    //      NumeroUno = 2;
//          NumeroDos = 10;
//          Resultado = 2%10;
//          System.out.println("el resultado de 2%10 es: "+Resultado);
//          Resultado = 11%3;
    //    System.out.println("el resultado de 10%2 es: "+Resultado);.
    
        Integer NumeroIng;
        String Aux;
        
       
        Scanner miTeclado = new Scanner (System.in);
        
        System.out.println("Ingrese Un nùmero");
        Aux = miTeclado.next();
        NumeroIng = Integer.parseInt(Aux);
        
        /*
           1- informar si el mayor o menor a 100
           2- informar si el positivo o negativo.
           3- informar si es par o impar
        */
        
        if(NumeroIng > 100)
        {
            System.out.println("es mayor a 100"); 
        }else  
        {
            if(NumeroIng < 100){
                System.out.println("es menor a 100");
            }
        }
        
        if(NumeroIng > 0)
        {
            System.out.println("es un numero positivo");
        }else
        {
            if (NumeroIng < 0) 
            {
                System.out.println("es un numero negativo");
            }
            
        }
        if(NumeroIng % 2 == 0)
        {
            System.out.println(" es par");
            
        }else
        {
            
            System.out.println("es impar");
        }
            
         
        
    }
    
}
