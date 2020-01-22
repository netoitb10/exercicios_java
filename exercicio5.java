/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estrutura04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author manoel
 */
public class exercicio5 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Este é um programa para cálculo de venda duas peças.");
        
        System.out.println("Digite o código da peça 1:");
        String codigo_1 = sc.nextLine();
        
        System.out.println("Digite a quantidade da peça 1:");
        int quant_1 = sc.nextInt();
        
        System.out.println("Digite o valor unitário da peça 1:");
        double valor_peca_1 = sc.nextDouble();
        
        sc.nextLine();
        
        System.out.println("Digite o código da peça 2:");
        String codigo_2 = sc.nextLine();
        
        System.out.println("Digite a quantidade da peça 2:");
        int quant_2 = sc.nextInt();
        
        System.out.println("Digite o valor unitário da peça 2:");
        double valor_peca_2 = sc.nextDouble();
        
        System.out.printf("O valor total a pagar das peças %s e %s é de: R$ %.2f %n", codigo_1, codigo_2, 
                ((quant_1*valor_peca_1)+(quant_2*valor_peca_2)));
        
        sc.close();
        
        
    }
    
}
