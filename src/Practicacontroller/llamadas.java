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
public class llamadas {
  
    enum Zona {
        OCEANIA(29, 3.0),
        AMERICA_DEL_NORTE(12, 2.75),
        AMERICA_CENTRAL(15, 1.89),
        AMERICA_DEL_SUR(18, 1.60),
        EUROPA(19, 3.5),
        ASIA(23, 4.5),
        AFRICA(25, 3.1),
        RESTO_DEL_MUNDO(31, 6.0);

        private final int clave;
        private final double precioPorMinuto;

        Zona(int clave, double precioPorMinuto) {
            this.clave = clave;
            this.precioPorMinuto = precioPorMinuto;
        }

        public double getPrecioPorMinuto() {
            return precioPorMinuto;
        }

        public String getNombreZona() {
            return name();
        }
    }

    public void simularLlamada() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la zona de destino:");
        System.out.println("1. OCEANIA");
        System.out.println("2. AMERICA_DEL_NORTE");
        System.out.println("3. AMERICA_CENTRAL");
        System.out.println("4. AMERICA_DEL_SUR");
        System.out.println("5. EUROPA");
        System.out.println("6. ASIA");
        System.out.println("7. AFRICA");
        System.out.println("8. RESTO_DEL_MUNDO");

        int opcion = sc.nextInt();

        System.out.print("Ingrese la cantidad de minutos de la llamada: ");
        int minutos = sc.nextInt();

        Zona zonaSeleccionada = null;

        switch (opcion) {
            case 1: zonaSeleccionada = Zona.OCEANIA; break;
            case 2: zonaSeleccionada = Zona.AMERICA_DEL_NORTE; break;
            case 3: zonaSeleccionada = Zona.AMERICA_CENTRAL; break;
            case 4: zonaSeleccionada = Zona.AMERICA_DEL_SUR; break;
            case 5: zonaSeleccionada = Zona.EUROPA; break;
            case 6: zonaSeleccionada = Zona.ASIA; break;
            case 7: zonaSeleccionada = Zona.AFRICA; break;
            case 8: zonaSeleccionada = Zona.RESTO_DEL_MUNDO; break;
            default:
                System.out.println("Opción no válida");
                sc.close();
                return;
        }

        double costoTotal = zonaSeleccionada.getPrecioPorMinuto() * minutos;

        System.out.printf("El costo total de la llamada de %d minutos a la zona %s es: $%.2f\n",
                minutos, zonaSeleccionada.getNombreZona(), costoTotal);

        sc.close();
    }
}