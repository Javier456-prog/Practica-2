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
public class Vocales {
    public void contarVocales() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa letras: ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int i = 0;

        do {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }

            i++;
        } while (i < palabra.length());

        System.out.println("El total de vocales es: " + vocales);
    }
}
