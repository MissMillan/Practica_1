/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaudemy0;

/**
 *
 * @author milla
 */
public class cuadrilatero {
    //atributos
    private float lado1;
    private float lado2;
    
    //metodos de getters y setters
    
    
    
    //metodos
    public float perimetro(){//es la suma de todos los lados
        
        float perimetro = 2 *(lado1+lado2);
        return perimetro;
    }//ambosmetodos me retornan valores
     
    public float area(){//es la multi. de base por altura
        float area = (lado1*lado2);
        return area;
    }
    
    
    
    //constructor
//metodo constructor 1 (cuadrilatero, rectangulo)
    public cuadrilatero(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //metodo constructor 2 (cuadrado)
    public cuadrilatero(float lado1) {
        this.lado1 = this.lado2 = lado1;
    }

   
    
}
