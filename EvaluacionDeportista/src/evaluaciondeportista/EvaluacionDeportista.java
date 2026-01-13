/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluaciondeportista;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class EvaluacionDeportista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        Deportista dep = EntradadeDatos.leerDeportista(sc);

        double promedio = CalculoRendimiento.calcularPromedio(dep.marcas);
        boolean alto = CalculoRendimiento.rendimientoAlto(promedio);

        System.out.print("¿Desea aplicar mejora? (1=Sí / 0=No): ");
        int op = sc.nextInt();

        if (op == 1) {
    Mejora mejora = new MejoraBasica();
    promedio = mejora.aplicar(promedio);
}

        ReporteRendimiento.mostrar(dep, promedio, alto);

        sc.close();
    }
}
        
    
   

