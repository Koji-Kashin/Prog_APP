/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_7_daniel;
import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class PROJETO_7_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float peso, altura, imc;
        
        System.out.print("Calculo de IMC, primeiro digite a sua altura: ");
        altura = ler.nextFloat();
        
        System.out.println();
        
        System.out.print("Agora digite o seu peso: ");
        peso = ler.nextFloat ();
        
        imc = peso /(altura * altura);
        
        
        if (imc < 18.5){
            System.out.print("Voce esta abaixo do peso normal");
        }
        else if (imc < 25){
            System.out.print("Voce esta no peso normal");
        }
        else if (imc < 30){
            System.out.print("Voce esta acima do peso");
        }
        else if (imc < 35){
        System.out.print("Voce esta com obesidade de grau I");
        }
        else if (imc < 40){
        System.out.print("Voce esta com obesidade grau II");
        }
        else {
            System.out.print("Voce esta com Obesidade grau II");
        }   
                
    }
}
