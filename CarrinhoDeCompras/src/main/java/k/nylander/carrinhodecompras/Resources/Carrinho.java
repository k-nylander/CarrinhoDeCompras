package k.nylander.carrinhodecompras.Resources;



import java.util.*;
import javax.swing.JOptionPane;

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
    public void remove(Item... itens){
    }
    
    private double calculaTotal(){
        double subtotal = 0;
        for(Item item : this.Cesta){
            subtotal += item.getTotal();
        }
        return (double) (Math.round(subtotal*100.0)/100.0);
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
        System.out.println("+--------------+\n\n");
        
        JOptionPane.showMessageDialog(null, "Total: "+ this.total +"R$","--- TOTAL ---",JOptionPane.INFORMATION_MESSAGE);
    }
}
