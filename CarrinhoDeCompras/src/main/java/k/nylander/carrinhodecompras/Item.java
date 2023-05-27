package k.nylander.carrinhodecompras;

public class Item {
    private Produto prod;
    private Integer qtd = 0;
    //Construtor
    public Item(Produto p,int qtd){
        this.prod = p;
        this.setQtd(qtd);
    }
    // --- Quantidade ---
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        if(!pos(qtd))
            return;
        this.qtd = qtd;
    }
    
    public Produto getProd() {
        return prod;
    }

    public double getTotal(){
        return this.prod.getValor() * this.qtd;
    }
    
    public int adiciona(int qtdAdd){
        if(pos(qtdAdd))
            this.qtd += qtdAdd;
        return this.qtd;
    }

    public int remove(int qtdRmv){
        if(pos(qtdRmv))
            this.qtd -= qtdRmv;
        return this.qtd;
    }
    
    // Geral
    private boolean pos(int x){
        if(x > 0)
            return true;
        return false;
    }
}
