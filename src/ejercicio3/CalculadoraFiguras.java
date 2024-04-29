/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author USUARIO
 */
public class CalculadoraFiguras {

    
    public void calcular(int lado) {
        System.out.println("Area del cuadrado: " + (lado * lado));
        System.out.println("Perimetro del cuadrado: " + (4 * lado));
    }

    
    public void calcular(int base, int altura) {
        System.out.println("Area del rectangulo: " + (base * altura));
        System.out.println("Perimetro del rectangulo: " + (2 * (base + altura)));
    }

    
    public void calcular(double radio) {
        double pi = Math.PI;
        System.out.println("Area del circulo: " + (pi * radio * radio));
        System.out.println("Perimetro del circulo: " + (2 * pi * radio));
    }

    
    public static void main(String[] args) {
        CalculadoraFiguras calculadora = new CalculadoraFiguras();

        
        System.out.println("Cuadrado:");
        calculadora.calcular(5);

        
        System.out.println("\nRectangulo:");
        calculadora.calcular(4, 6);

        
        System.out.println("\nCirculo:");
        calculadora.calcular(3.5);
    }
    
}
