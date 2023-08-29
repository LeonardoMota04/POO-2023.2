package atividade3;

import java.util.ArrayList;

public class Estoque {
    
    ArrayList<ItemEstoque> itens;

    Estoque(){
        this.itens = new ArrayList<ItemEstoque>();
    }

    public void adicionarItem(ItemEstoque item){
        this.itens.add(item);
    }

    public String listarItens(){
        String listaItens = "";

        for (ItemEstoque item : this.itens) {
            listaItens += item.imprimir() + "\n";
        }

        return listaItens;
    }

    public String buscarItemPorNome(String nome){
        String ret = "Item nao encontrado.";
        
        for (ItemEstoque item : this.itens){
            if (item.nome.equals(nome)) {
                ret = item.imprimir();
            }
        }

        return ret;
    }

}