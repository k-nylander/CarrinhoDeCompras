package k.nylander.carrinhodecompras;

import java.math.MathContext;

public class Produto {
    private int ID;
    private String nome;
    private double valor;
    private double desconto = 0;
    
    public Produto(int ID, String nome, double valor) {
        this.setID(ID);
        this.setNome(nome);
        this.setValor(valor);
    }
    
    public Produto(int ID, String nome, double valor, double desconto) {
        this.setID(ID);
        this.setNome(nome);
        this.setValor(valor);
        this.setDesconto(desconto);
    }
        
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if(valor > 0)
           this.valor = valor;
    }
    
    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto > 0 && desconto < 1){
            this.valor *= desconto;
        }else{
            this.valor -= Math.abs(desconto);
        }
        this.desconto = desconto;
    }
}
