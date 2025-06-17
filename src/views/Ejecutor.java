/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package views;

// Importación de controladores
import java.util.Scanner;

// FOR
import forcontroller.Numeros_10;
import forcontroller.Practicafor;
import forcontroller.Primos;
import forcontroller.Raiz_de1_numero;
import forcontroller.Tabla;

// WHILE
import whilecontroller.Digitos_1_numero;
import whilecontroller.Suma_1000;
import whilecontroller.Raiz_Cubica;
import whilecontroller.Revertir_numero;

// DO WHILE
import Dowhilecontroller.Vocales;
import Dowhilecontroller.Edades;
import Dowhilecontroller.Menu;
import Dowhilecontroller.Potencia;

// SWITCH
import Switchcontroller.Cajero;
import Switchcontroller.Dias_mes;
import Switchcontroller.Imc;
import Switchcontroller.Figuras;
import Switchcontroller.Notas;

// PRACTICA
import Practicacontroller.Interes;
import Practicacontroller.Inventario;
import Practicacontroller.llamadas;
import Practicacontroller.pedidos;
import Practicacontroller.serie;

public class Ejecutor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        boolean continuar = true;

        // Crear objetos
        Numeros_10 ejercicio1 = new Numeros_10();
        Practicafor ejercicio2 = new Practicafor();
        Primos ejercicio3 = new Primos();
        Raiz_de1_numero ejercicio4 = new Raiz_de1_numero();
        Tabla ejercicio5 = new Tabla();
        
        Digitos_1_numero ejercicio6 = new Digitos_1_numero(); 
        Suma_1000 ejercicio7 = new Suma_1000(); 
        Raiz_Cubica ejercicio8 = new Raiz_Cubica();
        Revertir_numero ejercicio9 = new Revertir_numero();
        
        Vocales ejercicio10 = new Vocales();
        Edades ejercicio11 = new Edades();
        Menu ejercicio12 = new Menu();
        Potencia ejercicio13 = new Potencia();
        
        Cajero ejercicio14 = new Cajero();
        Dias_mes ejercicio15 = new Dias_mes();
        Imc ejercicio16 = new Imc();
        Figuras ejercicio17 = new Figuras();
        Notas ejercicio18 = new Notas();
        
        Interes ejercicio19 = new Interes();
        Inventario ejercicio20 = new Inventario();
        llamadas ejercicio21 = new llamadas();
        pedidos ejercicio22 = new pedidos();
        serie ejercicio23 = new serie();

        while (continuar) {
            // Mostrar menú
            System.out.println("Ejercicios");
            System.out.println("FOR:");
            System.out.println(" 1. Suma tres números igual a 10");
            System.out.println(" 2. Números no divisibles para 3 y 5");
            System.out.println(" 3. Números primos del 2 al 17");
            System.out.println(" 4. Raíz cuadrada entera");
            System.out.println(" 5. Tabla del 12");
            System.out.println("WHILE:");
            System.out.println(" 6. Contar dígitos de un número");
            System.out.println(" 7. Sumar hasta 1000");
            System.out.println(" 8. Raíz cúbica entera");
            System.out.println(" 9. Invertir número");
            System.out.println("DO WHILE:");
            System.out.println("10. Contar vocales");
            System.out.println("11. Contar mayores de edad");
            System.out.println("12. Menú interactivo");
            System.out.println("13. Potencias de 2 hasta 1000");
            System.out.println("SWITCH:");
            System.out.println("14. Cajero automático");
            System.out.println("15. Días del mes");
            System.out.println("16. IMC");
            System.out.println("17. Figuras geométricas");
            System.out.println("18. Convertir letra a nota");
            System.out.println("PRÁCTICA:");
            System.out.println("19. Simulación de préstamos");
            System.out.println("20. Inventario");
            System.out.println("21. Llamada internacional");
            System.out.println("22. Pedidos de tienda");
            System.out.println("23. Serie matemática");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción Ej:1,2,3..: ");
            opcion = sc.nextInt();

            // Ejecutar ejercicio según la opción
            switch (opcion) {
                case 1: ejercicio1.sumaTresNumerosIgualADiez(); break;
                case 2: ejercicio2.Numeros_no_divisibles_para_3y_5(); break;
                case 3: ejercicio3.numerosPrimos(); break;
                case 4: ejercicio4.raizCuadradaEntera(); break;
                case 5: ejercicio5.tablaDel12(); break;
                case 6: ejercicio6.contarDigitosDeUnNumero(); break;
                case 7: ejercicio7.sumarHastaMil(); break;
                case 8: ejercicio8.raizCubicaEntera(); break;
                case 9: ejercicio9.invertirNumero(); break;
                case 10: ejercicio10.contarVocales(); break;
                case 11: ejercicio11.contarMayoresDeEdad(); break;
                case 12: ejercicio12.mostrarMenuInteractivo(); break;
                case 13: ejercicio13.mostrarPotenciasDeDos(); break;
                case 14: ejercicio14.ejecutarCajero(); break;
                case 15: ejercicio15.mostrarDiasDelMes(); break;
                case 16: ejercicio16.clasificarImc(); break;
                case 17: ejercicio17.identificarFigura(); break;
                case 18: ejercicio18.Convertir_letra_a_Nota(); break;
                case 19: ejercicio19.simularPrestamo(); break;
                case 20: ejercicio20.Inventario(); break;
                case 21: ejercicio21.simularLlamada(); break;
                case 22: ejercicio22.pedidos(); break;
                case 23: ejercicio23.generarSerie(); break;
                case 0:
                    continuar = false;
                    System.out.println("Saludos");
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

            if (continuar) {
                System.out.print("¿Desea ejecutar otro ejercicio? (1 = Sí, 2 = No): ");
                int repetir = sc.nextInt();
                if (repetir != 1) {
                    continuar = false;
                    System.out.println("Gracias");
                }
            }
        }

        sc.close();
    }
}