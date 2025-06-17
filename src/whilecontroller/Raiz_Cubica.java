/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package whilecontroller;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Raiz_Cubica {

    public void raizCubicaEntera() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número con raíz cúbica perfecta: ");
        int numero = sc.nextInt();

        int raiz = 0;
        int i = 1;

        while (i * i * i <= numero) {
            raiz = i;
            i++;
        }

        System.out.println("La raíz cúbica entera de " + numero + " es: " + raiz);
    }
}

