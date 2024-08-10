/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projeto_8_daniel;
import java.util.Scanner;

/**
 *
 * @author d.rodrigues
 */
public class PROJETO_8_DANIEL {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float ouro, prata, bronze, performance;
        
                
        System.out.print("Digite quantas medalhas de ouro o pais ganhou: ");
        ouro = ler.nextFloat();    
        
        System.out.println();
        
        System.out.print("Agora digite quantas medelhas de prata o pais ganhou: ");
        prata = ler.nextFloat();
        
        System.out.println();
        
        System.out.print("Agora digite quantas medalhas de bronze o pais ganhou: ");
        bronze = ler.nextFloat();
        
        System.out.println();
        
        performance = ouro + prata + bronze;
        
        if (ouro > 10){
            System.out.print("O desempenho foi otimo");
                    
        }
        else if (ouro >=5 && performance >30){
            System.out.print("O desempenho foi extraordinario");
            
        }
        else if (ouro < 5 && performance > 20){
            System.out.print("Desempenho regular");
        }
        else if(ouro >= 5){
            System.out.print("Desempenho bom");
        }
        else{
            System.out.print("Desempenho fraco");
        }
        
        
    }
}
