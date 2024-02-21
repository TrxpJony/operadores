package co.edu.sena_2902274;

import java.util.Scanner;

public class promedio {

        public static void main( String[] args )
    {
        //entradas
    
        System.out.println("8. Calcular el promedio de 3 numeros");
        System.out.println("Ingrese el primer numero");


        Scanner src = new Scanner(System.in);
        double n1 = src.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double n2 = src.nextDouble();

        System.out.println("Ingrese el tercer numero");
        double n3 = src.nextDouble();

        //proceso

        double promedio = (n1+n2+n3)/3;
     

        //salida

        System.out.println("El promedio de los numeros es "+promedio);

    }
    
}
