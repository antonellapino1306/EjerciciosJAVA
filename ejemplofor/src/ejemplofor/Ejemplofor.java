/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofor;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Ejemplofor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejemplofor.recorrernumero();
        //Ejemplofor.mostarcantidaddedigitos();
        Ejemplofor.mostarlosdigitosdeunnumeroingresado();
    }
    public static void mostarlosdigitosdeunnumeroingresado()
    {
        int numeroingresado=4567;
        int digitos=0;
        for (int i = 0; i < 10; i++) {
            
        }
    }        
            
    public static void mostarcantidaddedigitos()
    {
        int numeroingresado=578;
        int cantidad=0;
        for (; numeroingresado > 0; ) {
            numeroingresado=numeroingresado/10;
            cantidad++;
            
        }
        System.out.println(cantidad);
    }
    public static void recorrernumero()
    {
        int CantidadDigitos=0;
        int numeroingresado; 
        for (int i = 5; i < 10; i++) {
            System.out.println(i);       
            
        }
    }
}
