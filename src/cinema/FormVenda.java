/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.ListSelectionModel;

/**
 *
 * @author PedroH
 */
public class FormVenda extends javax.swing.JFrame {
    
    Cinema cinema;
    private Venda venda;
    
    public FormVenda() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        atualizaCampos();
    }

    public FormVenda(Venda venda) {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        this.venda = venda;
        atualizaCampos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        vendajList = new javax.swing.JList<>();
        fecharVendajButton = new javax.swing.JButton();
        formaPagjLabel = new javax.swing.JLabel();
        formaPagjComboBox = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        voltarjButton = new javax.swing.JButton();
        cancelVendajButton = new javax.swing.JButton();
        numIngjLabel = new javax.swing.JLabel();
        numIngressosjLabel = new javax.swing.JLabel();
        valorTotaljLabel = new javax.swing.JLabel();
        reaisjLabel = new javax.swing.JLabel();
        totalReaisjLabel = new javax.swing.JLabel();
        removerjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Venda");
        setMinimumSize(new java.awt.Dimension(0, 34));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        vendajList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        vendajList.setMaximumSize(new java.awt.Dimension(200, 70));
        vendajList.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(vendajList);

        fecharVendajButton.setBackground(new java.awt.Color(255, 255, 255));
        fecharVendajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/imprimeIng-icon.jpg"))); // NOI18N
        fecharVendajButton.setText("Concluir venda");
        fecharVendajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fecharVendajButtonMouseClicked(evt);
            }
        });
        fecharVendajButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharVendajButtonActionPerformed(evt);
            }
        });

        formaPagjLabel.setForeground(new java.awt.Color(255, 255, 255));
        formaPagjLabel.setText("Forma de Pagamento:");

        formaPagjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Cartão de Crédito", "Cartão de Débito" }));

        voltarjButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/voltar-icon.png"))); // NOI18N
        voltarjButton.setText("Voltar");
        voltarjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarjButtonMouseClicked(evt);
            }
        });
        voltarjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarjButtonActionPerformed(evt);
            }
        });

        cancelVendajButton.setBackground(new java.awt.Color(255, 255, 255));
        cancelVendajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/cancel_icon.png"))); // NOI18N
        cancelVendajButton.setText("Cancelar");
        cancelVendajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelVendajButtonMouseClicked(evt);
            }
        });

        numIngjLabel.setForeground(new java.awt.Color(255, 255, 255));
        numIngjLabel.setText("N°  de ingressos:");

        numIngressosjLabel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        numIngressosjLabel.setForeground(new java.awt.Color(255, 255, 255));

        valorTotaljLabel.setForeground(new java.awt.Color(255, 255, 255));
        valorTotaljLabel.setText("Valor total:");

        reaisjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reaisjLabel.setForeground(new java.awt.Color(255, 51, 102));
        reaisjLabel.setText("R$");

        totalReaisjLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        totalReaisjLabel.setForeground(new java.awt.Color(255, 51, 102));

        removerjButton.setBackground(new java.awt.Color(255, 255, 255));
        removerjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/remove_icon.png"))); // NOI18N
        removerjButton.setText("Remover");
        removerjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removerjButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(fecharVendajButton)
                        .addGap(18, 18, 18)
                        .addComponent(voltarjButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelVendajButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(valorTotaljLabel)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(formaPagjLabel)
                                .addComponent(numIngjLabel))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(reaisjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(totalReaisjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(formaPagjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numIngressosjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(65, 65, 65))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(removerjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removerjButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numIngressosjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numIngjLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(totalReaisjLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reaisjLabel)
                            .addComponent(valorTotaljLabel))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(formaPagjLabel))
                    .addComponent(formaPagjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(voltarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cancelVendajButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fecharVendajButton))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        
    }//GEN-LAST:event_formWindowOpened

    private void cancelVendajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelVendajButtonMouseClicked
        if(JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda?","Cancelar venda", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
            boolean operaçao = false;
            for(int i=0; i<cinema.ingressos.size(); i++){
               cinema.sessoes.get(cinema.ingressos.get(i).getPosicao())
                      .calcLotaçao(cinema.sessoes.get(cinema.ingressos.get(i).getPosicao()).getNomeSala(), 
                                   cinema.sessoes.get(cinema.ingressos.get(i).getPosicao()).getLotaçao(),
                                   operaçao);
            }

            cinema.ingressos.clear();
            new ComprarIngresso().setVisible(true);
            this.dispose(); 
        }
    
    }//GEN-LAST:event_cancelVendajButtonMouseClicked

    private void voltarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarjButtonMouseClicked
       venda.setPrecoTotal(0);
       new ComprarIngresso().setVisible(true);
       this.dispose();
    }//GEN-LAST:event_voltarjButtonMouseClicked

    private void fecharVendajButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fecharVendajButtonMouseClicked
       venda.setFormaPagamento(formaPagjComboBox.getSelectedItem().toString());
           
       for(int i=0; i<cinema.ingressos.size();i++){
           if(cinema.sessoes.get(cinema.ingressos.get(i).getPosicao()).getLotaçao() == 0){
               cinema.sessoes.remove(cinema.ingressos.get(i).getPosicao());
           }
           cinema.ingressos.get(i).imprimirIngresso();
       }
       
       cinema.ingressos.clear();
       
       new ComprarIngresso().setVisible(true);
       this.dispose();
       
       
    }//GEN-LAST:event_fecharVendajButtonMouseClicked

    private void voltarjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_voltarjButtonActionPerformed
    private void fecharVendajButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharVendajButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecharVendajButtonActionPerformed

    private void removerjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removerjButtonMouseClicked
      if(vendajList.getSelectedIndex() == -1){      
            JOptionPane.showMessageDialog(null, "Por favor, selecione um ingresso para remover."); 
        }
        else{
            cinema.sessoes.get(cinema.ingressos.get(vendajList.getSelectedIndex()).getPosicao())
                  .calcLotaçao(cinema.sessoes.get(cinema.ingressos.get(vendajList.getSelectedIndex()).getPosicao()).getNomeSala(), 
                               cinema.sessoes.get(cinema.ingressos.get(vendajList.getSelectedIndex()).getPosicao()).getLotaçao(),
                               false);
            cinema.ingressos.remove(vendajList.getSelectedIndex());
            if(cinema.ingressos.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há ingressos para vender.");
                new ComprarIngresso().setVisible(true);
                this.dispose();
            }            
            venda.setPrecoTotal(0);
            for(int i=0; i<cinema.ingressos.size(); i++){
               venda.calcPrecoTotal(cinema.ingressos.get(i).getPrecoIngresso());
            }
            atualizaCampos();
            
        }
    }//GEN-LAST:event_removerjButtonMouseClicked

     public void atualizaCampos(){
        DecimalFormat df = new DecimalFormat("0.00"); 
        DefaultListModel model = new DefaultListModel();
        vendajList.setModel(model);
        vendajList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);  
        for(int i=0; i<cinema.ingressos.size(); i++){
            model.addElement(cinema.ingressos.get(i).getDados());
         }
        numIngressosjLabel.setText(Integer.toString(cinema.ingressos.size()));
        totalReaisjLabel.setText(df.format(venda.getPrecoTotal()));
    }
     
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
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelVendajButton;
    private javax.swing.JButton fecharVendajButton;
    private javax.swing.JComboBox<String> formaPagjComboBox;
    private javax.swing.JLabel formaPagjLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel numIngjLabel;
    private javax.swing.JLabel numIngressosjLabel;
    private javax.swing.JLabel reaisjLabel;
    private javax.swing.JButton removerjButton;
    private javax.swing.JLabel totalReaisjLabel;
    private javax.swing.JLabel valorTotaljLabel;
    private javax.swing.JList<String> vendajList;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
