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
public class Edades {
     public void contarMayoresDeEdad() {
        Scanner sc = new Scanner(System.in);

        int edad, mayores = 0;
        char continuar;

        do {
            System.out.print("Ingresa una edad: ");
            edad = sc.nextInt();

            if (edad >= 18) {
                mayores++;
            }

            System.out.print("¿Deseas ingresar otra edad? (s/n): ");
            continuar = sc.next().toLowerCase().charAt(0);  

        } while (continuar == 's');

        System.out.println("Cantidad de mayores de edad: " + mayores);
    }
}