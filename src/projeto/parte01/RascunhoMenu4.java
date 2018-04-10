/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto.parte01;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class RascunhoMenu4 {
    public static void main(String[] args) {
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
        System.out.println("A media de idade das pessoas do sexo feminino é: " + mediaf);
        //media por gênero
}
}
//Faixa etária
//◦ A pessoa entra com uma quantidade de pessoas. Depois peça para cada
//pessoas a idade e sexo. Mostre a média da idade das pessoas e a média das
//idades de cada sexo.