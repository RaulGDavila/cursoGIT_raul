package com.curso;

/**
 * Paso1 Escribo el API - 
 *
 */
public class Libreria 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    
    
       public static int suma (int numero1 , int numero2 ) 
    {
        
        return numero1 + numero2 ;
    }
        public static int resta (int numero1 , int numero2 ) 
    {
         return numero1 - numero2 ;
    }
    
    // SOBRECARGA - PARA LOS DOUBLES
    
        public static double suma (double numero1 , double numero2 ) 
    {
        
        return numero1 + numero2 ;
    }
        public static double resta (double numero1 , double numero2 ) 
    {
         return numero1 - numero2 ;
    }
    
            public static int multiplicar (int numero1 , int numero2 ) 
    {
         return numero1 * numero2 ;
    }
     
    /*         public static void  main (String[]arg ) 
    {
        
        System.out.println(Libreria.suma(3,5));
        
     //   return 0;
    }*/
    
}
