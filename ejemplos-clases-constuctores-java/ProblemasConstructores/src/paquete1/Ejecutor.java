/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {

        /*Crear un objeto y presentar los datos*/
        Hospital h1 = new Hospital();
        Hospital h2 = new Hospital();
        System.out.printf("Nombre de el Hospital: %s\nCiudad: %s\n"
                + "Numero de doctores: %d\nNumero de enfermeros: %d\n",
                h2.obtenerNombre(), h2.obtenerCiudad(), h1.obtenerNumeroDoctores(),
                h2.obtenerNumeroEnfermeros());

        System.out.printf("%s\n", h1);

    }
}
