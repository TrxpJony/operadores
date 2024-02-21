package co.edu.sena_2902274;

import java.util.Scanner;

public class area_volumen {

    public static void main( String[] args )
    {
        //entradas
    
        System.out.println("6. Calcular el area y volumen de un cilindro");
        System.out.println("Ingrese el radio de la base del cilindro");


        Scanner src = new Scanner(System.in);
        double Radio = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro");

        double Altura = src.nextDouble();

        //proceso

        double area = 2 * Math.PI *Radio* (Radio+Altura);
        double volumen = Math.PI * Math.pow(Radio, 2) * Altura;

        //salida

        System.out.println("El area del cilindro es " +area +" y el volumen " +volumen);

    }
    
}
