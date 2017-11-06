/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto15;

import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Proyecto15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double Importe;
        double ImporteFinal;
        
        Scanner miSc = new Scanner(System.in);
        
        System.out.println("Ingrese importe");
        Importe = miSc.nextDouble();
        
        if(Importe <100)
        {
            ImporteFinal = Importe *1.23;
            System.out.println("El importe final es "+ImporteFinal+ " Pesos. ");
        }
        if(Importe > 100)
        {
            ImporteFinal = Importe *0.50;
                    System.out.println("El importe final es: "+ ImporteFinal+ "Pesos.");
        }
    }
    
}
