/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bbb;

/**
 *
 * @author alumno
 */
public class Bbb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] alumno={"maria", "manuel", "diego", "estela","martin"};
        int[] notas={10,2,5,2,7};
         
        int aux;
        
        aux=Bbb.mostrarCantidadDeAprobados(notas);
        
        System.out.println(aux);
        
        
                
    }
    
    public static int mostrarCantidadDeAprobados(int[] miparametro)
    {
        int resultado=0;
        
        for (int i = 0; i < miparametro.length; i++) 
        {
            if(miparametro[i]>3)
            {
                resultado++;
            }
        }
        
        
        return resultado;
        
    }
    
    
    
}
