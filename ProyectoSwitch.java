/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoswitch;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoSwitch {

    /**
     * @param args the command line arguments
     * > 80 y viaja en invierno "vacunate contra la gripe"
     */
    public static void main(String[] args) {
        // TODO code application logic her
        String mesDelAño;
        String Vacaciones;
        int Edad;
        Scanner miTeclado= new Scanner (System.in);
        
        
        System.out.println("Vas de vacaciones");
         Vacaciones = miTeclado.next();
         
         if(Vacaciones.equals("si"))   
        {
            System.out.println("ingrese mes del año");
         mesDelAño = miTeclado.next();
         
            System.out.println("ingresar su edad: ");
            Edad = miTeclado.nextInt();
        
            switch(mesDelAño)
            {
                case "enero":
                case "febrero":
                    System.out.println("Lindo veranito!!!");
                    break;

                case "julio":
                    if(Edad > 80)
                    {
                        System.out.println("Vacunate contra la gripe");
                    }
                    System.out.println("Lindo invierno!!!");
                    break;
                default:
                        System.out.println("no es verano");
                    break;


            }
        }
    }
    
}
