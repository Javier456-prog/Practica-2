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
public class Inventario {
    
     public void Inventario() {
        //Una tienda quiere procesar la lista de productos en stock. Por cada producto,
        //si la cantidad es menor a 5, agregarlo a la orden de reposición. 
        //Además, calcular el total de unidades a reabastecer. 
        
        Scanner sc = new Scanner(System.in);

        String productosReabastecer = ""; //  productos a reabastecer
        int totalUnidadesReabastecer = 0; // contar el total de unidades a reabastecer

        // para agregar productos
        boolean agregarOtro = true;

        do {
          
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = sc.nextLine();

            
            System.out.print("Ingrese la cantidad: ");
            int cantidad = sc.nextInt();
            sc.nextLine(); //

            //si la cantidad es menor a 5, agregarlo a la orden de reposición. 
            if (cantidad < 5) {
              
                productosReabastecer += nombreProducto + ", ";
                totalUnidadesReabastecer++; // Aumentar el total de unidades a reabastecer
            }

            // Opcion para agregar otro producto
            System.out.print("Desea agregar otro producto? (Si: 1, No: 2): ");
            int respuesta = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer
            if (respuesta == 2) {
                agregarOtro = false;
            }

        } while (agregarOtro);

        // Mostrar el total de unidades a reabastecer
        if (totalUnidadesReabastecer > 0) {
            System.out.println("Total de unidades a reabastecer: " + totalUnidadesReabastecer);
            System.out.println("Productos a reabastecer: " + productosReabastecer.substring(0, productosReabastecer.length() - 2)); 
        } else {
            System.out.println("No hay productos para reabastecer.");
        }

        sc.close();
    }
}
    

