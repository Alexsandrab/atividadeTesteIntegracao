package maquinaCartao;

import cartao.CartaoDeCredito;
import compra.Compra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marília
 */
public class Maquineta extends javax.swing.JFrame {

    private boolean esconderSaidaUsuario = true;
    
    String saidaInstrucao = "";
    String saidaUsuario = "";
    String entradaUsuario = "";
    String etapa = "";
    Double valorCompra;
    String senhaUsuario;
    
//    Compra compra;
//    CartaoDeCredito cartao;
            
//    Maquineta(Compra compra, CartaoDeCredito cartao){
//        this.compra = compra;
//        this.cartao = cartao;
//        initComponents();  
//        esconderSaidaUsuario = true;
//        saidaInstrucao = ("Valor R$ " + compra.getValorBruto() + "\nSenha: ");
//    }
    
    public Maquineta() {
        initComponents();
        
        btnAsterisco.setEnabled(false);
        btnCerquilha.setEnabled(false);
        txtArea.setEditable(false);
        //CartaoDeCredito cartao = new CartaoDeCredito();
        //senhaUsuario = cartao.getSenha();
        //para teste: senha FIXA
        senhaUsuario = "1234";
        
        //Compra compra = new Compra();
        //valorCompra = compra.getValorBruto();
        //para teste: valorCompra FIXO
        valorCompra = 83.92;
        
        saidaInstrucao = ("Valor R$ " + valorCompra + "\nInsira a Senha: ");
        txtArea.setText(saidaInstrucao + saidaUsuario);
    }

    public void addEntradaUsuario(String numb){
        
        entradaUsuario=entradaUsuario.concat(numb);
        
        if(!esconderSaidaUsuario){
            saidaUsuario = entradaUsuario;
        } else {
            StringBuilder senhaAsterisco = new StringBuilder(entradaUsuario.length());
            for (int i=0; i<entradaUsuario.length(); i++){
                senhaAsterisco.append("*");
            }
            saidaUsuario = senhaAsterisco.toString();
        }
        txtArea.setText(saidaInstrucao + saidaUsuario);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnN1 = new javax.swing.JButton();
        btnN2 = new javax.swing.JButton();
        btnN3 = new javax.swing.JButton();
        btnN4 = new javax.swing.JButton();
        btnN5 = new javax.swing.JButton();
        btnN6 = new javax.swing.JButton();
        btnN7 = new javax.swing.JButton();
        btnN8 = new javax.swing.JButton();
        btnN9 = new javax.swing.JButton();
        btnAsterisco = new javax.swing.JButton();
        btnNzero = new javax.swing.JButton();
        btnCerquilha = new javax.swing.JButton();
        btnAnula = new javax.swing.JButton();
        btnLimpa = new javax.swing.JButton();
        btnEntra = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnN1.setBackground(new java.awt.Color(51, 51, 51));
        btnN1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN1.setForeground(new java.awt.Color(255, 255, 255));
        btnN1.setText("1");
        btnN1.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN1, gridBagConstraints);

