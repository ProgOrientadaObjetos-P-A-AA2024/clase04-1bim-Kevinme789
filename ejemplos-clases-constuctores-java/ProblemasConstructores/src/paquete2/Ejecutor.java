/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        String ciudad;
        int doctores;
        int pacientes;
        System.out.println("Ingrese el nombre del hospital:");
        nombre = sc.nextLine();
        System.out.println("Ingrese la ciudad:");
        ciudad = sc.nextLine();
        System.out.println("Ingrese la cantidad de doctores:");
        doctores = sc.nextInt();
        System.out.println("Ingrese la cantidad de pacientes:");
        pacientes = sc.nextInt();
        /*Crear un objeto y presentar los datos
        Ingresar la información por teclado.
         */

        Hospital presentar = new Hospital(nombre, ciudad, doctores, pacientes);
        System.out.printf("Nombre de el hospital: %s\nCiudad: %s\nNumero de"
                + " doctores: %d\nNumero de pacientes: %d\n",
                presentar.obtenerNombre(), presentar.obtenerCiudad(),
                presentar.obtenerNumeroDoctores(), presentar.obtenerNumeroEnfermeros());
        Hospital h1 = new Hospital("Militar", "Loja", 1000, 3000);

        h1.establecerNombre("Hospital Militar Privado");

        Hospital h2 = new Hospital("Militar DOS", "Loja", 1000, 3000);

        System.out.printf("%s\n", h1);
        System.out.printf("%s\n", h2);

    }
}
