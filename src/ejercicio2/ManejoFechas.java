/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author USUARIO
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ManejoFechas {

    
    public long calcularDiasTranscurridos(int dia, int mes, int año) {
        LocalDate fechaInicial = LocalDate.of(año, mes, dia);
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaInicial, fechaActual);
    }

   
    public long calcularDiasTranscurridos(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate fechaInicial = LocalDate.parse(fecha, formatter);
        LocalDate fechaActual = LocalDate.now();
        return ChronoUnit.DAYS.between(fechaInicial, fechaActual);
    }

    
    public boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || año % 400 == 0;
    }

    
    public LocalDate obtenerFechaHoy() {
        return LocalDate.now();
    }

   
    public static void main(String[] args) {
        ManejoFechas manejador = new ManejoFechas();

     
        System.out.println("Dias transcurridos desde el 1/1/2000: " + manejador.calcularDiasTranscurridos(1, 1, 2000));

  
        System.out.println("Dias transcurridos desde el 1/1/2000: " + manejador.calcularDiasTranscurridos("01/01/00"));

  
        System.out.println("El año 2000 es bisiesto? " + manejador.esBisiesto(2000));
        System.out.println("El año 2001 es bisiesto? " + manejador.esBisiesto(2001));

     
        System.out.println("Fecha de hoy: " + manejador.obtenerFechaHoy());
    }
}
