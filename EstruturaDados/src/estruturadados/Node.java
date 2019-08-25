/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadados;

/**
 *
 * @author PedroH
 */
public class Node {
   int info;
   Node proximo;

   Node(int dado){
     this.info = dado;
     this.proximo = null;
   }
   Node(int dado, Node next){
     this.info = dado;
     this.proximo = next;
   }

   public int getDado(){
     return info;
   }
   public void setDado(int dado){
     info = dado;
   }
   public Node getProximo(){
     return proximo;
   }
   public void setProximo(Node prox){
     proximo = prox;
   }
 
}
