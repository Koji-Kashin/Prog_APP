/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_nomes_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Projeto_nomes_Daniel {

    public static void main(String[] args) {
        String nome[] = new String[10];
        
        nomes(name);

    }

    public static void nomes() {
        Scanner ler = new Scanner(System.in);
        String nome[] = new String[10];

        for (int i = 0; i < nome.length; i++) {
            nome[i] = ler.nextLine();

        }
        for (int i = 0; i < 10; i++) {
            System.out.printf("\n" + nome[i]);

        }

    }
}
