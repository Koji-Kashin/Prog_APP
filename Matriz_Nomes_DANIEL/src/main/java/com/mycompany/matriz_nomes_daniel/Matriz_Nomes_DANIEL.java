/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.matriz_nomes_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Matriz_Nomes_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomes[][] = new String[2][4];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite nome: ");
                nomes[i][j] = ler.nextLine();

            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("\n"+nomes[i][j]);
            }

        }
    }
}
