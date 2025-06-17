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
 public class Dias_mes {

    public void mostrarDiasDelMes() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre del mes (ej. Enero): ");
        String mes = sc.nextLine();

        switch (mes) {
            case "enero":
                System.out.println("Enero tiene 31 días");
                break;
            case "febrero":
                System.out.println("Febrero tiene 28 días (29 si es año bisiesto)");
                break;
            case "marzo":
                System.out.println("Marzo tiene 31 días");
                break;
            case "abril":
                System.out.println("Abril tiene 30 días");
                break;
            case "mayo":
                System.out.println("Mayo tiene 31 días");
                break;
            case "junio":
                System.out.println("Junio tiene 30 días");
                break;
            case "julio":
                System.out.println("Julio tiene 31 días");
                break;
            case "agosto":
                System.out.println("Agosto tiene 31 días");
                break;
            case "septiembre":
                System.out.println("Septiembre tiene 30 días");
                break;
            case "octubre":
                System.out.println("Octubre tiene 31 días");
                break;
            case "noviembre":
                System.out.println("Noviembre tiene 30 días");
                break;
            case "diciembre":
                System.out.println("Diciembre tiene 31 días");
                break;
            default:
                System.out.println("Mes no válido. Por favor ingresa un nombre correcto.");
        }
    }
}