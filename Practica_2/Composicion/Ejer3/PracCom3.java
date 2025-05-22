/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prac.com3;

/**
 *
 * @author WINDOWS 11
 */
public class PracCom3 {

  
    public static void main(String[] args) {
       
        Avion avion1 = new Avion("Boeing 747", "Boeing");

        avion1.agregarParte(new Parte("Motor", 1500));
        avion1.agregarParte(new Parte("Ala izquierda", 800));
        avion1.agregarParte(new Parte("Ala derecha", 800));
        avion1.agregarParte(new Parte("Tren de aterrizaje", 500));

 
        avion1.mostrarAvion();
    }
}


