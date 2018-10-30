package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido, introduzca un número del 1 al 10.");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        number(x);
    }

    /*
    Función main para pedir el número
     */

    private static void number(int x) {
        switch (x) {
            case 0:
                System.out.println("Cero");
                break;
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Siete");
                break;
            case 8:
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10:
                System.out.println("Diez");
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    /*
    Función con un switch que saca por pantalla el resultado.
     */
}