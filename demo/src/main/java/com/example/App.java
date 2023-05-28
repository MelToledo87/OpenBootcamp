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
        System.out.println( "Resultado:"+ resultado );
    }
}
