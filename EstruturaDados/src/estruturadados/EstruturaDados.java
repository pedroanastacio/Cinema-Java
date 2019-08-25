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
public class EstruturaDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista a = new Lista();
        a.insereInicio(1);
        a.insereInicio(2);
        a.insereInicio(4);
        a.insereInicio(5);
        a.insereInicio(6);
        a.insereInicio(7);
        a.insereAntes(10, 1);
        System.out.println(a.removeAntes(1));
        a.imprime();
    }
    
}
