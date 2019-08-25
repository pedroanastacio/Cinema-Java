package cinema;

import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class Cinema {
    public static ArrayList<Filme> filmes = new ArrayList<Filme>();
    public static ArrayList<Sessão> sessoes = new ArrayList<Sessão>();
    public static ArrayList<Ingresso> ingressos = new ArrayList<Ingresso>();
      
    public static void main(String[] args) {
        new TelaInicial().setVisible(true);
         
    }
    
    
    
}
