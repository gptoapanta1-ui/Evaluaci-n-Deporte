/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package evaluaciondeportista;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EntradadeDatos {
    public static Deportista leerDeportista(Scanner sc) {
        System.out.print("Ingrese el nombre del deportista: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad de marcas: ");
        int n = sc.nextInt();

        double[] marcas = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese la marca " + (i + 1) + ": ");
            marcas[i] = sc.nextDouble();
        }

        return new Deportista(nombre, marcas);
    }
}

