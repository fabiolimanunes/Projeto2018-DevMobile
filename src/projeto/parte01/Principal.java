/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.parte01;

import java.util.Scanner;

/**
 *
 * @author fabio.nunes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Menu interativo
       
        
        //Declarando as variáveis
        int op =0;
        int n1;
        int n2;
        float result;
        // Coletando dados do teclado
        Scanner input = new Scanner(System.in);
        //Condição do menu de operações
        while(op <= 7) {
            System.out.println("==== BEM VINDO AO NOSSO MENU INTERATIVO ====");
            System.out.println("Escolha um número de 1 a 6 para entrar na opção desejada, e 7 para sair do programa.");
            System.out.println("1. SOMA \n"
                             + "2. SUBTRAÇÃO \n"
                             + "3. DIVISÃO \n"
                             + "4. FAIXA ETÁRIA \n"
                             + "5. NÚMEROS PRIMOS \n"
                             + "6. MUDANÇA DE BASE \n"
                             + "7. SAIR");
            
            System.out.println("Digite a opção desejada: ");
            op = input.nextInt();
            
            // Fazendo a soma e apresentando os resultados
            if (op == 1){
            System.out.print("Digite o primeiro número:");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número:");
            n2 = input.nextInt();
            result = n1+n2;
            System.out.println("O Resultado de: " +n1+" + " +n2+ " = " +result);
            
        }
            // Fazendo a subtração apresentando os resultados
            else if (op == 2){ 
            System.out.print("Digite o primeiro número:");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = input.nextInt();
            result = n1-n2;
            System.out.println("O Resultado de: " +n1+" - " +n2+ " = " +result);
            
            }
            // Fazendo a divisão apresentando os resultados
            else if (op == 3){ 
            System.out.print("Digite o primeiro número");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número");
            n2 = input.nextInt();
            result = n1/n2;
            System.out.println("O resultado de: " +n1+" / " +n2+ " = " +result);
        
            }
            //Faixa etária = A pessoa entra com uma quantidade de pessoas. 
            //Depois peça para cada pessoas a idade e sexo. 
            //Mostre a média da idade das pessoas e a média das idades de cada sexo
            else if(op == 4){
                System.out.println("Com quantas pessoas deseja fazer a média de idade?");
                
            }
    
    
    }
        
}
    
}
