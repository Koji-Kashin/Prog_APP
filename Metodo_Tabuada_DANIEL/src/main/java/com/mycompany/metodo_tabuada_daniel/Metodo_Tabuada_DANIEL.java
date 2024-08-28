/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.metodo_tabuada_daniel;

import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Metodo_Tabuada_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero para exibir a sua tabuada: ");
        int num = ler.nextInt();
        tabuada(num);

    }
    
    public static void tabuada (int num){
       int calc[] = new int[10];
       
        for (int i = 0; i <10; i++) {
            calc[i] = num*(i+1);
            System.out.println(calc[i]);
            
        }
       
    }
}
    