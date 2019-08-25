/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class ListaSessao extends javax.swing.JFrame {

   private Cinema cinema;
   private boolean nav;
   
    public ListaSessao() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
        headerRenderer.setForeground(Color.WHITE);
        for (int i = 0; i < ListaSessaojTable.getModel().getColumnCount(); i++) {
            ListaSessaojTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
    }

    public ListaSessao(boolean nav) {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setBackground(Color.BLACK);
        headerRenderer.setForeground(Color.WHITE);
        for (int i = 0; i < ListaSessaojTable.getModel().getColumnCount(); i++) {
            ListaSessaojTable.getColumnModel().getColumn(i).setHeaderRenderer(headerRenderer);
        }
       this.nav = nav;
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListaSessaojTable = new javax.swing.JTable();
        EditarjButton = new javax.swing.JButton();
        RemoverjButton = new javax.swing.JButton();
        VoltarjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sessões cadastradas");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ListaSessaojTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                " Filme", "Sala", "Horário", "Data", "Dub/Leg", "3D", "Dia Semana", "Valor Ingresso", "Lotação"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ListaSessaojTable.setGridColor(new java.awt.Color(0, 0, 0));
        ListaSessaojTable.setSelectionBackground(new java.awt.Color(255, 51, 102));
        ListaSessaojTable.setSelectionForeground(new java.awt.Color(240, 240, 240));
        ListaSessaojTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(ListaSessaojTable);
        if (ListaSessaojTable.getColumnModel().getColumnCount() > 0) {
            ListaSessaojTable.getColumnModel().getColumn(0).setPreferredWidth(120);
            ListaSessaojTable.getColumnModel().getColumn(1).setPreferredWidth(55);
            ListaSessaojTable.getColumnModel().getColumn(2).setPreferredWidth(30);
            ListaSessaojTable.getColumnModel().getColumn(3).setPreferredWidth(65);
            ListaSessaojTable.getColumnModel().getColumn(4).setPreferredWidth(55);
            ListaSessaojTable.getColumnModel().getColumn(5).setPreferredWidth(10);
            ListaSessaojTable.getColumnModel().getColumn(6).setPreferredWidth(62);
            ListaSessaojTable.getColumnModel().getColumn(7).setPreferredWidth(63);
            ListaSessaojTable.getColumnModel().getColumn(8).setPreferredWidth(35);
        }

        EditarjButton.setBackground(new java.awt.Color(255, 255, 255));
        EditarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/edit_icon.png"))); // NOI18N
        EditarjButton.setText("Editar");
        EditarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarjButtonMouseClicked(evt);
            }
        });

        RemoverjButton.setBackground(new java.awt.Color(255, 255, 255));
        RemoverjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/remove_icon.png"))); // NOI18N
        RemoverjButton.setText("Remover");
        RemoverjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RemoverjButtonMouseClicked(evt);
            }
        });

        VoltarjButton.setBackground(new java.awt.Color(255, 255, 255));
        VoltarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/voltar-icon.png"))); // NOI18N
        VoltarjButton.setText("Voltar");
        VoltarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarjButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(EditarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(RemoverjButton)
                .addGap(42, 42, 42)
                .addComponent(VoltarjButton)
                .addContainerGap(212, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EditarjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoverjButton)
                    .addComponent(VoltarjButton))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        atualizaTabela();
    }//GEN-LAST:event_formWindowOpened

    private void EditarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarjButtonMouseClicked
        if(ListaSessaojTable.getSelectedRowCount() == 0){      
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma sessão para alterar."); 
        }
        else{
            int posicao = ListaSessaojTable.getSelectedRow();
            new EditSessao(posicao, nav).setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_EditarjButtonMouseClicked

    private void RemoverjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RemoverjButtonMouseClicked
       if(ListaSessaojTable.getSelectedRowCount() == 0){      
            JOptionPane.showMessageDialog(null, "Por favor, selecione uma sessão para remover."); 
        }
        else{
            int posicao = ListaSessaojTable.getSelectedRow();
            cinema.sessoes.remove(posicao);
        atualizaTabela();
        }
           
    }//GEN-LAST:event_RemoverjButtonMouseClicked

    private void VoltarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarjButtonMouseClicked
        if(nav == true){
            new FormSessao().setVisible(true);
            this.dispose();      
        }
        else{
           new ComprarIngresso().setVisible(true);
           this.dispose();  
        }
    }//GEN-LAST:event_VoltarjButtonMouseClicked
    
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
            java.util.logging.Logger.getLogger(ListaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListaSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListaSessao().setVisible(true);
            }
        });
    }
     public void atualizaTabela(){
       DecimalFormat df = new DecimalFormat("0.00");  
       DefaultTableModel modelo = (DefaultTableModel) ListaSessaojTable.getModel();
       modelo.setNumRows(0);
       
       for(int i=0; i<cinema.sessoes.size(); i++){
               String tresD;
               if(cinema.sessoes.get(i).getTresD() == true){
                   tresD = "Sim";
               } 
               else
                   tresD = "Não";
               
               modelo.addRow(new Object[]{
                            cinema.sessoes.get(i).getNomeFilme(),
                            cinema.sessoes.get(i).getNomeSala(),
                            cinema.sessoes.get(i).getHorario(),
                            cinema.sessoes.get(i).getData(),
                            cinema.sessoes.get(i).getDubladoLegendado(),
                            tresD,
                            cinema.sessoes.get(i).getDiaSemana(),
                            df.format(cinema.sessoes.get(i).getValorIngresso()),
                            cinema.sessoes.get(i).getLotaçao()
               });
     }
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EditarjButton;
    private javax.swing.JTable ListaSessaojTable;
    private javax.swing.JButton RemoverjButton;
    private javax.swing.JButton VoltarjButton;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
