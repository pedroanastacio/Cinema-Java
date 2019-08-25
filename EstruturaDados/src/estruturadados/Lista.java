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
public class Lista {
    private static Node cabeca;
    private static Node cauda;

    public Lista(){
      cabeca = cauda = null;
    }

    public static void insereInicio(int Item){
      if (cabeca== null)
        cabeca = cauda = new Node(Item);
      else
        cabeca = new Node(Item,cabeca);
    }

    public static void insereFim(int Item){
      if (cabeca==null)
        cabeca = cauda = new Node(Item);
      else
        cauda=cauda.proximo= new Node(Item);
    }
    
    public static int removeInicio(){
        int removeItem = 0;
        if (cabeca == null){
          System.out.println("Lista Vazia");
          System.exit(0);
        }

        removeItem = cabeca.info;

        if (cabeca == cauda)
          cabeca = cauda = null;
        else
          cabeca = cabeca.proximo;

        return removeItem;
    }


    public static int removeFim(){
    int removeItem = 0;
    if (cabeca == null){
      System.out.println("Lista Vazia");   
      System.exit(0);    }

    removeItem = cauda.info;

    if (cabeca == cauda)
      cabeca = cauda = null;
    else{
      Node corrente = cabeca;
      while (corrente.proximo != cauda)
	corrente = corrente.proximo;
      cauda = corrente;
      corrente.proximo = null;
    }
    return removeItem;
  }

   public static void imprime(){
    if (cabeca == null){
	System.out.println("Lista Vazia");
	System.exit(0);
    }

    Node corrente = cabeca;

    while (corrente != null){
      System.out.print(corrente.info + " , ");
      corrente = corrente.proximo;
    }
  }
   
    //APS
  
    public static void insereDepois(int procurado, int item){
        if(cabeca == null){
          System.out.println("Lista Vazia");
          System.exit(0);
        }
        else if(cauda.info == procurado){
            insereFim(item);
        }
            else{
                Node corrente = cabeca;
                while(corrente != null){
                    if(corrente.info == procurado){
                       Node a = new Node(item, corrente.proximo); 
                       corrente.proximo = a;
                       break;
                    }
                    corrente = corrente.proximo;
                }
            }
    }
    
    public static int removeDepois(int procurado){
        if(cabeca == null){
            return -1;
        }
        else if(cauda.info == procurado){
            return -1;
        }
        else{
            Node corrente = cabeca;
            while(corrente != cauda){
                if(corrente.info == procurado){
                    if(corrente.proximo == cauda){
                        int removido = cauda.info;
                        cauda = corrente;
                        corrente.proximo = null;
                        return removido;
                    }
                    else{
                        int removido = (corrente.proximo).info;
                        corrente.proximo = (corrente.proximo).proximo;
                        return removido;
                    }
                }
                corrente = corrente.proximo;
            }
            return -1;
        }
        
    }
    
    public static void insereAntes(int procurado, int item){
        if(cabeca == null){
            System.out.println("Lista Vazia");   
            System.exit(0); 
        }
        else if(cabeca.info == procurado){
            insereInicio(item);
        }
            else{
                Node corrente = cabeca;
                while(corrente.proximo != null){
                    if(corrente.proximo.info == procurado){
                        Node a = new Node(item, corrente.proximo);
                        corrente.proximo = a;
                        break;
                    }
                    corrente = corrente.proximo;
                }
                
            }
    }
    
    public static int removeAntes(int procurado){
        if(cabeca == null){
            return -1;
        }
        else if(cabeca.info == procurado){
            return -1;
        }
            else if(cabeca.proximo.info == procurado){
                return removeInicio();
            }
                else{
                    Node corrente = cabeca;
                    while(corrente.proximo.proximo != null){
                        if((corrente.proximo.proximo).info == procurado){
                            int removido = corrente.proximo.info;
                            corrente.proximo = corrente.proximo.proximo;
                            return removido;
                        }
                        corrente = corrente.proximo;
                        
                    }
                    return -1;
                }
    }
    
    
    
   


}
