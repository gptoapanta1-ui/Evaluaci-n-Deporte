/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluaciondeportista;

/**
 *
 * @author user
 */
public class CalculoRendimiento {

    public static double calcularPromedio(double[] marcas) {
        double suma = 0;
        for (int i = 0; i < marcas.length; i++) {
            suma += marcas[i];
        }
        return suma / marcas.length;
    }

    public static boolean rendimientoAlto(double promedio) {
        return promedio >= 80;
    }

   
    public static double aplicarMejora(double promedio) {
        return promedio + 5;
    }
}

