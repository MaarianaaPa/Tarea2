package unam.fes.poo.tarea2;

import java.util.Scanner;

public class Tarea2 {

    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        System.out.println("Ingrese nombre, profesion y pais");
        String cadena = "";
        String[] espacio;
        cadena = lector.nextLine();
        espacio = cadena.split(" ");
        
        System.out.println("Nombre: " + espacio[0]);
        System.out.println("Profesion: " + espacio[1]);
        System.out.println("Pais: " + espacio[2]);
    }
}
