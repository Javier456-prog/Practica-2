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
public class Imc {
    public void clasificarImc() {
        Scanner sc = new Scanner(System.in);
        float imc;
        int categoria = 0;

        System.out.print("Ingrese su IMC: ");
        imc = sc.nextFloat();

        // Clasificación del IMC
        if (imc < 18.5) {
            categoria = 1;
        } else if (imc >= 18.5 && imc <= 24.9) {
            categoria = 2;
        } else if (imc >= 25 && imc <= 29.9) {
            categoria = 3;
        } else if (imc >= 30) {
            categoria = 4;
        } else {
            categoria = 0;
        }

        // Mostrar categoría según el valor
        switch (categoria) {
            case 1:
                System.out.println("Bajo peso");
                break;
            case 2:
                System.out.println("Normal");
                break;
            case 3:
                System.out.println("Sobrepeso");
                break;
            case 4:
                System.out.println("Obesidad");
                break;
            default:
                System.out.println("Valor inválido");
        }
    }
}