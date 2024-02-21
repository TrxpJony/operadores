package co.edu.sena_2902274;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //entradas
    
        System.out.println("1. Calcular el area de un triangulo");
        System.out.println("ingrese la base del triangulo");

        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();


        System.out.println("ingrese la altura del triangulo");
        double heigth = src.nextDouble();

        //proceso

        double result = (base*heigth)/ 2;

        //salida

        System.out.println("el area del triangulo es " +result);

    }
}
