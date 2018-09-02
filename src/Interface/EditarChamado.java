package Interface;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import mastertv.Chamado;
import mastertv.Funcionario;

public class EditarChamado extends javax.swing.JFrame {

    ConsultarChamados chamado;
    public EditarChamado() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lMotivo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tMotivo = new javax.swing.JTextArea();
        pConfirmar = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        cbTecnicos = new javax.swing.JComboBox<>();
        lTecnico = new javax.swing.JLabel();
        lSituação = new javax.swing.JLabel();
        cbSituação = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tv-Master");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 20, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/phone-auricular-with-high-volume.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 170, 10));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 150, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 130, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 460));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Chamado");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 23, -1, -1));

        lMotivo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lMotivo.setForeground(new java.awt.Color(255, 255, 255));
        lMotivo.setText("Motivo");
        jPanel2.add(lMotivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        tMotivo.setBackground(jPanel2.getBackground());
        tMotivo.setColumns(20);
        tMotivo.setForeground(new java.awt.Color(255, 255, 255));
        tMotivo.setLineWrap(true);
        tMotivo.setTabSize(4);
        tMotivo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tMotivo.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tMotivo);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 300, 110));

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

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar");
        pConfirmar.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(pConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 130, 40));

        pCancelar.setBackground(new java.awt.Color(0, 51, 51));
        pCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCancelarMouseClicked(evt);
            }
        });
        pCancelar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 51));
        jLabel8.setText("Cancelar");
        pCancelar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel2.add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 70, 40));

        cbTecnicos.setBackground(jPanel2.getBackground());
        cbTecnicos.setForeground(new java.awt.Color(255, 255, 255));
        cbTecnicos.setBorder(null);
        jPanel2.add(cbTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        lTecnico.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lTecnico.setForeground(new java.awt.Color(255, 255, 255));
        lTecnico.setText("Tecnico");
        jPanel2.add(lTecnico, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lSituação.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lSituação.setForeground(new java.awt.Color(255, 255, 255));
        lSituação.setText("Situação");
        jPanel2.add(lSituação, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cbSituação.setBackground(jPanel2.getBackground());
        cbSituação.setForeground(new java.awt.Color(255, 255, 255));
        cbSituação.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aberto", "Em Resolução", "Concluído" }));
        cbSituação.setBorder(null);
        jPanel2.add(cbSituação, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 400, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseClicked
        lMotivo.setForeground(Color.white);
        lTecnico.setForeground(Color.white);
        lSituação.setForeground(Color.white);
        if(tMotivo.getText().isEmpty() || tMotivo.getText().length()>80){
            JOptionPane.showMessageDialog(rootPane, "Motivo não preenchido ou texto muito grande", "Erro!", ERROR_MESSAGE);
            lMotivo.setForeground(Color.red);
            if(cbTecnicos.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(rootPane, "Nenhum Tecnico foi selecionado", "Erro!", ERROR_MESSAGE);
                lTecnico.setForeground(Color.red);
            }
            if(cbSituação.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(rootPane, "Nenhum situação foi selecionada", "Erro!", ERROR_MESSAGE);
                lSituação.setForeground(Color.red);
            }
            return;
        }
        else if(cbTecnicos.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(rootPane, "Nenhum Tecnico foi selecionado", "Erro!", ERROR_MESSAGE);
            lTecnico.setForeground(Color.red);
            if(cbSituação.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(rootPane, "Nenhum situação foi selecionada", "Erro!", ERROR_MESSAGE);
                lSituação.setForeground(Color.red);
            }
            return;
        }
        else if(cbSituação.getSelectedIndex() == -1){
                JOptionPane.showMessageDialog(rootPane, "Nenhum situação foi selecionada", "Erro!", ERROR_MESSAGE);
                lSituação.setForeground(Color.red);
                return;
        }
        Chamado c = new Chamado();
        Funcionario f = new Funcionario();
        f.getFromDB();
        f.setUsuario(cbTecnicos.getItemAt(cbTecnicos.getSelectedIndex()));
        f.getFromDB();
        c.setProtocolo((int) chamado.getTabela().getModel().getValueAt(chamado.getTabela().getSelectedRow(), 1));
        c.setMotivo(tMotivo.getText());
        c.setIdtecnicos(f.getIdFuncionario());
        c.setSituacao(cbSituação.getItemAt(cbSituação.getSelectedIndex()));
        if(c.updateOnDb()) {
            JOptionPane.showMessageDialog(rootPane, "Edição Feita com Sucesso","Sucesso!", INFORMATION_MESSAGE);
            chamado.getTabela().getModel().setValueAt(c.getMotivo(), chamado.getTabela().getSelectedRow(), 3);
            chamado.getTabela().getModel().setValueAt(f.getUsuario(), chamado.getTabela().getSelectedRow(), 4);
            chamado.getTabela().getModel().setValueAt(c.getSituacao(), chamado.getTabela().getSelectedRow(), 5);
            this.dispose();
        }
        else  JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tentar fazer Edição!", "Erro!", ERROR_MESSAGE);
    }//GEN-LAST:event_pConfirmarMouseClicked

    public JComboBox<String> getCbSituação() {
        return cbSituação;
    }

    public void setCbSituação(JComboBox<String> cbSituação) {
        this.cbSituação = cbSituação;
    }

    public ConsultarChamados getChamado() {
        return chamado;
    }

    public void setChamado(ConsultarChamados chamado) {
        this.chamado = chamado;
    }

    public JComboBox<String> getCbTecnicos() {
        return cbTecnicos;
    }

    public void setCbTecnicos(JComboBox<String> cbTecnicos) {
        this.cbTecnicos = cbTecnicos;
    }

    public JTextArea gettMotivo() {
        return tMotivo;
    }

    public void settMotivo(JTextArea tMotivo) {
        this.tMotivo = tMotivo;
    }

    private void pConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseEntered
        setColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseEntered

    private void pConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseExited
        resetColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseExited
    
    private void pCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_pCancelarMouseClicked

    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,153,153));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,102,102));
    }
    
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
            java.util.logging.Logger.getLogger(EditarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarChamado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarChamado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbSituação;
    private javax.swing.JComboBox<String> cbTecnicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lMotivo;
    private javax.swing.JLabel lSituação;
    private javax.swing.JLabel lTecnico;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pConfirmar;
    private javax.swing.JTextArea tMotivo;
    // End of variables declaration//GEN-END:variables
}
