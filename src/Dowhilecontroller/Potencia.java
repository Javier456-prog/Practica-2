/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dowhilecontroller;

/**
 *
 * @author DELL
 * 
 */


public class Potencia {

    public void mostrarPotenciasDeDos() {
        int contador = 2;

        do {
            System.out.println("Potencia: " + contador);
            contador *= 2;
        } while (contador <= 1024);
    }
}
