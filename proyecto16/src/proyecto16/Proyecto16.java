/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto16;

import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Proyecto16 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Importe;
        String Mes;
        
        Scanner miSc= new Scanner(System.in);
        System.out.println("ingrese el importe de pasaje");
        
        Importe= miSc.nextDouble();
        
        System.out.println("ingrese el mes del viaje");
        Mes= miSc.next();
        
       if(Mes.equals("Enero"))
       {
           Importe = Importe *0.90;
           System.out.println("Precio final con descuento: "+ Importe);
       }    
       else 
       {
           System.out.println("Precio final "+Importe);
       }
    
    }
    
    
} 