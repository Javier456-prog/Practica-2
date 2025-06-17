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
public class Suma_1000 {
    public void sumarHastaMil() {
        Scanner entrada = new Scanner(System.in);
        int suma = 0;
        int numero;

        System.out.println("Ingresa números hasta que la suma supere 1000:");

        while (suma <= 1000) {
            System.out.print("Ingresa un número: ");
            numero = entrada.nextInt();
            suma += numero;
        }

        System.out.println("La suma ha superado 1000. Total: " + suma);
    }
}
    

