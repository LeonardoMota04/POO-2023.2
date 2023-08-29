package atividade3;

public class ItemEstoque {
    String nome;
    int quantidade;

    ItemEstoque(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    String imprimir(){
        String ret = "";
        ret = this.nome + " - Quantidade: " + this.quantidade;
        return ret;
    }
}