/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.projeto_15_daniel;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class Projeto_15_Daniel {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        Date tempo = new Date();
        FileWriter arquivo[] = new FileWriter [5];
        String valor = "";
        Double numero[] = new Double [5];
        for(int i = 0; i < 5; i++){
            System.out.println("--------------------------------------------");
            System.out.println("Digite um numero para taboada:");
            valor = sc.next();
            try{
                numero[i] = Double.parseDouble(correcao(valor));
            }
            catch(NumberFormatException e){
                System.out.println("Erro: valor invalida!");
                i--;
            }
        }
        for(int i = 0; i < 5; i++){
            arquivo[i] = new FileWriter ("C:\\Users\\d.rodrigues\\Desktop\\Teste"+(numero[i]+" - "+(i+1))+".txt");
            PrintWriter gravar = new PrintWriter(arquivo[i]);
            gravar.printf("--------------------------------------------\n");
            gravar.printf("Tabuada do "+numero[i]+" | "+tempo+"\n");
            gravar.printf("--------------------------------------------\n");
            System.out.println(numero[i]);
                for(int j = 0; j <= 10; j++){
                    gravar.printf(j+" * "+numero[i]+" = "+(j*numero[i])+"\n");
                }
            gravar.printf("--------------------------------------------\n");
            arquivo[i].close();
        }
    }
    public static String correcao(String dado){
        return dado.replaceAll(",", ".");
    }
}