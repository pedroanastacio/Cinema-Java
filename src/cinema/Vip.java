
package cinema;


public class Vip extends Sala implements TaxaExtra{
    private static int assentosEspeciais;
    private static float taxaOculos;    
    private float taxaExtra;
        
    public Vip(){
        assentosEspeciais = 30;
        taxaOculos = (float) 3.00;
    }
   
    public float getTaxaOculos() {
        return taxaOculos;
    }

    public void setTaxaOculos(float taxaOculos) {
        this.taxaOculos = taxaOculos;
    }
        
    @Override
    public float calcTaxaExtra(){
        taxaExtra = TAXATELA + TAXAASSENTO;
        
        return taxaExtra;
    } 
   
    @Override
    public int calcCapacidade(){
       capacidade = assentosEspeciais;
       
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
