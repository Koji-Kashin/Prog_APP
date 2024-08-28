/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.nota_150_aluno_daniel;

/**
 *
 * @author d.rodrigues
 */
public class Nota_150_Aluno_DANIEL {

    public static void main(String[] args) {

        int n = 150;
        int soma = 0;
        float nota[] = new float[n];

        for (int i = 0; i < n; i++) {
            nota[i] = (float) (Math.random() * 10);
            soma += nota[i];
        }
        float media = soma / 150;
        
        System.out.println("Sua media foi: " +media);

    }
}
