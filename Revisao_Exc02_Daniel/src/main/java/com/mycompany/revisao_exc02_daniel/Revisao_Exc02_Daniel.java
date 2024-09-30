/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc02_daniel;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DFR
 */
public class Revisao_Exc02_Daniel {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1, num2 = 0;

        System.out.print("Digite o primeiro numero (INTEIRO): ");
        num1 = sc.nextInt();

        System.out.print("Agora, digite o segundo numero (INTEIRO): ");
        num2 = sc.nextInt();

        if ((num1 >= 0) && (num2 >= 0)) {
            System.out.printf("A soma de " + num1 + " + " + num2 + " eh  = " + (num1 + num2));
        } else {
            System.out.printf("Numero(s) invalido(s), tente novamente \n");

        }

    }
}
