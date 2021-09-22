/*
 construir un programa que calcule el area y el perimetro de un cuadrilatero 
dado la longitud sus lados
 */
package javaudemy0;

import java.util.Scanner;

/**
 *
 * @author milla
 */
public class JavaUdemy0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // diagrama de clases
        cuadrilatero c1;
        float lado1;
        float lado2;
        
        //clase escanner para introducir datos 
        Scanner teclas = new Scanner(System.in);
        System.out.println("Introduzca el lado 1");
        lado1= teclas.nextInt();
        
        System.out.println("Introduzca el lado 2");
        lado2= teclas.nextInt();
        
        if(lado1 == lado2){
            //es un cuadrado
            c1 = new cuadrilatero (lado1);
        }else{
            c1 = new cuadrilatero(lado1, lado2);//cuadrilatero que no es cuadrado
        }
        
        System.out.println("El perimetro es: "+c1.perimetro());
        System.out.println("El area es : "+c1.area());
    }
    
}
