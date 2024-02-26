package co.edu.sena_2902274;

import java.util.Scanner;

public class radio {

public static void main(String[] args) {

//entradas

System.out.println("Calcular la longitud y área de una circunferencia");

Scanner scr = new Scanner(System.in);

System.out.println("Ingrese el radio de la circunferencia ");
double rad = scr.nextDouble();

//proceso

double longitud = ( 2 * Math.PI * rad);
double area = ( Math.PI * Math.pow(rad, 2));

//resultado

System.out.println("La longitud de la circunferencia es: " + longitud );
System.out.println("El área de la circunferencia es: " + area);


}

}
