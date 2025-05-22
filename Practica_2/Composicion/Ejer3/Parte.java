/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prac.com3;

// Clase Parte
public class Parte {
    private String nombre;
    private double peso;

    // Constructor
    public Parte(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    // Método para mostrar información de la parte
    public void mostrarInfo() {
        System.out.println("Parte: " + nombre + ", Peso: " + peso + " kg");
    }
}
