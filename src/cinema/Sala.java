
package cinema;


public abstract class Sala {
    protected int capacidade;
    private String nomeSala;
    

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }
    
    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    public abstract int calcCapacidade();
    public abstract int calcLotaçao(int lotaçao, boolean operaçao);
    
}          
    

