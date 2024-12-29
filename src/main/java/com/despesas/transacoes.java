package com.despesas;

import java.util.ArrayList;
import java.util.Scanner;

public class transacoes {


   

    public static Scanner scan = new Scanner(System.in);

    public static ArrayList<trasacao> transacoes = new ArrayList<>();


    public static void adicionarTrasacao(){
    System.out.println("Digite a descrição de transação");

    String descricao = scan.nextLine();

    System.out.println("Digite o valor para da trasacao");
    double valor = scan.nextDouble();
    
    transacoes.add(new trasacao(descricao, valor));
    }

    public static void visualizar(){

        if (transacoes.isEmpty()){

        System.out.println("Não existe esse nunhuma transação ");
        
        }else {
            for (trasacao t : transacoes){

                System.out.println(t);
            }
        }

    }

    public static void removerTransacao(){

        System.out.println("Digite a transacao que deseja retirar");
        int indice = scan.nextInt();
        scan.nextLine();

        if (indice >= 0 && indice < transacoes.size()){
            trasacao removida = transacoes.remove(indice);
            System.out.println("Transação removida: "+ removida);
        }else{
            System.out.println("Indice inválido");
        }

      
    }
    
    
}
