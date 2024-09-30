/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc03_daniel;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author The Great Garibaldo
 */
public class Revisao_Exc03_Daniel {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int n1, n2 = 0;

        System.out.print("Digite o primeiro numero (INTEIRO): ");
        n1 = sc.nextInt();

        System.out.print("Agora, digite o segundo numero (INTEIRO): ");
        n2 = sc.nextInt();

        if ((n1 >= 0) && (n2 >= 0)) {
            System.out.printf("A soma de " + n1 + " + " + n2 + " eh = " + (n1 + n2));
        } else if ((n1 < 0) && (n2 < 0)) {
            System.out.printf("Soma de " + n1 + " com " + n2 + " = " + (n1 + n2));
        } else {
            System.out.printf("Para realizar o calculo\n");
            System.out.printf("ambos numeros devem possuír o mesmo sinal (positivo ou negativo)\n");
        }

    }
}
