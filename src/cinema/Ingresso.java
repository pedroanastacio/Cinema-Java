
package cinema;

import java.awt.Color;
import java.text.DecimalFormat;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.UIManager;


public class Ingresso {
    private String tipoIngresso;
    private float precoIngresso;
    private int posSessaoArray;
    private Sessão sessao;
      
    public Ingresso(){
        sessao = new Sessão();
    }
   
    public void setTipo(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }
    public String getTipo() {
        return tipoIngresso;
    }
    
    public float getPrecoIngresso(){
        return precoIngresso;
    }
    
    public int getPosicao(){
        return posSessaoArray;
    }
    
    public void setDadosSessao(String nomeFilme, String nomeSala, String data, String horario, boolean tresD, int posicao){
        sessao.setNomeFilme(nomeFilme);
        sessao.setNomeSala(nomeSala);
        sessao.setData(data);
        sessao.setHorario(horario);
        sessao.setTresD(tresD);
        posSessaoArray = posicao;
    }
    
    public String getDados(){
        DecimalFormat df = new DecimalFormat("0.00"); 
        if(sessao.getTresD() == true){
            return sessao.getNomeFilme() + "    " + sessao.getNomeSala() + "    " + sessao.getData() + "    " +
                sessao.getHorario() + "    " + getTipo() + "    " + df.format(getPrecoIngresso()) + "    " + "3D";  
        }
        else{
            return sessao.getNomeFilme() + "    " + sessao.getNomeSala() + "    " + sessao.getData() + "    " +
               sessao.getHorario() + "    " + getTipo() + "    " + df.format(getPrecoIngresso());
        }
    }
    
    public void calcPrecoIngresso(float valorIngresso){
        if(tipoIngresso == "Meia")
            precoIngresso = valorIngresso/2;
        else
            precoIngresso = valorIngresso;
    }
    
    public void imprimirIngresso(){
        DecimalFormat df = new DecimalFormat("0.00"); 
        ImageIcon imagem = new ImageIcon(Ingresso.class.getResource("iconCinema.png"));
        if(sessao.getTresD() == true){
            JOptionPane.showMessageDialog(null, sessao.getNomeFilme() + "    "+ "3D" + "\n" + sessao.getNomeSala() +
                "    " + sessao.getData() + "    " + sessao.getHorario() + "\n" + getTipo() + "    " +
                df.format(getPrecoIngresso()) + "\n\n" + "Devolução do óculos 3D é obrigatória.", "Ingresso",
                JOptionPane.PLAIN_MESSAGE, imagem);
        }
        else{
            JOptionPane.showMessageDialog(null, sessao.getNomeFilme() + "\n" + sessao.getNomeSala() +
                "    " + sessao.getData() + "    " + sessao.getHorario() + "\n" + getTipo() + "    " +
                df.format(getPrecoIngresso()) + "\n\n", "Ingresso",JOptionPane.PLAIN_MESSAGE, imagem);
        }
    }

}

