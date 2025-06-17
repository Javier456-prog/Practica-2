/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forcontroller;

/**
 *
 * @author DELL
 */
public class Primos {
    public void numerosPrimos() {
        System.out.println("Números primos del 2 al 17:");

        for (int i = 2; i <= 17; i++) {
            int divisores = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                System.out.println(i);
            }
        }
    }

}
