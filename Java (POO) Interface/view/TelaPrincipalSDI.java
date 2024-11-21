/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_interface.view;

import javax.swing.JOptionPane;

/**
 *
 * @author samueldouglasdossantos
 */
public class TelaPrincipalSDI extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipalSDI
     */
    public TelaPrincipalSDI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JDesktopPane jDesktopPane1 = new javax.swing.JDesktopPane();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        javax.swing.JTable jTable1 = new javax.swing.JTable();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        telamainsd = new javax.swing.JDesktopPane();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JSeparator jSeparator2 = new javax.swing.JSeparator();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        op_pf = new javax.swing.JRadioButton();
        op_pj = new javax.swing.JRadioButton();
        javax.swing.JButton jButton1 = new javax.swing.JButton();
        javax.swing.JMenuBar jMenuBar1 = new javax.swing.JMenuBar();
        javax.swing.JMenu jMenu1 = new javax.swing.JMenu();
        javax.swing.JMenuItem fazer_cadastro = new javax.swing.JMenuItem();
        javax.swing.JMenuItem criar_login = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem9 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem2 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu5 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem11 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem12 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem1 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem13 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu3 = new javax.swing.JMenu();
        javax.swing.JMenu jMenu4 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem6 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem7 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem8 = new javax.swing.JMenuItem();
        javax.swing.JMenu jMenu2 = new javax.swing.JMenu();
        javax.swing.JMenuItem jMenuItem3 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem4 = new javax.swing.JMenuItem();
        javax.swing.JMenuItem jMenuItem5 = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("telaprincipalSDI");
        setResizable(false);

        telamainsd.setBackground(new java.awt.Color(19, 20, 39));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Cantarell", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seja bem vindo(a)!");

        jLabel2.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Para podermos ajudar da melhor forma possível,");

        jLabel3.setFont(new java.awt.Font("Cantarell", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("selecione a opção corrrespondente à sua situação:");

        op_pf.setForeground(new java.awt.Color(255, 255, 255));
        op_pf.setText("Pessoa Física (P.F)");

        op_pj.setForeground(new java.awt.Color(255, 255, 255));
        op_pj.setText("Pessoa Jurídica(P.J)");
        op_pj.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButton1.setBackground(new java.awt.Color(0, 153, 153));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Submeter");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        telamainsd.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(jSeparator2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(op_pf, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(op_pj, javax.swing.JLayeredPane.DEFAULT_LAYER);
        telamainsd.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout telamainsdLayout = new javax.swing.GroupLayout(telamainsd);
        telamainsd.setLayout(telamainsdLayout);
        telamainsdLayout.setHorizontalGroup(
            telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telamainsdLayout.createSequentialGroup()
                .addGroup(telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(telamainsdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telamainsdLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telamainsdLayout.createSequentialGroup()
                .addGap(0, 121, Short.MAX_VALUE)
                .addGroup(telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telamainsdLayout.createSequentialGroup()
                        .addComponent(op_pf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(op_pj, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, telamainsdLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(243, 243, 243))))
            .addGroup(telamainsdLayout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        telamainsdLayout.setVerticalGroup(
            telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(telamainsdLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(56, 56, 56)
                .addGroup(telamainsdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(op_pj)
                    .addComponent(op_pf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/loginicon(1).png"))); // NOI18N
        jMenu1.setText("Pessoa Física");

        fazer_cadastro.setText("Cadastre-se");
        fazer_cadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fazer_cadastroActionPerformed(evt);
            }
        });
        jMenu1.add(fazer_cadastro);

        criar_login.setText("Login");
        criar_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                criar_loginActionPerformed(evt);
            }
        });
        jMenu1.add(criar_login);

        jMenuItem9.setText("Esqueci minha senha");
        jMenu1.add(jMenuItem9);

        jMenuItem2.setText("Sair");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/P.J.png"))); // NOI18N
        jMenu5.setText("Pessoa Jurídica");

        jMenuItem11.setText("Cadastre-se");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("Login");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem1.setText("Esqueci minha senha");
        jMenu5.add(jMenuItem1);

        jMenuItem13.setText("Sair");
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/duvidaicon.png"))); // NOI18N
        jMenu3.setText("Dúvidas frequentes");
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/sobreicon.png"))); // NOI18N
        jMenu4.setText("Sobre");

        jMenuItem6.setText("Atualizações");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem6);

        jMenuItem7.setText("Descontos");
        jMenu4.add(jMenuItem7);

        jMenuItem8.setText("Novas integrações");
        jMenu4.add(jMenuItem8);

        jMenuBar1.add(jMenu4);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_interface/images/contact(1).png"))); // NOI18N
        jMenu2.setText("Contato");

        jMenuItem3.setText("Telefone");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("WhatsApp");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Email");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telamainsd)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(telamainsd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fazer_cadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fazer_cadastroActionPerformed
        new CadastroPF_sdi1().setVisible(true);
        
    }//GEN-LAST:event_fazer_cadastroActionPerformed

    private void criar_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_criar_loginActionPerformed
        new LoginPF_sdi(this, true).setVisible(true);
        

    }//GEN-LAST:event_criar_loginActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(op_pf.equals(true)){
            JOptionPane.showMessageDialog(rootPane, "Carregando acesso de pessoa física...");
        }
        else if(op_pf.equals(false) && op_pj.equals(true)){
            JOptionPane.showMessageDialog(rootPane, "Carregando acesso de pessoa jurídica...");
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro! revise o espaço selecionado.", "Opções selecionadas simultaneamente ou em branco.", HEIGHT);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipalSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipalSDI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipalSDI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JRadioButton op_pf;
    javax.swing.JRadioButton op_pj;
    javax.swing.JDesktopPane telamainsd;
    // End of variables declaration//GEN-END:variables
}