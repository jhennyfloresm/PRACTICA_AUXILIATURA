/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac2_3;


/**
 *
 * @author WINDOWS 11
 */
public class Prac2_3 {
    public static void main(String[] args) {
        // Estudiantes
        Estudiante e1 = new Estudiante("11", "Rosa", 2004, "Chavez", "7771", "R11", "12/09/2024", "5");
        Estudiante e2 = new Estudiante("22", "Paolo", 2000, "Pilar", "7772", "P22", "12/09/2024", "5");
        Estudiante e3 = new Estudiante("33", "Lucia", 1999, "Torrez", "77773", "L33", "12/09/2024", "5");
        System.out.println("------ Estudiante 1 -------");
        e1.mostrar();
        System.out.println("\n------ Estudiante 2 -------");
        e2.mostrar();
        System.out.println("\n------ Estudiante 3 -------");
        e3.mostrar();

        // Docentes
        Docente d1 = new Docente("456123", "Maria", "Chavez", "79988776", 1987, "NIT321", "Ingeniero", "Femenino");
        Docente d2 = new Docente("67889985", "Armando", "Chavez", "67889985", 1991, "NIT322", "Ingeniero", "Masculino");

        System.out.println("\n------- Docente 1 --------");
        d1.mostrar();
        System.out.println("\n------- Docente 2 --------");
        d2.mostrar();

        // Lógica adicional
        Mayores25(e1);
        Mayores25(e2);
        Mayores25(e3);

        IngenieroMayor(d1);
        IngenieroMayor(d2);

        Apellidos(d1, e1);
        Apellidos(d2, e3);
    }

    public static void Mayores25(Estudiante e) {
        System.out.println("\n¿" + e.getNombre() + " tiene más de 25 años?");
        if (e.calcularEdad() > 25) {
            System.out.println("Sí. Edad: " + e.calcularEdad());
            e.mostrar();
        } else {
            System.out.println("No. Edad: " + e.calcularEdad());
        }
    }

    public static void IngenieroMayor(Docente d) {
        System.out.println("\nEvaluando docente masculino ingeniero más longevo:");
        if (d.getProfesion().equalsIgnoreCase("Ingeniero") && d.getSexo().equalsIgnoreCase("Masculino")) {
            System.out.println("Docente encontrado:");
            d.mostrar();
        } else {
            System.out.println("No cumple con los criterios.");
        }
    }

    public static void Apellidos(Docente d, Estudiante e) {
        if (d.getApellido().equalsIgnoreCase(e.getApellido())) {
            System.out.println("\nCoincidencia de apellidos encontrada: " + d.getApellido());
            d.mostrar();
            e.mostrar();
        }
    }
}


