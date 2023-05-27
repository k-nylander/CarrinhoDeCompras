/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package k.nylander.carrinhodecompras;

/**
 *
 * @author kauan
 */
public class CarrinhoDeCompras {
    public static void main(String[] args) {
        Produto p1 = new Produto(123,"Nescau",10.49,0.5);
        Produto p2 = new Produto(321,"Toddy",12.99,-10);
        Produto p3 = new Produto(111,"Sal",5.50);
        Produto p4 = new Produto(222,"Farinha",6.99);
        Produto p5 = new Produto(333,"Água",2.50);
        
        Carrinho c1 = new Carrinho(p1,p1,p2,p3,p4,p5,p5);
        c1.finalizar();
        
        Carrinho c2 = new Carrinho(p2,p2,p5,p4,p1);
        c2.finalizar();
    }
}
