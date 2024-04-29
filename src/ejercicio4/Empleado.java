/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    private double salario;

    
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    
    public void mostrarInformacionCompleta() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: $" + salario);
    }

    
    public void mostrarInformacionSinSalario() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
    }

    
    public void incrementarSalario(double incremento) {
        salario += incremento;
        System.out.println("El salario ha sido incrementado en $" + incremento);
    }

    
    public void incrementarSalario(double incremento, double porcentajeDesempenio) {
        double aumento = incremento * (porcentajeDesempenio / 100.0);
        salario += aumento;
        System.out.println("El salario ha sido incrementado en $" + aumento + " según el desempeño del empleado.");
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese el apellido del empleado:");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese la edad del empleado:");
        int edad = scanner.nextInt();
        System.out.println("Ingrese el salario del empleado:");
        double salario = scanner.nextDouble();

        
        Empleado empleado = new Empleado(nombre, apellido, edad, salario);

        
        System.out.println("\nInformación completa del empleado:");
        empleado.mostrarInformacionCompleta();

        
        empleado.incrementarSalario(500);
        System.out.println("Nuevo salario: $" + empleado.salario);

        
        empleado.incrementarSalario(500, 10); // Incremento de $500 con un 10% de aumento
        System.out.println("Nuevo salario: $" + empleado.salario);

        scanner.close();
    }
}

    

