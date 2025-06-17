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
public class Notas {

    // Método para convertir letras en notas
    public void Convertir_letra_a_Nota() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa una letra mayúscula: ");
        String letra = sc.nextLine();

        
        switch (letra) {
            case "A":
                System.out.println("Su nota es de 10");
                break;
            case "B":
                System.out.println("Su nota es de 9");
                break;
            case "C":
                System.out.println("Su nota es de 8");
                break;
            case "D":
                System.out.println("Su nota es de 7");
                break;
            case "E":
                System.out.println("Su nota es de 6");
                break;
            case "F":
                System.out.println("Su nota es de 5");
                break;
            case "G":
                System.out.println("Su nota es de 4");
                break;
            case "H":
                System.out.println("Su nota es de 3");
                break;
            case "I":
                System.out.println("Su nota es de 2");
                break;
            case "J":
                System.out.println("Su nota es de 1");
                break;
            case "K":
                System.out.println("Su nota es de 0");
                break;

            default:
                System.out.println("Letra no válida. Intente de nuevo");
                
                return;
        }

    }   
}
    

