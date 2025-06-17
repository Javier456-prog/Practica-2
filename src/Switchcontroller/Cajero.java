/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Switchcontroller;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Cajero {

    public void ejecutarCajero() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
        double saldo = 0.0;   // Saldo inicial

        do {
            System.out.println("Menu principal");
            System.out.println("1. Depósito");
            System.out.println("2. Retiro");
            System.out.println("3. Consulta de saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese cantidad a depositar: ");
                    double deposito = sc.nextDouble();
          
                    System.out.println("Depósito exitoso.");
                    break;

                case 2:
                    System.out.print("Ingrese cantidad a retirar: ");
                    double retiro = sc.nextDouble();
                    
                        System.out.println("Retiro exitoso.");
                    break;

                case 3:
                    System.out.println("Tiene 100 dolares.");
                    break;
                
                case 4:
                    System.out.println("Gracias por usar nuestros servicios.");
                    break;    
                    

                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }

        } while (opcion != 4);
    }
}