package com.despesas;


import java.util.Scanner;

public class controldespesas {

   
    public static void main(String []args){


        controldespesas  controldespesas = new controldespesas();

        transacoes controle = new transacoes();
        
        Scanner scan = new Scanner(System.in);
        int opcao;

        do{
        System.out.println("\n=== Sistema de Controle de Despesas ===");
        System.out.println("1. Adcionar trnsação");
        System.out.println("2. visualizar transações");
        System.out.println("3. Remover transação");
        System.out.println("4. Sair ");
        System.out.println("Escolha uma opção");
        opcao = scan.nextInt(); 
        scan.nextLine();

        switch(opcao){

        case 1: 
        controle.adicionarTrasacao();

        break;


        case 2: 
        controle.visualizar();

        break;

        case 3: 

        controle.removerTransacao();

        break;

        case 4:
        
        System.out.println("Saindo do sistema");

        break;

        default: 
        System.out.println("Opcao inválida");
        }

        }while(opcao != 4);


        scan.close();

    }
    
}
