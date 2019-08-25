/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Caioba
 */
public class EditSessao extends javax.swing.JFrame {
    
    Cinema cinema;
    private int pos;
    private boolean nav;
   
    public EditSessao() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
    }
    
    public EditSessao(int posicao, boolean nav){
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
       
        this.nav = nav;
        pos = posicao;
        atualizaCampos(posicao);
         
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        nomeSalajComboBox = new javax.swing.JComboBox<>();
        dubladoLegendadojLabel = new javax.swing.JLabel();
        dubladojRadioButton = new javax.swing.JRadioButton();
        legendadojRadioButton = new javax.swing.JRadioButton();
        salaComumjRadioButton = new javax.swing.JRadioButton();
        salaVipjRadioButton = new javax.swing.JRadioButton();
        tresDjCheckBox = new javax.swing.JCheckBox();
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
        SalvarjButton1 = new javax.swing.JButton();
        CancelarjButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sessão - Alterar dados");

        nomeSalajComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        dubladoLegendadojLabel.setForeground(new java.awt.Color(255, 255, 255));
        dubladoLegendadojLabel.setText("Dublado/Legendado:");

        dubladojRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(dubladojRadioButton);
        dubladojRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        dubladojRadioButton.setText("Dublado");

        legendadojRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup2.add(legendadojRadioButton);
        legendadojRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        legendadojRadioButton.setText("Legendado");

        salaComumjRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(salaComumjRadioButton);
        salaComumjRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        salaComumjRadioButton.setText("Comum");
        salaComumjRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaComumjRadioButtonMouseClicked(evt);
            }
        });

        salaVipjRadioButton.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(salaVipjRadioButton);
        salaVipjRadioButton.setForeground(new java.awt.Color(255, 255, 255));
        salaVipjRadioButton.setText("Vip");
        salaVipjRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salaVipjRadioButtonMouseClicked(evt);
            }
        });

        tresDjCheckBox.setBackground(new java.awt.Color(0, 0, 0));
        tresDjCheckBox.setForeground(new java.awt.Color(255, 255, 255));
        tresDjCheckBox.setText("3D");

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

        SalvarjButton1.setBackground(new java.awt.Color(255, 255, 255));
        SalvarjButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/icon_save.png"))); // NOI18N
        SalvarjButton1.setText("Salvar Alterações");
        SalvarjButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalvarjButton1MouseClicked(evt);
            }
        });

        CancelarjButton2.setBackground(new java.awt.Color(255, 255, 255));
        CancelarjButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/cancel_icon.png"))); // NOI18N
        CancelarjButton2.setText("Cancelar");
        CancelarjButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelarjButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filmejLabel)
                                    .addComponent(salajLabel))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(salaComumjRadioButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(salaVipjRadioButton))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(filmejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(tresDjCheckBox))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(nomeSalajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datajLabel)
                                .addGap(18, 18, 18)
                                .addComponent(datajTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(horariojLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horariojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(diaSemanajLabel)
                                .addGap(18, 18, 18)
                                .addComponent(diaSemanajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dubladoLegendadojLabel)
                                .addGap(18, 18, 18)
                                .addComponent(dubladojRadioButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(legendadojRadioButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(SalvarjButton1)
                        .addGap(56, 56, 56)
                        .addComponent(CancelarjButton2)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filmejLabel)
                    .addComponent(filmejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tresDjCheckBox))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salajLabel)
                    .addComponent(nomeSalajComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salaComumjRadioButton)
                    .addComponent(salaVipjRadioButton))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dubladoLegendadojLabel)
                    .addComponent(dubladojRadioButton)
                    .addComponent(legendadojRadioButton))
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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarjButton1)
                    .addComponent(CancelarjButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salaComumjRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaComumjRadioButtonMouseClicked
        atualizaSalaComboBox();
    }//GEN-LAST:event_salaComumjRadioButtonMouseClicked

    private void salaVipjRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salaVipjRadioButtonMouseClicked
        atualizaSalaComboBox();
    }//GEN-LAST:event_salaVipjRadioButtonMouseClicked

    private void CancelarjButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelarjButton2MouseClicked
        new ListaSessao(nav).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarjButton2MouseClicked

    private void SalvarjButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalvarjButton1MouseClicked
        String dubLeg;
        if(dubladojRadioButton.isSelected()){
            dubLeg = dubladojRadioButton.getText();
        }
        else
            dubLeg = legendadojRadioButton.getText();
        boolean tresD;
        if(tresDjCheckBox.isSelected()){
            tresD = true;
        }
        else{
            tresD = false;
        }
        
       String tipoSala = null;
        if(salaComumjRadioButton.isSelected()){
           tipoSala = salaComumjRadioButton.getText();
        }
        else if(salaVipjRadioButton.isSelected()){
            tipoSala = salaVipjRadioButton.getText();
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
        
        cinema.sessoes.set(pos, sessao);
        
        JOptionPane.showMessageDialog(null, "Filme editado com sucesso.");
        new ListaSessao(nav).setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_SalvarjButton1MouseClicked

    public void atualizaSalaComboBox(){
        if (salaComumjRadioButton.isSelected()){
          DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) nomeSalajComboBox.getModel();
          modeloCombo.removeAllElements();
          modeloCombo.addElement("Sala 01");
          modeloCombo.addElement("Sala 02");
          modeloCombo.addElement("Sala 03");
        }
        else if(salaVipjRadioButton.isSelected()){
          DefaultComboBoxModel modeloCombo = (DefaultComboBoxModel) nomeSalajComboBox.getModel();
          modeloCombo.removeAllElements();
          modeloCombo.addElement("Sala Vip 01");
          modeloCombo.addElement("Sala Vip 02");
        }
    }
    
    public void atualizaFilmeComboBox(){
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) filmejComboBox.getModel();
        comboModel.removeAllElements();
        for (int i = 0; i < cinema.filmes.size(); i++){
            comboModel.addElement(cinema.filmes.get(i).getTitulo());
        }
    }
    
    public void atualizaCampos(int posicao){
        atualizaFilmeComboBox();
        
        horariojTextField.setText(cinema.sessoes.get(posicao).getHorario());
        datajTextField.setText(cinema.sessoes.get(posicao).getData());
        diaSemanajComboBox.setSelectedItem(cinema.sessoes.get(posicao).getDiaSemana());
        filmejComboBox.setSelectedItem(cinema.sessoes.get(posicao).getNomeFilme());
        
        if((cinema.sessoes.get(posicao).getNomeSala() == "Sala Vip 01") || 
            (cinema.sessoes.get(posicao).getNomeSala() == "Sala Vip 02")){
            salaVipjRadioButton.setSelected(true);
        }
        else{
           salaComumjRadioButton.setSelected(true);
        }
        
        if(salaVipjRadioButton.isSelected() || salaComumjRadioButton.isSelected()){
          atualizaSalaComboBox();
          nomeSalajComboBox.setSelectedItem(cinema.sessoes.get(posicao).getNomeSala());
        }
        
        if(cinema.sessoes.get(posicao).getDubladoLegendado() == "Dublado"){
            dubladojRadioButton.setSelected(true);
        }
        else{
            legendadojRadioButton.setSelected(true);
        }     
        
        if(cinema.sessoes.get(posicao).getTresD()== true){
           tresDjCheckBox.setSelected(true);
        }
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
            java.util.logging.Logger.getLogger(EditSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditSessao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditSessao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelarjButton2;
    private javax.swing.JButton SalvarjButton1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel datajLabel;
    private javax.swing.JTextField datajTextField;
    private javax.swing.JComboBox<String> diaSemanajComboBox;
    private javax.swing.JLabel diaSemanajLabel;
    private javax.swing.JLabel dubladoLegendadojLabel;
    private javax.swing.JRadioButton dubladojRadioButton;
    private javax.swing.JComboBox<String> filmejComboBox;
    private javax.swing.JLabel filmejLabel;
    private javax.swing.JLabel horariojLabel;
    private javax.swing.JTextField horariojTextField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton legendadojRadioButton;
    private javax.swing.JComboBox<String> nomeSalajComboBox;
    private javax.swing.JRadioButton salaComumjRadioButton;
    private javax.swing.JRadioButton salaVipjRadioButton;
    private javax.swing.JLabel salajLabel;
    private javax.swing.JCheckBox tresDjCheckBox;
    // End of variables declaration//GEN-END:variables
}
