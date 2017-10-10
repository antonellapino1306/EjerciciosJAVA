/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //EjemploWhile.PromedioConIf();
        //EjemploWhile.PromedioConWhile();
        //EjemploWhile.IteracionSinCantidad();
        //EjemploWhile.PedirNumero();
        EjemploWhile.MostrarMenu();
   
    }//finaliza el mail
    
    /**
     * pide dos numeros e informa el promedio
     */
    
    public static void PromedioConIf()
    {
        Scanner miTeclado = new Scanner(System.in);
        
        Integer NumeroUno;
        Integer NumeroDos;
        String aux;
        Integer Promedio;
        
        System.out.println("Ingrese numero 1#");
        aux = miTeclado.next();
        NumeroUno = Integer.parseInt(aux);
        
        System.out.println("Ingrese numero 2#");
        aux = miTeclado.next();
        NumeroDos = Integer.parseInt(aux);
        
        Promedio = (NumeroUno+NumeroDos)/2;
        System.out.println("El Promedio es:" +Promedio);
        
        
    }
    
    public static void PromedioConWhile()
    {
        Scanner miTeclado = new Scanner (System.in);
        Integer NumeroUno;
        Integer Contador=0;
        String aux;
        Integer Promedio;
        Integer Suma = 0;
        
        while (Contador<3)
        {
            //Contador++;
            System.out.println("Ingrese un numero: "+ Contador);
            aux = miTeclado.next();
            NumeroUno = Integer.parseInt(aux);
            Suma = Suma + NumeroUno;
        
        }
        Promedio = Suma/Contador;
        
        System.out.println("El Promedio es: "+ Promedio);
        
    }
    
    /**
     * Cuando no sabemos la cantidad de Iteraciones
     */
    public static void IteracionSinCantidad()
    {   
        Scanner miTeclado = new Scanner (System.in);
        String Continuar = "si";
        while(!Continuar.equals("no"))
        {
            System.out.println("Hola, desea continuar");
            Continuar = miTeclado.next();
            
        }
    }
    
    public static void SalidaPorLogica()
    {
       
       String Continuar;
       Scanner miTeclado = new Scanner (System.in);
        while(true)
        {
             System.out.println("Hola, desea continuar");
            Continuar = miTeclado.next();
            if(Continuar.equals("no"))
            {
                break;
            }
            
        }
    
    }
            
    public static void PedirNumero()
    {
        Integer Numero;
        Integer Contador=0;
        String aux;
        Integer Suma=0;
        Scanner miTeclado = new Scanner (System.in);
        while(Contador<10 && Suma<50)
        {
            Contador++;
            System.out.println("Ingresa numero; " +Contador);
            aux = miTeclado.next();
            Numero = Integer.parseInt(aux);
            Suma = Suma + Numero;
            
        }
        
        System.out.println("La Suma es "+ Suma);
        System.out.println("La Cantidad es "+ Contador);
    }
            
    public static void MostrarMenu()
    {
        String Opcion= "Nada";
        Scanner miTeclado = new Scanner(System.in);
        
        while(!Opcion.equals("6"))
        {
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Dividir");
        System.out.println("6-Salir");
        System.out.println("Ingrese Opcion deseada");
        Opcion = miTeclado.next();
        
        switch(Opcion)
        {
            case "1":
                EjemploWhile.Sumar();
                break;
            case "2":
                EjemploWhile.Resta();
                break;
            case "3":
                EjemploWhile.Multiplicacion();
            case "6":
                System.out.println("¡¡¡Adios!!!");
                break;
            default:
                System.out.println("Ingreso una Opcion Equivocada");
            
        }
        
        }
        System.out.println("Cerro el menu");
        
        
    }
    
    public static void Sumar()
    {
        Integer NumeroUno;
        Integer NumeroDos;
        String aux;
        Integer Resultado;
        Scanner miTeclado = new Scanner (System.in);
        
        System.out.println("Ingrese numero 1#");
        aux = miTeclado.next();
        NumeroUno = Integer.parseInt(aux);
        
        System.out.println("Ingrese numero 2#");
        aux = miTeclado.next();
        NumeroDos = Integer.parseInt(aux);
        
        Resultado = NumeroUno + NumeroDos ;
        
        System.out.println("El resultado de la Suma es" + Resultado);
    }
    
    public static void Resta()
    {
        Integer NumeroUno;
        Integer NumeroDos;
        String aux;
        Integer Resultado;
        Scanner miTeclado = new Scanner (System.in);
        
        System.out.println("Ingrese numero 1#");
        aux = miTeclado.next();
        NumeroUno = Integer.parseInt(aux);
        
        System.out.println("Ingrese numero 2#");
        aux = miTeclado.next();
        NumeroDos = Integer.parseInt(aux);
        
        Resultado = NumeroUno - NumeroDos ;
        
        System.out.println("El resultado de la Resta es" + Resultado);
    }
    
    public static void Multiplicacion()
    {
        Integer NumeroUno;
        Integer NumeroDos;
        String aux;
        Integer Resultado;
        Scanner miTeclado = new Scanner (System.in);
        
        System.out.println("Ingrese numero 1#");
        aux = miTeclado.next();
        NumeroUno = Integer.parseInt(aux);
        
        System.out.println("Ingrese numero 2#");
        aux = miTeclado.next();
        NumeroDos = Integer.parseInt(aux);
        
        Resultado = NumeroUno - NumeroDos ;
        
        System.out.println("El resultado de la Multiplicacion es" + Resultado);
    }
    
}
