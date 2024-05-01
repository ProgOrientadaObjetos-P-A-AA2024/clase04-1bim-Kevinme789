/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class EjecutableTres {
    
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersonal = new Computadora();
        computadoraPersonal.establecerTipoProcesador("Intel VPRO");
        
        System.out.printf("Computadora\n"
                + "Procesador: %s\n"
                + "Memoria: %.2f GB\n",
                computadoraPersonal.obtenerTipoProcesador(),
                computadoraPersonal.obtenerMemoria());
        
    }
}
