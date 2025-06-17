/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package forcontroller;

/**
 *
 * @author DELL
 */
public class Numeros_10 {
    public void sumaTresNumerosIgualADiez() {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                for (int k = 0; k <= 10; k++) {
                    if (i + j + k == 10) {
                        System.out.println(i + " + " + j + " + " + k + " = 10");
                    }
                }
            }
        }
    }

    
}
