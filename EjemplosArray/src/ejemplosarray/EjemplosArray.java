/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosarray;

/**
 *
 * @author alumno
 */
public class EjemplosArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EjemplosArray.PrimerEjemplo();
        //EjemplosArray.SegundoEjemplo();
        //EjemplosArray.TercerEjemplo();
        EjemplosArray.InvertirOrden();
        //EjemplosArray.SacarElMayor();
        //EjemplosArray.SacarElMenor();
        //EjemplosArray.SacarElSuma();
        //EjemplosArray.SacarElPromedio();
        
    }
    public static void PrimerEjemplo()
    {
        int[] Numeros;
        int MasNumeros[]={33,77,55,11};
        int []otrosNumeros;
        
        Numeros= new int[4];
        Numeros[0]=99;
        Numeros[1]=22;
        Numeros[2]=11;
        Numeros[3]=0;
        // da error Numeros[4]=10;
        
        otrosNumeros=new int[10];
        int Largo=otrosNumeros.length;
        System.out.println("Largo"+Largo);
        for (int i = 0; i <otrosNumeros.length; i++) 
        {
          otrosNumeros[i]=i*3;
          System.out.println("");
        }
         
                 
    }
    
    public static void SegundoEjemplo()
    {
        int NumerosPares[];
        
        NumerosPares = new int[10];
        int indice=0;
        for (int i = 0; i < 20; i++) {
         
            if(i%2==0)
            {
                NumerosPares[indice]=i;
                indice= indice+1;
            }   
        }
        for (int i = 0; i < 10; i++) {
            
            System.out.println("Numeros "+i+": "+ NumerosPares[i]);
        }
    }
    
    public static void TercerEjemplo()
   
    {
        int Arrays1[]={3,5,7};
        int Arrays2[]={8,6,2};
        int Arrays3[];
        Arrays3= new int[3];
        int indice=0;
        
        
        
        for (int i = 0; i < 3; i++) 
        {
            if(Arrays1[i]>Arrays2[i])
            {
                Arrays3[i]=Arrays1[i];
            }else
            {
                Arrays3[i]=Arrays2[i];
                
            }
        }
        for (int i = 0; i < 3; i++) 
        {
        System.out.println("Resultado: "+Arrays3[i]);   
        }
    }
    
    public static void InvertirOrden()
    {
        int ArrayInicial[]={33,77,55,11};
        int ResultadoArray[];
        int indice=0;
        ResultadoArray = new int[4];
        
        for (int i = ResultadoArray.length-1; i >=0; i--) 
        {
            ResultadoArray[indice]=ArrayInicial[i];
            indice++;
        }
        for (int i = 0; i < 4; i++) 
        {
            System.out.println("Invertido "+ ResultadoArray[i]);  
        }
       
    
    }
    public static void SacarElMayor() 
    {
        int ArrayInicial[]={33,77,55,11};
        int ResultadoArray[];
        int NumeroMayor=ArrayInicial[0];
        
        ResultadoArray = new int[4];
        
      for (int i = ResultadoArray.length-1; i >=0; i--) 
      {
          if (ArrayInicial[i]> NumeroMayor)
          {
              NumeroMayor=ArrayInicial[i];
              
          }
      }
        System.out.println("el NumeroMayor: "+ NumeroMayor);
    }
    public static void SacarElMenor()
    {
       int ArrayInicial[]={33,77,55,11};
       int ResultadoArray[];
       int NumeroMenor=ArrayInicial[0];
        
        ResultadoArray = new int[4];
        
      for (int i = ResultadoArray.length-1; i >=0; i--) 
      {
          if (ArrayInicial[i]< NumeroMenor)
          {
              NumeroMenor=ArrayInicial[i];
              
          }
      }
        System.out.println("el NumeroMenor: "+ NumeroMenor);  
    }
    public static void SacarElSuma()
    {
      int ArrayInicial[]={33,77,55,11};
      int Suma=0;  
      
        for (int i = 0; i < ArrayInicial.length; i++) 
        {
            Suma = Suma + ArrayInicial[i];
        }
        System.out.println("La Suma es: "+ Suma);
    }
    public static void SacarElPromedio()
    {
        int ArrayInicial[]={33,77,55,11};
        int Suma=0;  
      
        for (int i = 0; i < ArrayInicial.length; i++) 
        {
            Suma = Suma + ArrayInicial[i];
        }
        System.out.println("La Promedio es: "+ Suma/ArrayInicial.length);
    }
}
    
