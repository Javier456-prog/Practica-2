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
public class Divisores {
    public void minimoComunMultiplo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int numero2 = sc.nextInt();

        int a = numero1;
        int b = numero2;

        // Algoritmo de Euclides para el MCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int mcm = (numero1 * numero2) / a;

        System.out.println("El Mínimo Común Múltiplo de " + numero1 + " y " + numero2 + " es: " + mcm);
    }
}
    

