/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTextField;
import mastertv.Cliente;

/**
 *
 * @author Luís
 */
public class AlterarDadosCliente extends javax.swing.JFrame {

    MenuCliente cliente;
    public AlterarDadosCliente() {
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

        jPanel2 = new javax.swing.JPanel();
        lNome = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        tEmail = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tCpf = new javax.swing.JFormattedTextField();
        tTelefone = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanelConfirmar = new javax.swing.JPanel();
        label = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabelCancelar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lNome.setForeground(new java.awt.Color(255, 255, 255));
        lNome.setText("Nome");
        jPanel2.add(lNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        lCpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lCpf.setForeground(new java.awt.Color(255, 255, 255));
        lCpf.setText("CPF");
        jPanel2.add(lCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        lTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lTelefone.setText("Telefone");
        jPanel2.add(lTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        lEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("Email");
        jPanel2.add(lEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 400, 10));
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 400, 10));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 400, 10));
        jPanel2.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 400, 10));

        tEmail.setBackground(new java.awt.Color(0, 51, 51));
        tEmail.setForeground(new java.awt.Color(255, 255, 255));
        tEmail.setBorder(null);
        tEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 400, 20));

        tNome.setBackground(new java.awt.Color(0, 51, 51));
        tNome.setForeground(new java.awt.Color(255, 255, 255));
        tNome.setBorder(null);
        tNome.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 400, 20));

        tCpf.setBackground(jPanel2.getBackground());
        tCpf.setBorder(null);
        tCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel2.add(tCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 400, 20));

        tTelefone.setBackground(jPanel2.getBackground());
        tTelefone.setBorder(null);
        tTelefone.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tTelefone.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 400, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 690, 350));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Dados do Cliente");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tv-Master");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(507, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 130));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelConfirmar.setBackground(new java.awt.Color(0, 51, 51));
        jPanelConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelConfirmarMouseExited(evt);
            }
        });
        jPanelConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        label.setForeground(new java.awt.Color(255, 255, 255));
        label.setText("Confirmar");
        jPanelConfirmar.add(label, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel9.add(jPanelConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 24, 140, 40));

        jPanel11.setBackground(new java.awt.Color(0, 102, 102));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabelCancelar.setForeground(new java.awt.Color(255, 153, 0));
        jLabelCancelar.setText("Cancelar");
        jPanel11.add(jLabelCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(179, 24, -1, 40));

        getContentPane().add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 480, 690, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JFormattedTextField gettCpf() {
        return tCpf;
    }

    public JTextField gettEmail() {
        return tEmail;
    }

    public JTextField gettNome() {
        return tNome;
    }

    public JFormattedTextField gettTelefone() {
        return tTelefone;
    }

    private void jPanelConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConfirmarMouseClicked
        lNome.setForeground(Color.white);
        lEmail.setForeground(Color.white);
        lCpf.setForeground(Color.white);
        lTelefone.setForeground(Color.white);
        Cliente c = new Cliente();
        c.setNome(this.gettNome().getText());
        c.setCpf(this.gettCpf().getText().replace(" ", ""));
        c.setTelefone(this.gettTelefone().getText().replace("(  )         ", ""));
        c.setEmail(this.gettEmail().getText());
        if(c.getNome().isEmpty() || c.getNome().length()>50){
            JOptionPane.showMessageDialog(rootPane, "O nome não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
            lNome.setForeground(Color.red);
            if(c.getEmail().isEmpty() || c.getEmail().length()>80){
                JOptionPane.showMessageDialog(rootPane, "O Email não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
                lEmail.setForeground(Color.red);
            }
            if(c.getCpf().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "O Cpf não está preenchido!", "Erro!", ERROR_MESSAGE);
                lCpf.setForeground(Color.red);
            }
            if(c.getTelefone().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "O Telefone não está preenchido!", "Erro!", ERROR_MESSAGE);
                lTelefone.setForeground(Color.red);
            }
            return;
        }
        else if(c.getEmail().isEmpty() || c.getEmail().length()>80){
            JOptionPane.showMessageDialog(rootPane, "O Email não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
            lEmail.setForeground(Color.red);
            if(c.getCpf().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "O Cpf não está preenchido!", "Erro!", ERROR_MESSAGE);
                lCpf.setForeground(Color.red);
            }
            if(c.getTelefone().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "O Telefone não está preenchido!", "Erro!", ERROR_MESSAGE);
                lTelefone.setForeground(Color.red);
            }
            return;
        }
        else if(c.getCpf().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "O Cpf não está preenchido!", "Erro!", ERROR_MESSAGE);
            lCpf.setForeground(Color.red);
            if(c.getTelefone().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "O Telefone não está preenchido!", "Erro!", ERROR_MESSAGE);
                lTelefone.setForeground(Color.red);
            }
            return;
        }
        else if(c.getTelefone().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "O Telefone não está preenchido!", "Erro!", ERROR_MESSAGE);
            lTelefone.setForeground(Color.red);
            return;
        }
        if(c.updateOnDb(cliente.gettCpf().getText())) {
            JOptionPane.showMessageDialog(rootPane, "Alteração Feita Sucesso","Sucesso!", INFORMATION_MESSAGE);
            cliente.gettNome().setText(c.getNome());
            cliente.gettCpf().setText(c.getCpf());
            cliente.gettEmail().setText(c.getEmail());
            cliente.gettTelefone().setText(c.getTelefone());
        }
        else JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tentar alterar!", "Erro!", ERROR_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jPanelConfirmarMouseClicked

    private void jPanelConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConfirmarMouseEntered
        setColor(jPanelConfirmar);
    }//GEN-LAST:event_jPanelConfirmarMouseEntered

    private void jPanelConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelConfirmarMouseExited
        resetColor(jPanelConfirmar);
    }//GEN-LAST:event_jPanelConfirmarMouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel11MouseClicked

    public MenuCliente getCliente() {
        return cliente;
    }

    public void setCliente(MenuCliente cliente) {
        this.cliente = cliente;
    }

    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,153,153));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,51,51));
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
            java.util.logging.Logger.getLogger(AlterarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AlterarDadosCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AlterarDadosCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanelConfirmar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JLabel label;
    private javax.swing.JFormattedTextField tCpf;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tNome;
    private javax.swing.JFormattedTextField tTelefone;
    // End of variables declaration//GEN-END:variables
}
