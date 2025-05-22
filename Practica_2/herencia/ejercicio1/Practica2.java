/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

/**
 *
 * @author WINDOWS 11
 */
public class Practica2 {


    public static void main(String[] args) {
       
        Coche coche1 = new Coche(" suprime", "45FGG", 2025, 2340, 4, "Gas");
        Coche coche2 = new Coche("Tesla", "Model 3", 2025, 35000, 5, "Eléctrico");
        Moto moto1 = new Moto(" toyota", "5t", 2024, 4000, 31, "06");
        Moto moto2 = new Moto(" ford", "kgh", 2025, 1500, 70, "05");

       
        System.out.println("--- Coche 1 ---");
        coche1.mostrarinfo();
        System.out.println("\n--- Coche 2 ---");
        coche2.mostrarinfo();
        System.out.println("\n--- Moto 1 ---");
        moto1.mostrarinfo();
        System.out.println("\n--- Moto 2 ---");
        moto2.mostrarinfo();

     
    }
}


