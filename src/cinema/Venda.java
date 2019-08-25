/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author PedroH
 */
public class Venda {
    
    private float precoTotal;
    private String formaPagamento;
    private Ingresso ingresso;
    
    
    public Venda(){
        ingresso = new Ingresso();
        precoTotal = 0;
    }
    
    public void setPrecoTotal(float precoTotal){
        this.precoTotal = precoTotal;
    }
    public float getPrecoTotal(){
        return precoTotal;
    }
    
    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
     
    public void calcPrecoTotal(float precoIngresso){
        precoTotal += precoIngresso;
    }
    
   
    
}
