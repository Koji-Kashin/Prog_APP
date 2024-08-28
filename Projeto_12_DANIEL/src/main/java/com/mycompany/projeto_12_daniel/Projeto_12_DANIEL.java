/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_12_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Projeto_12_DANIEL {

    public static void main(String[] args) {
        filme_jogo();
        dicas_filme();
        attempt();

    }

    public static void filme_jogo() {
        System.out.print("Digite o nome do filme: ");
        Scanner ler = new Scanner(System.in);
        String filme;
        filme = ler.next();

    }

    public static void dicas_filme() {
        Scanner ler = new Scanner(System.in);
        String dicas[] = new String[5];
        for (int i = 0; i < dicas.length; i++) {
            System.out.println("Digite a dica " + i + ": ");
            dicas[i] = ler.next();

        }

    }

    public static void attempt() {
        //não consegui chamar as variavéis para verificação, tentarei até conseguir...
    }

}
