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
public class serie {
    //Reconozca, genere mediante teclado, y resuelva la siguiente serie
    //(1 / 1)^2 + (1 / 3)^4 - (2 / 5)^6 - (3 / 7)^8 + (5 / 9)^10 + (8 / 11)^12 ….
     public static void generarSerie() {
        Scanner scanner = new Scanner(System.in);
        
        // Variables 
        int a = 1, b = 1;  //primeros números de la serie Fibonacci
        int denominador = 1; // Denominador =1
        int contador = 1;    //ciclo de signos alternados
        int Numero_de_veces = 6; // Número de términos a generar en la secuencia

        // Usamos un ciclo for para generar la secuencia
        String resultado = "";
        
        // Usamos el ciclo for para imprimir la secuencia
        for (int i = 1; i <= Numero_de_veces; i++) {
            // Determinamos el signo alternado con switch
            String signo = "";
            switch (contador % 2) {
                case 0:
                    signo = "-";
                    break;
                case 1:
                    signo = "+";
                    break;
            }

            // Exponente
            int exponente = i * 2;

            // Agregar el término a la secuencia
            resultado += "(" + a + " / " + denominador + ")^" + exponente + " " + signo + " ";

            //los valores para Fibonacci y el denominador
            int temp = a;
            a = b;
            b = temp + b;

            denominador += 2; // Incrementamos el denominador en 2 para obtener los impares

            // Cambiar el contador para alternar el signo
            contador++;
        }

        //  secuencia final
        System.out.println(resultado.trim());
    }
}