/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.prac2_5;

import java.util.ArrayList;

/**
 *
 * @author WINDOWS 11
 */
public class Prac2_5 {

    public static void main(String[] args) {
      
        ArrayList<Gerente> gerentes = new ArrayList<>();
        gerentes.add(new Gerente("jgawin", " joss", 100, 9, "marketing", 100));
        gerentes.add(new Gerente("top", "Titr", 800, 4, "cocina", 400));

        ArrayList<Desarrolador> desarrolladores = new ArrayList<>();
        desarrolladores.add(new Desarrolador("sofia", "lopes", 2500, 2, "Java", 45));
        desarrolladores.add(new Desarrolador("pedro", "peres", 4500, 3, "Python",6));

        System.out.println("== Salarios ==");
        for (Gerente g : gerentes) g.mostrar();
        for (Desarrolador d : desarrolladores) d.mostrar();

        //inciso v
        System.out.println("\n== Gerentes con bono > 1000 ==");
        for (Gerente g : gerentes) {
            if (g.getBonoGerencial() > 1000) {
                g.mostrar();
            }
        }

        // d) Desarrolladores con > 10 horas extras
        System.out.println("\n== Desarrolladores con más de 10 horas extras ==");
        Iterable<Desarrolador> desarroladores = null;
        for (Desarrolador d : desarroladores) {
            if (d.getHorasExtras() > 10) {
                d.mostrar();
            }
        }
    }
}


