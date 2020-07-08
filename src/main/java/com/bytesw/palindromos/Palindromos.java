/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bytesw.palindromos;

public class Palindromos {

    public static void main(String[] args) {
        String palabra = args[0];
        verificarPalabraPalindroma(palabra);
    }

    private static void verificarPalabraPalindroma(String palabra) {
        boolean resultado = true;
        String palabraEstandar = palabra.toUpperCase();

        String[] caracteres = palabraEstandar.split("");

        for (int i = 0; i < caracteres.length; i++) {
            if (!caracteres[i].equals(caracteres[(caracteres.length - 1) - i])) {
                resultado = false;
                break;
            }
        }

        if (resultado) {
            System.out.println("La palabra [" + palabra + "] es PALINDROMA");
        } else {
            System.out.println("La palabra [" + palabra + "] no es PALINDROMA");
        }
    }

}
