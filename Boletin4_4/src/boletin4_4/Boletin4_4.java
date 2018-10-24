/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4_4;

/**
 *
 * @author clamascabaleiro
 */
public class Boletin4_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Comida comida1 = new Comida();
        comida1.engadirPolbo(50);
        comida1.engadirPatacas(50);
        System.out.println(comida1.getPolbo());
        System.out.println(comida1.getPatacas());
        System.out.println("El número de clientes a los que se le puede " + "servir comida es de " + comida1.calcularClientes());
    }
   }
    
