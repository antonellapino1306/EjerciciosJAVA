/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotrese;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoTrese {

    /**
     * @param args the command line arguments
     * 13-Se ingresa un color y una localidad, si es avellaneda o
     * Lanùs y el color es rojo, mostrar el mensaje "sos de independiente"
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Localidad;
        String Color;
        Scanner miSc = new Scanner (System.in);
        
        System.out.println("ingrese el color");
        Color= miSc.next();
        
         System.out.println("ingrese localidad");
        Localidad= miSc.next();
        
        if(Color.equals("rojo")){
            if(Localidad.equals("lanus")||Localidad.equals("Avellaneda"))
                    {
                        System.out.println(" sos de Independiente");
                    }
        }
            
        
    }
    
}