        btnN2.setBackground(new java.awt.Color(51, 51, 51));
        btnN2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN2.setForeground(new java.awt.Color(255, 255, 255));
        btnN2.setText("2");
        btnN2.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN2, gridBagConstraints);

        btnN3.setBackground(new java.awt.Color(51, 51, 51));
        btnN3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN3.setForeground(new java.awt.Color(255, 255, 255));
        btnN3.setText("3");
        btnN3.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN3, gridBagConstraints);

        btnN4.setBackground(new java.awt.Color(51, 51, 51));
        btnN4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN4.setForeground(new java.awt.Color(255, 255, 255));
        btnN4.setText("4");
        btnN4.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN4, gridBagConstraints);

        btnN5.setBackground(new java.awt.Color(51, 51, 51));
        btnN5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN5.setForeground(new java.awt.Color(255, 255, 255));
        btnN5.setText("5");
        btnN5.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN5, gridBagConstraints);

        btnN6.setBackground(new java.awt.Color(51, 51, 51));
        btnN6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN6.setForeground(new java.awt.Color(255, 255, 255));
        btnN6.setText("6");
        btnN6.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN6, gridBagConstraints);

        btnN7.setBackground(new java.awt.Color(51, 51, 51));
        btnN7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN7.setForeground(new java.awt.Color(255, 255, 255));
        btnN7.setText("7");
        btnN7.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN7, gridBagConstraints);

        btnN8.setBackground(new java.awt.Color(51, 51, 51));
        btnN8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN8.setForeground(new java.awt.Color(255, 255, 255));
        btnN8.setText("8");
        btnN8.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN8, gridBagConstraints);

        btnN9.setBackground(new java.awt.Color(51, 51, 51));
        btnN9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnN9.setForeground(new java.awt.Color(255, 255, 255));
        btnN9.setText("9");
        btnN9.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnN9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnN9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnN9, gridBagConstraints);

        btnAsterisco.setBackground(new java.awt.Color(51, 51, 51));
        btnAsterisco.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnAsterisco.setForeground(new java.awt.Color(255, 255, 255));
        btnAsterisco.setText("*");
        btnAsterisco.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnAsterisco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsteriscoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnAsterisco, gridBagConstraints);

        btnNzero.setBackground(new java.awt.Color(51, 51, 51));
        btnNzero.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnNzero.setForeground(new java.awt.Color(255, 255, 255));
        btnNzero.setText("0");
        btnNzero.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnNzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNzeroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnNzero, gridBagConstraints);

        btnCerquilha.setBackground(new java.awt.Color(51, 51, 51));
        btnCerquilha.setFont(new java.awt.Font("Segoe UI Emoji", 1, 36)); // NOI18N
        btnCerquilha.setForeground(new java.awt.Color(255, 255, 255));
        btnCerquilha.setText("#");
        btnCerquilha.setMargin(new java.awt.Insets(4, 30, 4, 30));
        btnCerquilha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerquilhaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnCerquilha, gridBagConstraints);

        btnAnula.setBackground(new java.awt.Color(255, 0, 0));
        btnAnula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAnula.setForeground(new java.awt.Color(255, 255, 255));
        btnAnula.setText("ANULA");
        btnAnula.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btnAnula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnulaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnAnula, gridBagConstraints);

        btnLimpa.setBackground(new java.awt.Color(255, 204, 0));
        btnLimpa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpa.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpa.setText("LIMPA");
        btnLimpa.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btnLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnLimpa, gridBagConstraints);

        btnEntra.setBackground(new java.awt.Color(0, 153, 0));
        btnEntra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEntra.setForeground(new java.awt.Color(255, 255, 255));
        btnEntra.setText("ENTRA");
        btnEntra.setMargin(new java.awt.Insets(10, 20, 10, 20));
        btnEntra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(btnEntra, gridBagConstraints);

        jScrollPane1.setBackground(new java.awt.Color(204, 204, 255));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        txtArea.setColumns(15);
        txtArea.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        txtArea.setRows(5);
        txtArea.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtArea.setMinimumSize(new java.awt.Dimension(0, 10));
        jScrollPane1.setViewportView(txtArea);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        getContentPane().add(jScrollPane1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnN1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN1ActionPerformed
        addEntradaUsuario("1");
    }//GEN-LAST:event_btnN1ActionPerformed

    private void btnAnulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnulaActionPerformed
        dispose();
    }//GEN-LAST:event_btnAnulaActionPerformed

    private void btnLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaActionPerformed
        entradaUsuario="";
        saidaUsuario="";
        txtArea.setText(saidaInstrucao + saidaUsuario);
    }//GEN-LAST:event_btnLimpaActionPerformed

    private void btnN2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN2ActionPerformed
        addEntradaUsuario("2");
    }//GEN-LAST:event_btnN2ActionPerformed

    private void btnN3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN3ActionPerformed
        addEntradaUsuario("3");
    }//GEN-LAST:event_btnN3ActionPerformed

    private void btnN4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN4ActionPerformed
        addEntradaUsuario("4");
    }//GEN-LAST:event_btnN4ActionPerformed

    private void btnN5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN5ActionPerformed
        addEntradaUsuario("5");
    }//GEN-LAST:event_btnN5ActionPerformed

    private void btnN6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN6ActionPerformed
        addEntradaUsuario("6");
    }//GEN-LAST:event_btnN6ActionPerformed

    private void btnN7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN7ActionPerformed
        addEntradaUsuario("7");
    }//GEN-LAST:event_btnN7ActionPerformed

    private void btnN8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN8ActionPerformed
        addEntradaUsuario("8");
    }//GEN-LAST:event_btnN8ActionPerformed

    private void btnN9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnN9ActionPerformed
        addEntradaUsuario("9");
    }//GEN-LAST:event_btnN9ActionPerformed

    private void btnAsteriscoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsteriscoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAsteriscoActionPerformed

    private void btnNzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNzeroActionPerformed
        addEntradaUsuario("0");
    }//GEN-LAST:event_btnNzeroActionPerformed

    private void btnCerquilhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerquilhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCerquilhaActionPerformed

    private void btnEntraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntraActionPerformed
        
        if(entradaUsuario.length() == 0) return;
        
        if (entradaUsuario.equals(senhaUsuario)){
            saidaInstrucao = "PAGAMENTO APROVADO";
        } else {
            saidaInstrucao = "SENHA INCORRETA";
            //colocar senha novamente ...
        }
        txtArea.setText(saidaInstrucao);
    }//GEN-LAST:event_btnEntraActionPerformed

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
            java.util.logging.Logger.getLogger(Maquineta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Maquineta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Maquineta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Maquineta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquineta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnula;
    private javax.swing.JButton btnAsterisco;
    private javax.swing.JButton btnCerquilha;
    private javax.swing.JButton btnEntra;
    private javax.swing.JButton btnLimpa;
    private javax.swing.JButton btnN1;
    private javax.swing.JButton btnN2;
    private javax.swing.JButton btnN3;
    private javax.swing.JButton btnN4;
    private javax.swing.JButton btnN5;
    private javax.swing.JButton btnN6;
    private javax.swing.JButton btnN7;
    private javax.swing.JButton btnN8;
    private javax.swing.JButton btnN9;
    private javax.swing.JButton btnNzero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtArea;
    // End of variables declaration//GEN-END:variables
}