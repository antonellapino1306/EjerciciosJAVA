   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodieciciete;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ProyectoDieciciete {

    /**
     * @param args the command line arguments
     * se pide una edad y se informa si es niño adolescente o mayor de edad
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String datoAux;
        Integer Edad;
        Scanner miSc= new Scanner (System.in);
        
        
        System.out.println("indique la edad");
        datoAux=miSc.next();
        Edad=Integer.parseInt(datoAux);
        
        
        if(Edad> 12)
        {
            System.out.println("ya no sos un niño");
            
            }else
                
             
               System.out.println("sos un adolecente");
                
        if (Edad< 18)
        {
             System.out.println("sos un adulto");
             
             
             
             
            //
            //
            Edad=99;
            
            if (Edad< 17)
            {
              System.out.println("es mayor");  
            }
            else
            //son mayores 18 
            if (Edad< 12)
            {
                 System.out.println("es un niño");
            }
            else
                    //es menor 12
                
                    
                
            
             
        
                
            
        
        
               
        
    }                      
    
}
