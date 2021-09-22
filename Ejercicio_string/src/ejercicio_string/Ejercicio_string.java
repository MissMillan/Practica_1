
package ejercicio_string;

import java.util.Scanner;

public class Ejercicio_string {

       public static Scanner s = new Scanner(System.in);//la clase es scanner y tu le das el nombre a esta clase
       public static void main(String[] args) {
       int edad;
       double nota1 = 0.0;
      
       System.out.println("Ingrese su edad"); //esto es el printf
       edad = Integer.parseInt(s.nextLine());//esto es el scanf, con el nombre de la variable= al tipo de dato
       System.out.println("Ingrese su nota");
       nota1 = Double.valueOf(s.nextLine());
       System.out.println(" Su edad es " + edad + " Su nota es " + nota1);
        System.out.println("Ingrese su nombre");
        String nombre = s.nextLine();;
        
        System.out.println(" su edad es " + edad + " su nota es " + nota1 + " y su nombre es " + nombre);
               System.out.println("NUEVO CAMBIO");
    }
    
}
