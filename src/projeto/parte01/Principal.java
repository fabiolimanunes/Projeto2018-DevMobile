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
        while(op < 7) {
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
            System.out.print("Digite o primeiro número: ");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = input.nextInt();
            result = n1+n2;
            System.out.println("O Resultado de: " +n1+" + " +n2+ " = " +result+"\n");
            
        }
            // Fazendo a subtração apresentando os resultados
            else if (op == 2){ 
            System.out.print("Digite o primeiro número: ");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = input.nextInt();
            result = n1-n2;
           System.out.println("O Resultado de: " +n1+" - " +n2+ " = " +result+"\n");
            
            }
            // Fazendo a divisão apresentando os resultados
            else if (op == 3){ 
            System.out.print("Digite o primeiro número: ");
            n1 = input.nextInt();
            System.out.print("Digite o segundo número: ");
            n2 = input.nextInt();
            result = n1/n2;
           System.out.println("O Resultado de: " +n1+" / " +n2+ " = " +result+"\n");
        
            }
            //Faixa etária = A pessoa entra com uma quantidade de pessoas. 
            //Depois peça para cada pessoas a idade e sexo. 
            //Mostre a média da idade das pessoas e a média das idades de cada sexo
            else if(op == 4){
                   int qtd;
                
            Scanner sc = new Scanner(System.in);
            System.out.println("Com quantas pessoas deseja fazer a média: ");
            qtd = sc.nextInt();  
            //criando vetores para armazenar o sexo e a idade na posição
            char sexo[] = new char[qtd];
            int idade[] = new int[qtd];
            int somam = 0, somaf = 0, mediam, mediaf, media, soma = 0, qtdm = 0, qtdf = 0;

            //condição para digitação dos dados da quantidade de pessoas
            for(int i = 1; i <= qtd;i++){
                System.out.println("Digite a idade da pessoa " + i + ":");
                idade[i -1] = sc.nextInt();
                System.out.println("Digite o sexo da pessoa " + i + ":");
                sexo[i -1] = sc.next().charAt(0);
                if(sexo[i -1] == 'm'){
                    somam += idade[i-1];
                    qtdm++;
                }else{
                    somaf += idade[i-1];
                    qtdf++;
                }
        }

          //calculando a média geral  
            for(int a = 0; a < qtd; a++){
                soma = soma + idade[a];
            }
            //calculando todas as médias
            media = soma/qtd;
            mediam = somam/qtdm;
            mediaf = somaf/qtdf;
            System.out.println("A média geral de idade entre as pessoas é: "+media);
            System.out.println("A media de idade das pessoas do sexo masculino é: " + mediam);
            System.out.println("A media de idade das pessoas do sexo feminino é: " + mediaf +  "\n");
            
            //media por gênero
                
            }
            
             //Tratando opção maior que 7
            else if (op > 7) {
                System.out.println("Opção inválida!");      
       
    }
       
       
        
}
         //Condição para sair do sistema
        if (op == 7){
                System.out.println("Até logo!");
            }
        
    }
  
    
}
