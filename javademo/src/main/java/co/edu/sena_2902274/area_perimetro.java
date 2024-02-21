package co.edu.sena_2902274;

import java.util.Scanner;

public class area_perimetro {

    public static void main( String[] args )
    {
        //entradas
    
        System.out.println("5. Calcular el area y el perimetro de un cuadrado");
        System.out.println("ingrese el valor de un lado del cuadrado");


        Scanner src = new Scanner(System.in);
        double Lado = src.nextDouble();


        //proceso

        double area = Lado*Lado;

        double perimetro = Lado+Lado+Lado+Lado;

        //salida

        System.out.println("el area del cuadrado es " +area + " y el perimetro " +perimetro);

    }
    
}
