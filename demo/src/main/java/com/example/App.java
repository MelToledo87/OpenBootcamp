package com.example;


/**
 * Hello world!
 *
 */
public class App 
{
    public static int suma(int a, int b, int c){
        return a+b+c;
    }
    public static void main( String[] args )
    {
        int resultado = suma(12, 7, 1);
        System.out.println( "Resultado suma:"+ resultado );

        Coche coche1 = new Coche();
        coche1.agregar_puerta();
        coche1.agregar_puerta();
        System.out.println( "Puertas:"+ coche1.puertas );
    }
    
}
