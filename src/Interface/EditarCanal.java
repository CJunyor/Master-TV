package Interface;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mastertv.Canal;
import mastertv.Categoria;

public class EditarCanal extends javax.swing.JFrame {

    ConsultarCanais canal;
    public EditarCanal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lNome = new javax.swing.JLabel();
        lClass = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        tfNome = new javax.swing.JTextField();
        pConfirmar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tfClassif = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        cbCategoria = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tv-Master");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/television.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(0, 38, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(59, 59, 59)
                .addComponent(jLabel3)
                .addGap(44, 44, 44)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 400));

        lNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lNome.setForeground(new java.awt.Color(255, 255, 255));
        lNome.setText("Nome");
        jPanel1.add(lNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, -1, -1));

        lClass.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lClass.setForeground(new java.awt.Color(255, 255, 255));
        lClass.setText("Cassificação etária");
        jPanel1.add(lClass, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Categoria");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 220, 120, 10));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 320, 10));

        tfNome.setBackground(jPanel1.getBackground());
        tfNome.setForeground(new java.awt.Color(255, 255, 255));
        tfNome.setToolTipText("Nome");
        tfNome.setBorder(null);
        tfNome.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 320, 20));

        pConfirmar.setBackground(new java.awt.Color(0, 102, 102));
        pConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConfirmarMouseExited(evt);
            }
        });
        pConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirmar");
        pConfirmar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel1.add(pConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 140, 40));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Editar Canal");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        tfClassif.setBackground(jPanel1.getBackground());
        tfClassif.setForeground(new java.awt.Color(255, 255, 255));
        tfClassif.setBorder(null);
        tfClassif.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(tfClassif, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, 120, 20));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 51));
        jLabel9.setText("Cancelar");
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 70, 40));

        cbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(cbCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseClicked
        lNome.setForeground(Color.white);
        lClass.setForeground(Color.white);
        Canal c = new Canal();
        Categoria cat = new Categoria();
        c.setNome(tfNome.getText());
        c.setClassificacaoEtaria(tfClassif.getText());
        cat.setNome((String) cbCategoria.getSelectedItem());
        cat.getFromDB();
        c.setCategoria(cat.getId());
        if(c.getNome().length()>50 || c.getNome().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Nome não preenchido ou muito grande!", "Erro!", ERROR_MESSAGE);
            lNome.setForeground(Color.red);
            if(c.getClassificacaoEtaria().length()>50 || c.getClassificacaoEtaria().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Classificação não preenchida ou muito grande!", "Erro!", ERROR_MESSAGE);
                lClass.setForeground(Color.red);
            }
            return;
        }
        else if(c.getClassificacaoEtaria().length()>50 || c.getClassificacaoEtaria().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Classificação não preenchido ou muito grande!", "Erro!", ERROR_MESSAGE);
            lClass.setForeground(Color.red);
            return;
        }
        if(c.updateOnDb((int) canal.getTabela().getModel().getValueAt(canal.getTabela().getSelectedRow(), 1))) {
            JOptionPane.showMessageDialog(rootPane, "Editado com Sucesso","Sucesso!", INFORMATION_MESSAGE);
            canal.getTabela().getModel().setValueAt(c.getNome(), canal.getTabela().getSelectedRow(), 0);
            canal.getTabela().getModel().setValueAt(c.getClassificacaoEtaria(), canal.getTabela().getSelectedRow(), 3);
            canal.getTabela().getModel().setValueAt(cat.getNome(), canal.getTabela().getSelectedRow(), 4);
        }
        else JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tenat editar!", "Erro!", ERROR_MESSAGE);
        this.dispose();

    }//GEN-LAST:event_pConfirmarMouseClicked

    private void pConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseEntered
        setColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseEntered

    private void pConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseExited
        resetColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseExited

    public ConsultarCanais getCanal() {
        return canal;
    }

    public void setCanal(ConsultarCanais canal) {
        this.canal = canal;
    }

    public JComboBox<String> getCbCategoria() {
        return cbCategoria;
    }

    public void setCbCategoria(JComboBox<String> cbCategoria) {
        this.cbCategoria = cbCategoria;
    }

    public JTextField getTfClassif() {
        return tfClassif;
    }

    public void setTfClassif(JTextField tfClassif) {
        this.tfClassif = tfClassif;
    }

    public JTextField getTfNome() {
        return tfNome;
    }

    public void setTfNome(JTextField tfNome) {
        this.tfNome = tfNome;
    }

    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,153,153));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,102,102));
    }
    
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(EditarCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCanal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCanal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lClass;
    private javax.swing.JLabel lNome;
    private javax.swing.JPanel pConfirmar;
    private javax.swing.JTextField tfClassif;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
