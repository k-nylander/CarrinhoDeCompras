package k.nylander.carrinhodecompras;

import java.util.*;

public class Carrinho {
    private List<Item> Cesta = new ArrayList<Item>();
    private double total;

    public Carrinho(Produto... x){
        this.adiciona(x);
    }
    public Carrinho(){
    //Apenas a criação do carrinho, sem nenhum item.
    }
    
    public void adiciona(Produto... x){
        int localI = 0;
        for(Produto prod : x){
            if((localI = existe(prod)) != -1){
                this.Cesta.get(localI).adiciona(1);
            }else{
                Item item = new Item(prod, 1);
                this.Cesta.add(item);
            }
        }
        this.total = calculaTotal();
    }
    public void remove(Item... x){
        
    }
    
    private double calculaTotal(){
        double subtotal = 0;
        for(Item item : this.Cesta){
            subtotal += item.getTotal();
        }
        return subtotal;
    }
    private int existe(Produto p){
        for(Item item : this.Cesta){
            if(item.getProd() == p){
                return this.Cesta.indexOf(item);
            }
        }
        return -1;
    }
    public void finalizar(){
        System.out.println("+--------------+");
        for(Item x : this.Cesta){
            System.out.println(x.getQtd() + "x " + x.getProd().getNome() + " : " + x.getTotal());
        }
        System.out.println("+--------------+");
        System.out.println("Total: "+ this.total +"R$");
    }
}
