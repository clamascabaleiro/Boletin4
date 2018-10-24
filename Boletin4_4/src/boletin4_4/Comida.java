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
public class Comida {

    private double polbo = 0;
    private double patacas = 0;

    public double getPolbo() {
        return polbo;
    }

    public double getPatacas() {
        return patacas;
    }

    public void setPolbo(double polbo) {
        this.polbo = polbo;
    }

    public void setPatacas(double patacas) {
        this.patacas = patacas;
    }

    public void engadirPolbo(int x) {
        polbo += x;
    }

    public void engadirPatacas(int x) {
        patacas += x;
    }

    public double calcularClientes() {
        double contador = 0;
        double polb = polbo;
        double patac = patacas;
        while (polb >= 2 && patac >= 1) {
            contador += 3;
            polb -= 2;
            patac -= 1;
        }
        return contador;
    }
}
