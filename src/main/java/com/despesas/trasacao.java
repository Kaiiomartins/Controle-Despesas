package com.despesas;
import java.util.Objects;

public class trasacao {


    private String descricao;
    private double valor ;



    public trasacao() {
    }

    public trasacao(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

   

    public double getValor() {
        return this.valor;
    }

   
    @Override
    public String toString() {
        return "{" +
            " descricao='" + getDescricao() + "'" +
            ", valor='" + getValor() + "'" +
            "}";
    }
    


}  

    


