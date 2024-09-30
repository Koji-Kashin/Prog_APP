/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.revisao_exc01_daniel;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author DFR
 */
public class Revisao_Exc01_Daniel {

    public static void main(String[] args) throws IOException {
        int num1, num2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite apenas números inteiros e vamos soma-los");
        
        System.out.print("Insira o primeiro numero inteiro: ");
        num1 = sc.nextInt();

        System.out.print("Insira o segundo numero inteiro : ");
        num2 = sc.nextInt();

        System.out.print("Soma de " + num1 + " + " + num2 + " eh = " + (num1 + num2));

    }
}
