/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.persistencia3;

/**
 *
 * @author WINDOWS 11
 */
public class PruebaClienteArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "clientes.dat"; 
        ArchivoCliente gestorClientes = new ArchivoCliente(nombreArchivo);

        gestorClientes.crearArchivo(); 

        Cliente cliente1 = new Cliente(1, "carlos", 4555555);
        Cliente cliente2 = new Cliente(2, "loov ", 7243);
        Cliente cliente3 = new Cliente(3, "roberto", 15566);

        gestorClientes.guardaCliente(cliente1);
        gestorClientes.guardaCliente(cliente2);
        gestorClientes.guardaCliente(cliente3);

        gestorClientes.mostrarTodosLosClientes();

        System.out.println("\n Probando búsqueda por ID ");
        Cliente clienteBuscado1 = gestorClientes.buscarCliente(2); 
        if (clienteBuscado1 != null) {
            System.out.println("Resultado de búsqueda (ID 2): " + clienteBuscado1);
        }

        Cliente clienteBuscadoNoExiste = gestorClientes.buscarCliente(99); 
        if (clienteBuscadoNoExiste == null) {
            System.out.println("Resultado de búsqueda (ID 99): Cliente no encontrado como se esperaba.");
        }

        System.out.println("\n Probando búsqueda de Celular por ID ");
        Cliente clienteCelular1 = gestorClientes.buscarCelularCliente(1); 
        if (clienteCelular1 != null) {
            System.out.println("Resultado de búsqueda de celular (ID 1): " + clienteCelular1);
        }

        Cliente clienteCelularNoExiste = gestorClientes.buscarCelularCliente(100); 
        if (clienteCelularNoExiste == null) {
            System.out.println("Resultado de búsqueda de celular (ID 100): Cliente no encontrado como se esperaba.");
        }

        System.out.println("\n Simulación de nueva ejecución del programa ");
        ArchivoCliente nuevoGestor = new ArchivoCliente(nombreArchivo);
        nuevoGestor.mostrarTodosLosClientes(); 
        System.out.println("\n Añadiendo un nuevo cliente en la nueva ejecución ");
        Cliente cliente4 = new Cliente(4, "Roberto Paz", 7228899);
        nuevoGestor.guardaCliente(cliente4);
        nuevoGestor.mostrarTodosLosClientes();
    }
}