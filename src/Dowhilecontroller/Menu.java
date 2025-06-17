/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dowhilecontroller;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Menu {

    public void mostrarMenuInteractivo() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menu principal");
            
            System.out.println("1. Saludar");
            
            System.out.println("2. Muestrame un dato que no sabia");
            
            System.out.println("3. Mostrar un color al azar");
            
            System.out.println("4. Salir");
            
            System.out.print("Selecciona un numero del 1 al 4: ");
            
            opcion = sc.nextInt();  // Leer la opción ingresada por el usuario

            if (opcion == 1) {
                System.out.println("Bienvenido");
                
            } else if (opcion == 2) {
                System.out.println("Cuando una persona muere tiene 7 horas de actividad cerebral");
                
            } else if (opcion == 3) {
                System.out.println("Azul");
                
            } else if (opcion == 4) {
                System.out.println("Gracias por ver");
                
            } else {
                System.out.println("Opción inválida. Selecciona otro numero.");
                
            }

        } while (opcion != 4);  // Condicion se repite
    }
}