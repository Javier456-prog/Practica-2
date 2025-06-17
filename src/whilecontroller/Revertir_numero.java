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
public class Revertir_numero {

    public void invertirNumero() {
        Scanner sc = new Scanner(System.in);

        int inverso = 0;
        int numero;

        System.out.print("Ingresa el número que deseas invertir: ");
        numero = sc.nextInt();

        while (numero != 0) {
            int resto = numero % 10;
            inverso = inverso * 10 + resto;
            numero = numero / 10;
        }

        System.out.println("El número invertido es: " + inverso);
    }
}
        
    

 

    

