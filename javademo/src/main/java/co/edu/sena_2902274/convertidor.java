package co.edu.sena_2902274;
import java.util.Scanner;

public class convertidor {
    public static void main( String[] args )
    {
        //entradas
    
        System.out.println("4. Conversor de euros a dolares");
        System.out.println("Ingrese la cantidar de euros a convertir");


        Scanner src = new Scanner(System.in);
        double Euro = src.nextDouble();

        //proceso

        double result = Euro*1.08;

        //salida

        System.out.println("La cantidad de dolares es " +result);

    }
    
}
