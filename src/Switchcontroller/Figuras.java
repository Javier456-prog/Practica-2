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
public class Figuras {

    // Método para identificar la figura por número de lados
    public void identificarFigura() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número de lados de la figura geométrica (1 al 20): ");
        int Numero = sc.nextInt();

        
        switch (Numero) {
            case 3:
                System.out.println("La figura es un Triangulo");
                break;
            case 4:
                System.out.println("La figura es un Cuadrado");
                break;
            case 5:
                System.out.println("La figura es un Pentagno");
                break;
            case 6:
                System.out.println("La figura es un Hexagono");
                break;
            case 7:
                System.out.println("La figura es un Heptagono");
                break;
            case 8:
                System.out.println("La figura es un Octagono");
                break;
            case 9:
                System.out.println("La figura es un Nonágono");
                break;
            case 10:
                System.out.println("La figura es un Decágono");
                break;
            case 11:
                System.out.println("La figura es un Endecágono");
                break;
            case 12:
                System.out.println("La figura es un Dodecágono");
                break;
            case 13:
                System.out.println("La figura es un Tridecágono");
                break;
                
            case 14:
                System.out.println("La figura es un Tetradecágono");
                break;
            
            case 15:
                System.out.println("La figura es un Pentadecágono");
                break; 
             
            case 16:
                System.out.println("La figura es un Hexadecágono");
                break; 
                
            case 17:
                System.out.println("La figura es un Heptadecágono");
                break;  
                
            case 18:
                System.out.println("La figura es un Octadecágono");
                break; 
                
            case 19:
                System.out.println("La figura es un Eneadecágono");
                break;     
                
            case 20:
                System.out.println("La figura es un Eneadecágono");
                break; 
                
                
            default:
                System.out.println("Numero no valido");
                
                return;
        }

      }      
    }
    

