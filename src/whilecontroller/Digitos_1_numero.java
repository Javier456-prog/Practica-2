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
public class Digitos_1_numero {
    public void contarDigitosDeUnNumero() {
        Scanner sc = new Scanner(System.in);
        int num;
        int cont = 0;

        System.out.print("Ingresa el número que deseas contar los dígitos: ");
        num = sc.nextInt();

        if (num == 0) {
            cont = 1;
        } else {
            while (num > 0) {
                num = num / 10;
                cont++;
            }
        }

        System.out.println("El número tiene " + cont + " dígito(s).");
    }
}
    

