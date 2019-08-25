/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;


/**
 *
 * @author PedroH
 */
public class FormSessao extends javax.swing.JFrame {

    Cinema cinema;
        
    public FormSessao() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        salaComumjRadioButton1.setSelected(true);   
        dubladojRadioButton1.setSelected(true);
        atualizaFilmeComboBox();  
        atualizaSalaComboBox();
    }
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        filmejLabel = new javax.swing.JLabel();
        filmejComboBox = new javax.swing.JComboBox<>();
        datajLabel = new javax.swing.JLabel();
        datajTextField = new javax.swing.JTextField();
        try{
            javax.swing.text.MaskFormatter data= new javax.swing.text.MaskFormatter("##/##/####");
            datajTextField = new javax.swing.JFormattedTextField(data);
        }
        catch (Exception e){

        }
        diaSemanajLabel = new javax.swing.JLabel();
        diaSemanajComboBox = new javax.swing.JComboBox<>();
        horariojLabel = new javax.swing.JLabel();
        horariojTextField = new javax.swing.JTextField();
        salajLabel = new javax.swing.JLabel();
        nomeSalajComboBox = new javax.swing.JComboBox<>();
        dubladoLegendadojLabel = new javax.swing.JLabel();
        dubladojRadioButton1 = new javax.swing.JRadioButton();
        legendadojRadioButton1 = new javax.swing.JRadioButton();
        salaComumjRadioButton1 = new javax.swing.JRadioButton();
        salaVipjRadioButton1 = new javax.swing.JRadioButton();
        tresDjCheckBox = new javax.swing.JCheckBox();
        salvarSessaojButton = new javax.swing.JButton();
        listarSessoesjButton = new javax.swing.JButton();
        voltarjButton = new javax.swing.JButton();
        cadastrarFilmejButton = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - Sessão");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        filmejLabel.setForeground(new java.awt.Color(255, 255, 255));
        filmejLabel.setText("Filme:");

        datajLabel.setForeground(new java.awt.Color(255, 255, 255));
        datajLabel.setText("Data:");

        diaSemanajLabel.setForeground(new java.awt.Color(255, 255, 255));
        diaSemanajLabel.setText("Dia da semana:");

        diaSemanajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado" }));

        horariojLabel.setForeground(new java.awt.Color(255, 255, 255));
        horariojLabel.setText("Horário:");

        try{
            javax.swing.text.MaskFormatter horario= new javax.swing.text.MaskFormatter("##:##");
            horariojTextField = new javax.swing.JFormattedTextField(horario);

        }
        catch (Exception e){

        }

        salajLabel.setForeground(new java.awt.Color(255, 255, 255));
        salajLabel.setText("Sala:");

        nomeSalajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        dubladoLegendadojLabel.setForeground(new java.awt.Color(255, 255, 255));
        dubladoLegendadojLabel.setText("Dublado/Legendado:");

        dubladojRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(dubladojRadioButton1);
        dubladojRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        dubladojRadioButton1.setText("Dublado");

        legendadojRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(legendadojRadioButton1);
        legendadojRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        legendadojRadioButton1.setText("Legendado");

        salaComumjRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(salaComumjRadioButton1);
        salaComumjRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        salaComumjRadioButton1.setText("Comum");
        salaComumjRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaComumjRadioButton1MouseClicked(evt);
            }
        });

        salaVipjRadioButton1.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(salaVipjRadioButton1);
        salaVipjRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        salaVipjRadioButton1.setText("Vip");
        salaVipjRadioButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaVipjRadioButton1MouseClicked(evt);
            }
        });

        tresDjCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        tresDjCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        tresDjCheckBox.setText("3D");

        salvarSessaojButton.setBackground(new java.awt.Color(255, 255, 255));
        salvarSessaojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/icon_save.png"))); // NOI18N
        salvarSessaojButton.setText("Salvar");
        salvarSessaojButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarSessaojButtonMouseClicked(evt);
            }
        });

        listarSessoesjButton.setBackground(new java.awt.Color(255, 255, 255));
        listarSessoesjButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/lista-icon.png"))); // NOI18N
        listarSessoesjButton.setText("Sessões cadastradas");
        listarSessoesjButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listarSessoesjButtonMouseClicked(evt);
            }
        });
        listarSessoesjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarSessoesjButtonActionPerformed(evt);
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

        cadastrarFilmejButton.setBackground(new java.awt.Color(255, 255, 255));
        cadastrarFilmejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/cadastro_icon.jpg"))); // NOI18N
        cadastrarFilmejButton.setText("Cadastrar filme");
        cadastrarFilmejButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarFilmejButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filmejLabel)
                            .addComponent(salajLabel))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filmejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tresDjCheckBox))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(salaComumjRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salaVipjRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(nomeSalajComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dubladoLegendadojLabel)
                                .addGap(18, 18, 18)
                                .addComponent(dubladojRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(horariojLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(legendadojRadioButton1)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diaSemanajLabel)
                                .addGap(18, 18, 18)
                                .addComponent(diaSemanajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datajLabel)
                                .addGap(18, 18, 18)
                                .addComponent(datajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(salvarSessaojButton)
                        .addGap(176, 176, 176))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listarSessoesjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cadastrarFilmejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltarjButton)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmejLabel)
                    .addComponent(filmejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tresDjCheckBox))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salajLabel)
                    .addComponent(nomeSalajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaComumjRadioButton1)
                    .addComponent(salaVipjRadioButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dubladoLegendadojLabel)
                    .addComponent(dubladojRadioButton1)
                    .addComponent(legendadojRadioButton1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datajLabel)
                    .addComponent(datajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(horariojLabel)
                    .addComponent(horariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaSemanajLabel)
                    .addComponent(diaSemanajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(salvarSessaojButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastrarFilmejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(listarSessoesjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(voltarjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void voltarjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarjButtonMouseClicked
        new ComprarIngresso().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_voltarjButtonMouseClicked

    private void cadastrarFilmejButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarFilmejButtonMouseClicked
        new FormFilme().setVisible(true);  
        this.dispose();               
    }//GEN-LAST:event_cadastrarFilmejButtonMouseClicked

    private void salaComumjRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaComumjRadioButton1MouseClicked
        atualizaSalaComboBox();
    }//GEN-LAST:event_salaComumjRadioButton1MouseClicked

    private void salaVipjRadioButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaVipjRadioButton1MouseClicked
        atualizaSalaComboBox();
    }//GEN-LAST:event_salaVipjRadioButton1MouseClicked

    private void salvarSessaojButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarSessaojButtonMouseClicked
        if(("  /  /    ".equals(datajTextField.getText())) || ("  :  ".equals(horariojTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos para cadastrar a sessão.");
        }
        else{        
            String dubLeg;
            if(dubladojRadioButton1.isSelected()){
                dubLeg = dubladojRadioButton1.getText();
            }
            else
                dubLeg = legendadojRadioButton1.getText();

            boolean tresD;
            if(tresDjCheckBox.isSelected()){
                tresD = true;
            }
            else{
                tresD = false;
            }

            String tipoSala = null;
            if(salaComumjRadioButton1.isSelected()){
                tipoSala = salaComumjRadioButton1.getText();
            }
            else if(salaVipjRadioButton1.isSelected()){
                tipoSala = salaVipjRadioButton1.getText();
            }

            Sessão sessao = new Sessão();
            sessao.setNomeFilme(filmejComboBox.getSelectedItem().toString());
            sessao.setTresD(tresD);
            sessao.setHorario(horariojTextField.getText());
            sessao.setData(datajTextField.getText());
            sessao.setDubladoLegendado(dubLeg);
            sessao.setNomeSala(nomeSalajComboBox.getSelectedItem().toString());
            sessao.setDiaSemana(diaSemanajComboBox.getSelectedItem().toString());
            sessao.calcValorIngresso(tresD, tipoSala, diaSemanajComboBox.getSelectedItem().toString());
            sessao.calcLotaçao(nomeSalajComboBox.getSelectedItem().toString());

            cinema.sessoes.add(sessao);

            atualizaCampos();
            JOptionPane.showMessageDialog(null, "Sessão cadastrada com sucesso.");
        }    
    }//GEN-LAST:event_salvarSessaojButtonMouseClicked

    private void listarSessoesjButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listarSessoesjButtonMouseClicked
       if(!cinema.sessoes.isEmpty()){
            new ListaSessao(true).setVisible(true);
            this.dispose();
         }
         else{
            JOptionPane.showMessageDialog(null, "Não há sessões cadastradas.");
         }
    }//GEN-LAST:event_listarSessoesjButtonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      if(cinema.filmes.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não há filmes cadastrados. Para cadastrar uma sessão é necessário ter"
                    + " pelo menos um filme gravado.\nEm razão disso você será redirecionado para a página de cadastro"
                    + " de filmes.");
            
            new FormFilme().setVisible(true);  
            this.dispose();
        }
    }//GEN-LAST:event_formWindowOpened

    private void listarSessoesjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarSessoesjButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listarSessoesjButtonActionPerformed

    public void atualizaFilmeComboBox(){
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) filmejComboBox.getModel();
        comboModel.removeAllElements();
        for (int i=0; i<cinema.filmes.size(); i++){
            comboModel.addElement(cinema.filmes.get(i).getTitulo());
        }
        
        
    }
    
    public void atualizaSalaComboBox(){
        if (salaComumjRadioButton1.isSelected()){
          DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) nomeSalajComboBox.getModel();
          modeloCombo.removeAllElements();
          modeloCombo.addElement("Sala 01");
          modeloCombo.addElement("Sala 02");
          modeloCombo.addElement("Sala 03");
        }
        else if(salaVipjRadioButton1.isSelected()){
          DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) nomeSalajComboBox.getModel();
          modeloCombo.removeAllElements();
          modeloCombo.addElement("Sala Vip 01");
          modeloCombo.addElement("Sala Vip 02");
        }
    }
    
    public void atualizaCampos(){
        atualizaFilmeComboBox();
        tresDjCheckBox.setSelected(false);
        salaComumjRadioButton1.setSelected(true);  
        atualizaSalaComboBox();
        dubladojRadioButton1.setSelected(true);
        datajTextField.setText("");
        horariojTextField.setText("");
        diaSemanajComboBox.setSelectedItem("Domingo");
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
            java.util.logging.Logger.getLogger(FormSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormSessao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton cadastrarFilmejButton;
    private javax.swing.JLabel datajLabel;
    private javax.swing.JTextField datajTextField;
    private javax.swing.JComboBox<String> diaSemanajComboBox;
    private javax.swing.JLabel diaSemanajLabel;
    private javax.swing.JLabel dubladoLegendadojLabel;
    private javax.swing.JRadioButton dubladojRadioButton1;
    private javax.swing.JComboBox<String> filmejComboBox;
    private javax.swing.JLabel filmejLabel;
    private javax.swing.JLabel horariojLabel;
    private javax.swing.JTextField horariojTextField;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JRadioButton legendadojRadioButton1;
    private javax.swing.JButton listarSessoesjButton;
    private javax.swing.JComboBox<String> nomeSalajComboBox;
    private javax.swing.JRadioButton salaComumjRadioButton1;
    private javax.swing.JRadioButton salaVipjRadioButton1;
    private javax.swing.JLabel salajLabel;
    private javax.swing.JButton salvarSessaojButton;
    private javax.swing.JCheckBox tresDjCheckBox;
    private javax.swing.JButton voltarjButton;
    // End of variables declaration//GEN-END:variables
}
