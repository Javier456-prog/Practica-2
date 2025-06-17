/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicacontroller;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Interes {
   
    //Un banco concede préstamos de TIPO_PERSONAL, HIPOTECARIO o COFIDIS.
    //Cada tipo tiene su propia tasa de interés. Calcula la cuota mensual con 
    //la cuota mensual con la fórmula correspondiente y muestra amortización anual.
    
     public void simularPrestamo() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;
        
        while (continuar) {
            // Menú de opciones
            System.out.println("Simulación de préstamo bancario");
            System.out.println("1. Préstamo personal");
            System.out.println("2. Préstamo hipotecario");
            System.out.println("3. Cofidís");
            System.out.print("Seleccione el número del préstamo bancario que desea realizar: ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1: // Préstamo personal
                    System.out.println("Préstamo personal");
                    System.out.print("Ingrese capital solicitado: ");
                    double capital = sc.nextDouble();
                    System.out.print("Ingrese tasa de interés en forma decimal: ");
                    double tasaInteres = sc.nextDouble();
                    System.out.print("Ingrese tiempo en años: ");
                    int tiempo = sc.nextInt();
                    
                    // Cálculo del interés
                    double interesPersonal = capital * tasaInteres * tiempo;
                    System.out.println("Su interés es de: " + interesPersonal);
                    break;

                case 2: // Préstamo hipotecario
                    System.out.println("Préstamo hipotecario");
                    System.out.print("Ingrese el pago mensual: ");
                    double pagoMensual = sc.nextDouble();
                    System.out.print("Ingrese el monto del préstamo (principal): ");
                    double montoPrestamo = sc.nextDouble();
                    System.out.print("Ingrese la tasa de interés mensual:");
                    double tasaMensual = sc.nextDouble();
                    System.out.print("Ingrese el número total de pagos: ");
                    int pagosTotales = sc.nextInt();
                    
                    // Cálculo del interés hipotecario usando la fórmula de amortización
                    double interesHipotecario = (montoPrestamo * (tasaMensual * Math.pow(1 + tasaMensual, pagosTotales)) / (Math.pow(1 + tasaMensual, pagosTotales) - 1)) * pagosTotales - montoPrestamo;
                    System.out.println("Su interés es de: " + interesHipotecario);
                    break;
                    
                    case 3: // Cofidís
                    System.out.println("Cofidís");
                    System.out.print("Ingrese el capital o monto del préstamo: ");
                    double montoCofidis = sc.nextDouble();
                    System.out.print("Ingrese la tasa de interés anual (expresada en decimal): ");
                    double tasaCofidis = sc.nextDouble();
                    System.out.print("Ingrese el tiempo del préstamo en años: ");
                    int tiempoCofidis = sc.nextInt();
                    
                    // Cálculo del interés de Cofidís
                    double interesCofidis = montoCofidis * tasaCofidis * tiempoCofidis;
                    System.out.println("Su interés es de: " + interesCofidis);
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }

            // Preguntar si desea realizar otro tipo de préstamo
            System.out.print("Desea realizar otro tipo de préstamo? (Si: 1, No: 2): ");
            int respuesta = sc.nextInt();
            if (respuesta == 2) {
                continuar = false;
                System.out.println("Gracias por su atención. ¡Hasta pronto!");
            }
        }
        sc.close();
    }
}
    


