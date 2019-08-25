
package cinema;


public class Comum extends Sala{
     private static float taxaOculos = (float) 3.00;
     private static int assentosNormais;

    public Comum(){
        assentosNormais = 60;
        taxaOculos = (float) 3.00;
    }
    
    public float getTaxaOculos() {
        return taxaOculos;
    }

    public void setTaxaOculos(float taxaOculos) {
        this.taxaOculos = taxaOculos;
    }

    public int getAssentosNormais() {
        return assentosNormais;
    }

    public void setAssentosNormais(int assentosNormais) {
        this.assentosNormais = assentosNormais;
    }
        
     @Override
    public int calcCapacidade(){
       capacidade = assentosNormais; 
       
       return capacidade;
    }
    
   @Override
    public int calcLotaçao(int lotaçao, boolean operaçao){
       if(operaçao == true)
           capacidade = lotaçao - 1;
       else
           capacidade = lotaçao + 1;

       return capacidade;
    }
    
    
     
     

}
