/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PedroH
 */
public class FormFilme extends javax.swing.JFrame {
        
    Cinema cinema;       
    /**
     * Creates new form FormFilme
     */
    public FormFilme(){
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
    }
    
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        salvarFilmejButton = new javax.swing.JButton();
        listaFilmesButton = new javax.swing.JButton();
        voltarButton = new javax.swing.JButton();
        tituloLabel = new javax.swing.JLabel();
        tituloTextField = new javax.swing.JTextField();
        generoLabel = new javax.swing.JLabel();
        generoTextField = new javax.swing.JTextField();
        duracaoLabel = new javax.swing.JLabel();
        duracaoTextField = new javax.swing.JTextField();
        classIndLabel = new javax.swing.JLabel();
        classIndComboBox = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        cadastroSessaojButton = new javax.swing.JButton();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro - Filme");
        setBackground(new java.awt.Color(102, 255, 102));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        salvarFilmejButton.setBackground(new java.awt.Color(255, 255, 255));
        salvarFilmejButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/icon_save.png"))); // NOI18N
        salvarFilmejButton.setText("Salvar");
        salvarFilmejButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                salvarFilmejButtonMouseClicked(evt);
            }
        });
        salvarFilmejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarFilmejButtonActionPerformed(evt);
            }
        });

        listaFilmesButton.setBackground(new java.awt.Color(255, 255, 255));
        listaFilmesButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/lista-icon.png"))); // NOI18N
        listaFilmesButton.setText("Filmes cadastrados");
        listaFilmesButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaFilmesButtonMouseClicked(evt);
            }
        });

        voltarButton.setBackground(new java.awt.Color(255, 255, 255));
        voltarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/voltar-icon.png"))); // NOI18N
        voltarButton.setText("Voltar");
        voltarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                voltarButtonMouseClicked(evt);
            }
        });

        tituloLabel.setForeground(new java.awt.Color(255, 255, 255));
        tituloLabel.setText("Título:");

        generoLabel.setForeground(new java.awt.Color(255, 255, 255));
        generoLabel.setText("Gênero:");

        duracaoLabel.setForeground(new java.awt.Color(255, 255, 255));
        duracaoLabel.setText("Duração:");

        try{
            javax.swing.text.MaskFormatter horario= new javax.swing.text.MaskFormatter("##:##");
            duracaoTextField = new javax.swing.JFormattedTextField(horario);

        }
        catch (Exception e){

        }

        classIndLabel.setForeground(new java.awt.Color(255, 255, 255));
        classIndLabel.setText("Classificação Indicativa:");

        classIndComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Livre", "10 anos", "12 anos", "14 anos", "16 anos", "18 anos" }));

        cadastroSessaojButton.setBackground(new java.awt.Color(255, 255, 255));
        cadastroSessaojButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cinema/cadastro_icon.jpg"))); // NOI18N
        cadastroSessaojButton.setText("Cadastrar Sessão");
        cadastroSessaojButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroSessaojButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(classIndLabel)
                                .addGap(18, 18, 18)
                                .addComponent(classIndComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tituloLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(generoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(duracaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(duracaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tituloTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                                    .addComponent(generoTextField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(177, 177, 177)
                        .addComponent(salvarFilmejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(listaFilmesButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cadastroSessaojButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltarButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloLabel)
                    .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generoLabel)
                    .addComponent(generoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duracaoLabel)
                    .addComponent(duracaoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classIndLabel)
                    .addComponent(classIndComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(salvarFilmejButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(voltarButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(listaFilmesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cadastroSessaojButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void salvarFilmejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarFilmejButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salvarFilmejButtonActionPerformed

    private void salvarFilmejButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_salvarFilmejButtonMouseClicked
        if(("".equals(tituloTextField.getText())) || ("".equals(generoTextField.getText())) || ("  :  ".equals(duracaoTextField.getText()))){
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos para cadastrar o filme.");
        }
        else{
            Filme filme = new Filme();
            filme.setTitulo(tituloTextField.getText());
            filme.setGenero(generoTextField.getText());
            filme.setDuraçao(duracaoTextField.getText());
            filme.setClassIndicativa(classIndComboBox.getSelectedItem().toString());

            cinema.filmes.add(filme);
            atualizaCampos();
            JOptionPane.showMessageDialog(null, "Filme cadastrado com sucesso.");
        }
       
    }//GEN-LAST:event_salvarFilmejButtonMouseClicked

    private void listaFilmesButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaFilmesButtonMouseClicked
         if(!cinema.filmes.isEmpty()){
            new ListaFilme(true).setVisible(true);
            this.dispose();
        }
         else{
            JOptionPane.showMessageDialog(null, "Não há filmes cadastrados.");
         }
         
    
    }//GEN-LAST:event_listaFilmesButtonMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void voltarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_voltarButtonMouseClicked
        new ComprarIngresso().setVisible(true);
        this.dispose();
    
    }//GEN-LAST:event_voltarButtonMouseClicked

    private void cadastroSessaojButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroSessaojButtonMouseClicked
        new FormSessao().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cadastroSessaojButtonMouseClicked

    public void atualizaCampos(){
        tituloTextField.setText("");
        generoTextField.setText(""); 
        duracaoTextField.setText("");
        classIndComboBox.setSelectedItem("Livre");
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
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormFilme.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormFilme().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroSessaojButton;
    private javax.swing.JComboBox<String> classIndComboBox;
    private javax.swing.JLabel classIndLabel;
    private javax.swing.JLabel duracaoLabel;
    private javax.swing.JTextField duracaoTextField;
    private javax.swing.JLabel generoLabel;
    private javax.swing.JTextField generoTextField;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton listaFilmesButton;
    private javax.swing.JButton salvarFilmejButton;
    private javax.swing.JLabel tituloLabel;
    private javax.swing.JTextField tituloTextField;
    private javax.swing.JButton voltarButton;
    // End of variables declaration//GEN-END:variables
}
