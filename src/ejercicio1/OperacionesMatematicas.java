/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class OperacionesMatematicas {


    public int sumar(int a, int b) {
        return a + b;
    }

    public int restar(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }


    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return a / b;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesMatematicas operaciones = new OperacionesMatematicas();

      
        System.out.println("Ingrese el primer numero entero:");
        int entero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero entero:");
        int entero2 = scanner.nextInt();

   
        System.out.println("Suma de enteros: " + operaciones.sumar(entero1, entero2));
        System.out.println("Resta de enteros: " + operaciones.restar(entero1, entero2));
        System.out.println("Multiplicación de enteros: " + operaciones.multiplicar(entero1, entero2));
        try {
            System.out.println("Division de enteros: " + operaciones.dividir(entero1, entero2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

  
        System.out.println("Ingrese el primer numero decimal:");
        double decimal1 = scanner.nextDouble();
        System.out.println("Ingrese el segundo numero decimal:");
        double decimal2 = scanner.nextDouble();

   
        System.out.println("Suma de decimales: " + operaciones.sumar(decimal1, decimal2));
        System.out.println("Resta de decimales: " + operaciones.restar(decimal1, decimal2));
        System.out.println("Multiplicacion de decimales: " + operaciones.multiplicar(decimal1, decimal2));
        try {
            System.out.println("Division de decimales: " + operaciones.dividir(decimal1, decimal2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
