/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PedroH
 */
public class ListaFilme extends javax.swing.JFrame {
    
    Cinema cinema;
    private boolean nav;
     
    public ListaFilme() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
        headerRenderer.setForeground(Color.WHITE);
        for (int i = 0; i < ListaFilmesjTable.getModel().getColumnCount(); i++) {
            ListaFilmesjTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        
    }
    
    public ListaFilme(boolean nav) {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
        headerRenderer.setForeground(Color.WHITE);
        for (int i = 0; i < ListaFilmesjTable.getModel().getColumnCount(); i++) {
            ListaFilmesjTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
        this.nav = nav;
    }

          
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaFilmesjTable = new javax.swing.JTable();
        editarjButton = new javax.swing.JButton();
        removerjButton = new javax.swing.JButton();
        voltarjButton = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filmes cadastrados");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ListaFilmesjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Título", "Gênero", "Duração", "Class. Indicativa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaFilmesjTable.setGridColor(new java.awt.Color(0, 0, 0));
        ListaFilmesjTable.setSelectionBackground(new java.awt.Color(255, 51, 102));
        ListaFilmesjTable.setSelectionForeground(new java.awt.Color(240, 240, 240));
        ListaFilmesjTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaFilmesjTable);

        editarjButton.setBackground(new java.awt.Color(255, 255, 255));
        editarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/edit_icon.png"))); // NOI18N
        editarjButton.setText("Editar");
        editarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editarjButtonMouseClicked(evt);
            }
        });

        removerjButton.setBackground(new java.awt.Color(255, 255, 255));
        removerjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/remove_icon.png"))); // NOI18N
        removerjButton.setText("Remover");
        removerjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerjButtonMouseClicked(evt);
            }
        });

        voltarjButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/voltar-icon.png"))); // NOI18N
        voltarjButton.setText("Voltar");
        voltarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarjButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(editarjButton)
                .addGap(41, 41, 41)
                .addComponent(removerjButton)
                .addGap(40, 40, 40)
                .addComponent(voltarjButton)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(removerjButton)
                    .addComponent(editarjButton)
                    .addComponent(voltarjButton))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       atualizaTabela();
    }//GEN-LAST:event_formWindowOpened

    private void removerjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerjButtonMouseClicked
        if(ListaFilmesjTable.getSelectedRowCount() == 0){      
            JOptionPane.showMessageDialog(null, "Por favor, selecione um filme para remover."); 
        }
        else{
            int posicao = ListaFilmesjTable.getSelectedRow();

            for(int i=0; i<cinema.sessoes.size(); i++){
                if((cinema.filmes.get(posicao).getTitulo()) == (cinema.sessoes.get(i).getNomeFilme()))
                    cinema.sessoes.remove(i);
            } 
            cinema.filmes.remove(posicao);
            atualizaTabela();
        }
        
    }//GEN-LAST:event_removerjButtonMouseClicked

    private void editarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editarjButtonMouseClicked
        if(ListaFilmesjTable.getSelectedRowCount() == 0){      
            JOptionPane.showMessageDialog(null, "Por favor, selecione um filme para alterar."); 
        }
        else{
            int posicao = ListaFilmesjTable.getSelectedRow();
            new EditFilme(posicao, nav).setVisible(true);
            this.dispose();
        }
      
    }//GEN-LAST:event_editarjButtonMouseClicked

    private void voltarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarjButtonMouseClicked
        if(nav == true){   
            new FormFilme().setVisible(true);
            this.dispose();
        }
        else{
            new ComprarIngresso().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_voltarjButtonMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaFilme().setVisible(true);
            }
        });
    }
       
    
    public void atualizaTabela(){
       DefaultTableModel modelo = (DefaultTableModel) ListaFilmesjTable.getModel();
       modelo.setNumRows(0);
       for(int i=0; i<cinema.filmes.size(); i++){
               modelo.addRow(new Object[]{
               cinema.filmes.get(i).getTitulo(),
               cinema.filmes.get(i).getGenero(),
               cinema.filmes.get(i).getDuraçao(),
               cinema.filmes.get(i).getClassIndicativa()               
           });
       }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListaFilmesjTable;
    private javax.swing.JButton editarjButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removerjButton;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables

    
}
