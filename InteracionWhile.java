/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interacionwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class InteracionWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Clave;
        
        
        
        Scanner miSc = new Scanner (System.in);
        
        System.out.println("Ingrese clave correcta");
        Clave = miSc.next();
        
        while (!Clave.equals("1234"))
        {
            System.out.println("error Reingrese clave correcta");
            Clave = miSc.next();
            
        }
        System.out.println("Bienvenido");
        
        Integer miContador=0;
         
        while(miContador<3)
        {
           miContador=miContador+1;
            System.out.println("contador"+miContador);
             
        }
            System.out.println("termine");
        
    }
    
}
