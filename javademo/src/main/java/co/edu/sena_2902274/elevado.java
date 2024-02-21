package co.edu.sena_2902274;
import java.util.Scanner;

public class elevado {
 public static void main( String[] args )
    {
        //entradas
    
        System.out.println("3. numero elevado al cuadrado");
        System.out.println("Ingrese un numero para elevarlo al cuadrado");


        Scanner src = new Scanner(System.in);
        int n1 = src.nextInt();

        //proceso

        int result = n1*n1;

        //salida

        System.out.println("el numero elevado al cuadrado es " +result);

    }
}
    

