package co.edu.sena_2902274;

import java.util.Scanner;

public class suma {
    public static void main( String[] args )
    {
        //entradas
    
        System.out.println("2. Suma de 2 numeros");
        System.out.println("ingrese un numero");


        Scanner src = new Scanner(System.in);
        int n1 = src.nextInt();


        System.out.println("ingrese otro numero");
        int n2 = src.nextInt();

        //proceso

        int result = n1+n2;

        //salida

        System.out.println("el resultado de la suma es " +result);

    }
}

