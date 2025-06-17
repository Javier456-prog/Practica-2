/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practicacontroller;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class pedidos {

    public void pedidos() {
        Scanner sc = new Scanner(System.in);

        // Precios de los productos
        double Canasta_basica = 30;
        double Utiles_de_limpieza = 20;
        double Materiales_de_estudio = 50;
        double Herramientas_de_cocina = 100;
        double Accesorios_para_el_hogar = 200;

        // Variables para el total de la compra y cupones de descuento
        double totalVentasNetas = 0;
        int cuponesDeDescuento = 0;

        // Variable para controlar el primer pedido
        boolean esPrimerPedido = true;

        // Crear Scanner para leer entradas
        int opcion;
        char respuesta;

        do {
            double totalCompra = 0;  // Total por cada compra

            // Menú de selección de productos
            System.out.println("\nSeleccione lo que desea comprar:");
            System.out.println("1. Canasta básica - $30");
            System.out.println("2. Útiles de limpieza - $20");
            System.out.println("3. Materiales de estudio - $50");
            System.out.println("4. Herramientas de cocina - $100");
            System.out.println("5. Accesorios para el hogar - $200");
            System.out.println("6. Finalizar compra");
            System.out.print("Elija una opción (1-6): ");
            opcion = sc.nextInt();

            // calcular el total de la compra
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la cantidad de Canasta básica: ");
                    int cantidadCanasta = sc.nextInt();
                    totalCompra += Canasta_basica * cantidadCanasta;
                    System.out.println("Has añadido Canasta básica a tu compra.");
                    break;
                case 2:
                    System.out.print("Ingresa la cantidad de Útiles de limpieza: ");
                    int cantidadUtiles = sc.nextInt();
                    totalCompra += Utiles_de_limpieza * cantidadUtiles;
                    System.out.println("Has añadido Útiles de limpieza a tu compra.");
                    break;
                case 3:
                    System.out.print("Ingresa la cantidad de Materiales de estudio: ");
                    int cantidadMateriales = sc.nextInt();
                    totalCompra += Materiales_de_estudio * cantidadMateriales;
                    System.out.println("Has añadido Materiales de estudio a tu compra.");
                    break;
                case 4:
                    System.out.print("Ingresa la cantidad de Herramientas de cocina: ");
                    int cantidadHerramientas = sc.nextInt();
                    totalCompra += Herramientas_de_cocina * cantidadHerramientas;
                    System.out.println("Has añadido Herramientas de cocina a tu compra.");
                    break;
                case 5:
                    System.out.print("Ingresa la cantidad de Accesorios para el hogar: ");
                    int cantidadAccesorios = sc.nextInt();
                    totalCompra += Accesorios_para_el_hogar * cantidadAccesorios;
                    System.out.println("Has añadido Accesorios para el hogar a tu compra.");
                    break;
                case 6:
                    System.out.println("Gracias por su compra.");
                    break;
                default:
                    System.out.println("Opción inválida. Ingrese un número válido.");
                    continue;
            }

            // Verificar si se aplica el descuento
            if (totalCompra > 100) {
                totalCompra *= 0.90; // Aplica un descuento del 10%
                System.out.println("Se ha aplicado un descuento del 10% en su compra.");
            }

            // Verificar si es el primer pedido y enviar un cupón
            if (esPrimerPedido && totalCompra > 0) {
                cuponesDeDescuento++;
                System.out.println("¡Te has ganado un cupón de descuento!");
                esPrimerPedido = false;  // Después de un primer pedido, no será más primer pedido
            }

            // Mostrar el total de la compra con descuento aplicado
            System.out.println("Total de la compra: $" + totalCompra);

            // Acumular el total de ventas netas
            totalVentasNetas += totalCompra;

            // Preguntar si el usuario desea seguir comprando
            if (opcion != 6) {
                System.out.print("¿Desea añadir otro producto? (1 = Sí, 2 = No): ");
                respuesta = sc.next().charAt(0);
                if (respuesta != '1') {
                    break; // Si el usuario no quiere seguir, se termina la compra
                }
            }

        } while (opcion != 6);  // Continuar hasta que elija finalizar compra

        // Mostrar el resumen final
        System.out.println("\nResumen de la compra:");
        System.out.println("Ventas netas totales: $" + totalVentasNetas);
        System.out.println("Cupones enviados: " + cuponesDeDescuento);
        System.out.println("Gracias por su compra.");
    }
}