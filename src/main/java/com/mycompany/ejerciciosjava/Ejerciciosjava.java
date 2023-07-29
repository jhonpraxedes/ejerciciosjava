/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosjava;

/**
 *
 * @author Praxe
 */
public class Ejerciciosjava {

     public static void main(String[] args) {
        double area, radio;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.nextDouble();
            area = Math.PI*(radio*radio);
            System.out.println("El área del Círculo resultante es: " + area);
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }        
    
    }
}
