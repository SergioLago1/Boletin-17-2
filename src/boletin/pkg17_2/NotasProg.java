/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg17_2;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class NotasProg {

    int notas[] = new int[4];

    public void cargarArray() {

        for (int i = 0; i < notas.length; i++) {

            notas[i] = pedirNota();
        }

    }

    public int pedirNota() {
        int resultado;

        do {

            resultado = Integer.parseInt(JOptionPane.showInputDialog("Introduzca o resultado"));
        } while (resultado < 1 || resultado > 10);
        return resultado;

    }

    public void visualizarValoracion() {

        int naprobados = 0;
        int nsuspensos = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 5) {
                naprobados++;

            } else if (notas[i] < 5) {
                nsuspensos++;

            }
        }
        System.out.println("El nº de aprobados es de " + naprobados);
        System.out.println("El nº de suspensos es de " + nsuspensos);
    }

    public void notaMediaClase() {

        int acu = 0;

        for (int i = 0; i < notas.length; i++) {

            acu = acu + notas[i];
        }
        System.out.println("La nota media de clase es de " + acu / notas.length);
    }

    public void notaMasAlta() {

        for (int i = 0; i < notas.length; i++) {

        }
    }
}
