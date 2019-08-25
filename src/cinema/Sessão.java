
package cinema;


public class Sessão {
    private String data;
    private String diaSemana;
    private String horario;
    private float valorIngresso;
    private float taxaBase;
    private int lotaçao;
    private String dubladoLegendado;
    private boolean tresD;
    private Filme filme;
    private Vip salaVip;
    private Comum salaComum;
    
        public Sessão(){
            filme = new Filme();
            salaVip = new Vip();
            salaComum = new Comum();
        }
                       
        public void setData(String data){
            this.data = data;    
        }
        public String getData(){
            return data;
        } 
        
        public void setDiaSemana(String diaSemana){
            this.diaSemana = diaSemana;
        }
        public String getDiaSemana(){
            return diaSemana;
        }
        
        public void setHorario(String horario){
           this.horario = horario;
        }
        public String getHorario(){
            return horario;
        }
        
        public void setDubladoLegendado(String dubladoLegendado){
            this.dubladoLegendado = dubladoLegendado;
        }
        public String getDubladoLegendado(){
            return dubladoLegendado;
        }
        public void setTaxaBase(float taxaBase){
            this.taxaBase = taxaBase;
        }
        public float getTaxaBase(){
            return taxaBase;
        }
        
        public void setNomeSala(String nomeSala){
            if((nomeSala == "Sala 01") || (nomeSala == "Sala 02") || (nomeSala == "Sala 03")){
                salaComum.setNomeSala(nomeSala);
            }    
            else{
                salaVip.setNomeSala(nomeSala);
            }    
        }
        public String getNomeSala(){
            if(salaComum.getNomeSala() == null)
                return salaVip.getNomeSala();
            else
                return salaComum.getNomeSala();
            
        }
        
        public void setTresD(boolean tresD){
            this.tresD = tresD;
        }
        public boolean getTresD(){
            return tresD;
        }
        
        public void setNomeFilme(String nomeFilme){
            filme.setTitulo(nomeFilme);
        }
        public String getNomeFilme(){
            return filme.getTitulo();
        }
        
        public void setValorIngresso(float valorIngresso){
            this.valorIngresso = valorIngresso;
        }
        public float getValorIngresso(){
            return valorIngresso;
        }
        
        public void calcLotaçao(String nomeSala){
            if((nomeSala == "Sala 01") || (nomeSala == "Sala 02") || (nomeSala == "Sala 03"))
                lotaçao = salaComum.calcCapacidade();
            else
                lotaçao = salaVip.calcCapacidade();
        }
        
        public void calcLotaçao(String nomeSala, int lotaçao, boolean operaçao){
            if((nomeSala == "Sala 01")||(nomeSala == "Sala 02")||(nomeSala == "Sala 03"))
                this.lotaçao = salaComum.calcLotaçao(lotaçao, operaçao);
            else
                this.lotaçao = salaVip.calcLotaçao(lotaçao, operaçao);
        }
        
        public int getLotaçao(){
            return lotaçao;
        }

        
        public void calcValorIngresso(boolean tresD, String tipoSala, String diaSemana){
                if ((diaSemana == "Sexta-feira") || (diaSemana == "Sábado") || (diaSemana == "Domingo")){
                    taxaBase = (float) 18.00;
                }
                else {
                    taxaBase = (float) 12.00;  
                }

                if(tipoSala == "Vip"){
                   if(tresD == true){
                       salaVip.calcTaxaExtra();
                       valorIngresso = taxaBase + salaVip.calcTaxaExtra() + salaVip.getTaxaOculos();
                    }
                   else{
                      salaVip.calcTaxaExtra();
                      valorIngresso = taxaBase + salaVip.calcTaxaExtra();
                   }
                }
                else if(tipoSala == "Comum"){
                   if(tresD == true){
                       valorIngresso = taxaBase + salaComum.getTaxaOculos();
                   }
                   else{
                       valorIngresso = taxaBase;
                   }
                }
            }

        
  
        
}
    

