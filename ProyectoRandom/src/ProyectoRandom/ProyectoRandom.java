/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoRandom;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoRandom {

    /**
     * @param args the command line arguments
     * informar si: si le erro por un punto mensaje "casicasi"
     * si le erro por 2 puntos mensaje "cerca"
     * si le erro por 3 puntos mensaje "ni cerca"
     * si le erro por 4 puntos mensaje "bien lejos"
     * para todos los demas mensaje "sos horrible en este juego"
     * tranformarlo switch
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer numIngresado;
        int numero;
        String Aux;
        Scanner miSc = new Scanner (System.in);
        
        numero = (int) (Math.random() * 10) + 1;
        
        System.out.println("adivine el numero");
        Aux = miSc.next();
        numIngresado = Integer.parseInt(Aux);
        
        if(numIngresado == numero)
        {
            System.out.println("ganaste");
        }else{
            System.out.println("suerte para la proxima.");
             
            if (numIngresado > numero)
            {
                System.out.println("Te pasaste");
                
            }else
            {
                System.out.println("te falto");   
            }
         
            System.out.println("el numero es" + numero);
         
         
                 
    }
    
}
