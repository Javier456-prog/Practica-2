/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forcontroller;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Raiz_de1_numero {
     public void raizCuadradaEntera() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número con raíz perfecta: ");
        int numero = sc.nextInt();

        int raiz = 0;

        for (int i = 1; i * i <= numero; i++) {
            raiz = i;
        }

        System.out.println("La raíz cuadrada entera de " + numero + " es: " + raiz);
    }  
    
}
