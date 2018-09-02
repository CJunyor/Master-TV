package Interface;

import java.awt.Color;
import java.util.Arrays;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import mastertv.Funcionario;

public class EditarFuncionario extends javax.swing.JFrame {

    ConsultarFuncionarios funcionario;
    public EditarFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        lCpf = new javax.swing.JLabel();
        lPermissao = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        rbComum = new javax.swing.JRadioButton();
        rbAdministrador = new javax.swing.JRadioButton();
        pConfirmar = new javax.swing.JPanel();
        lconfirmar = new javax.swing.JLabel();
        lCancelar = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        pSenha = new javax.swing.JPasswordField();
        lSenha = new javax.swing.JLabel();
        lUsuario = new javax.swing.JLabel();
        tUsuario = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        tCpf = new javax.swing.JFormattedTextField();
        cbCargo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Editar Funcionario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lNome.setForeground(new java.awt.Color(255, 255, 255));
        lNome.setText("Nome");
        jPanel2.add(lNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        tNome.setBackground(new java.awt.Color(0, 51, 51));
        tNome.setForeground(new java.awt.Color(255, 255, 255));
        tNome.setBorder(null);
        tNome.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 310, 20));
        jPanel2.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 18));

        lCpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lCpf.setForeground(new java.awt.Color(255, 255, 255));
        lCpf.setText("CPF");
        jPanel2.add(lCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, 20));

        lPermissao.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lPermissao.setForeground(new java.awt.Color(255, 255, 255));
        lPermissao.setText("Permissão");
        jPanel2.add(lPermissao, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, 20));
        jPanel2.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 310, 10));

        rbComum.setBackground(jPanel2.getBackground());
        rbComum.setForeground(new java.awt.Color(255, 255, 255));
        rbComum.setText("Comum");
        jPanel2.add(rbComum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 20));

        rbAdministrador.setBackground(jPanel2.getBackground());
        rbAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setText("Administrador");
        jPanel2.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

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

        lconfirmar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lconfirmar.setForeground(new java.awt.Color(255, 255, 255));
        lconfirmar.setText("Confirmar");
        pConfirmar.add(lconfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jPanel2.add(pConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 120, 40));

        lCancelar.setBackground(new java.awt.Color(255, 255, 255));
        lCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lCancelar.setForeground(new java.awt.Color(255, 153, 51));
        lCancelar.setText("Cancelar");
        lCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(lCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 500, -1, 20));
        jPanel2.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 310, 10));

        pSenha.setBackground(jPanel2.getBackground());
        pSenha.setForeground(new java.awt.Color(255, 255, 255));
        pSenha.setBorder(null);
        pSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(pSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 310, 20));

        lSenha.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lSenha.setForeground(new java.awt.Color(255, 255, 255));
        lSenha.setText("Senha");
        jPanel2.add(lSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 50, 20));

        lUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lUsuario.setText("Usuario");
        jPanel2.add(lUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        tUsuario.setBackground(new java.awt.Color(0, 51, 51));
        tUsuario.setForeground(new java.awt.Color(255, 255, 255));
        tUsuario.setBorder(null);
        tUsuario.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 310, 20));
        jPanel2.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 310, 18));

        tCpf.setBackground(jPanel2.getBackground());
        tCpf.setBorder(null);
        tCpf.setForeground(new java.awt.Color(255, 255, 255));
        try {
            tCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tCpf.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(tCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 310, 20));

        cbCargo.setBackground(jPanel2.getBackground());
        cbCargo.setForeground(new java.awt.Color(255, 255, 255));
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Atendente" }));
        jPanel2.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cargo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 470, 560));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tv-Master");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/adding-users.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 130, 10));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 170, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseClicked
        lNome.setForeground(Color.white);
        lUsuario.setForeground(Color.white);
        lSenha.setForeground(Color.white);
        lCpf.setForeground(Color.white);
        lPermissao.setForeground(Color.white);
        if(tNome.getText().isEmpty() || tNome.getText().length()>50){
            JOptionPane.showMessageDialog(rootPane, "Nome não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
            lNome.setForeground(Color.red);
            if(tUsuario.getText().isEmpty() || tUsuario.getText().length()>50){
                JOptionPane.showMessageDialog(rootPane, "Usuario não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
                lUsuario.setForeground(Color.red);
            }
            if(pSenha.getPassword().length <= 0){
                JOptionPane.showMessageDialog(rootPane, "Senha não está preenchido!", "Erro!", ERROR_MESSAGE);
                lSenha.setForeground(Color.red);
            }
            if(tCpf.getText().replace(" ", "").isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "CPF não está preenchido!", "Erro!", ERROR_MESSAGE);
                lCpf.setForeground(Color.red);
            }
            if(!(rbAdministrador.isSelected() || rbComum.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Permissão não foi selecionada!", "Erro!", ERROR_MESSAGE);
                lPermissao.setForeground(Color.red);
            }
            return;
        }
        else if(tUsuario.getText().isEmpty() || tUsuario.getText().length()>50){
            JOptionPane.showMessageDialog(rootPane, "Usuario não está preenchido ou é grande demais!", "Erro!", ERROR_MESSAGE);
            lUsuario.setForeground(Color.red);
            if(pSenha.getPassword().length == 0){
                JOptionPane.showMessageDialog(rootPane, "Senha não está preenchido!", "Erro!", ERROR_MESSAGE);
                lSenha.setForeground(Color.red);
            }
            if(tCpf.getText().replace(" ", "").isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "CPF não está preenchido!", "Erro!", ERROR_MESSAGE);
                lCpf.setForeground(Color.red);
            }
            if(!(rbAdministrador.isSelected() || rbComum.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Permissão não foi selecionada!", "Erro!", ERROR_MESSAGE);
                lPermissao.setForeground(Color.red);
            }
            return;
        }
        else if(pSenha.getPassword().length <= 0){
            JOptionPane.showMessageDialog(rootPane, "Senha não está preenchido!", "Erro!", ERROR_MESSAGE);
            lSenha.setForeground(Color.red);
            if(tCpf.getText().replace(" ", "").isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "CPF não está preenchido!", "Erro!", ERROR_MESSAGE);
                lCpf.setForeground(Color.red);
            }
            if(!(rbAdministrador.isSelected() || rbComum.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Permissão não foi selecionada!", "Erro!", ERROR_MESSAGE);
                lPermissao.setForeground(Color.red);
            }
            return;
        }
        else if(tCpf.getText().replace(" ", "").isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "CPF não está preenchido!", "Erro!", ERROR_MESSAGE);
            lCpf.setForeground(Color.red);
            if(!(rbAdministrador.isSelected() || rbComum.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Permissão não foi selecionada!", "Erro!", ERROR_MESSAGE);
                lPermissao.setForeground(Color.red);
            }
            return;
        }
        else if(!(rbAdministrador.isSelected() || rbComum.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "Permissão não foi selecionada!", "Erro!", ERROR_MESSAGE);
            lPermissao.setForeground(Color.red);
            return;
        }
        Funcionario f = new Funcionario();
        f.setNome(tNome.getText());
        f.setCpf(tCpf.getText());
        f.setUsuario(tUsuario.getText());
        f.setCargo((String) cbCargo.getSelectedItem());
        f.setSenha(Arrays.toString(pSenha.getPassword()));
        if(rbAdministrador.isSelected()) f.setPermissao(1);
        else f.setPermissao(2);
        if(f.updateOnDb((String) funcionario.getTabela().getModel().getValueAt(funcionario.getTabela().getSelectedRow(), 1))) {
            JOptionPane.showMessageDialog(rootPane, "Editado com Sucesso","Sucesso!", INFORMATION_MESSAGE);
            funcionario.getTabela().getModel().setValueAt(f.getNome(), funcionario.getTabela().getSelectedRow(), 0);
            funcionario.getTabela().getModel().setValueAt(f.getCpf(), funcionario.getTabela().getSelectedRow(), 1);
            funcionario.getTabela().getModel().setValueAt(f.getCargo(), funcionario.getTabela().getSelectedRow(), 2);
            String ax;
            if(f.getPermissao() == 1) ax = "Administrador";
            else ax = "Comum";
            funcionario.getTabela().getModel().setValueAt(ax, funcionario.getTabela().getSelectedRow(), 3);
            funcionario.getTabela().getModel().setValueAt(f.getUsuario(), funcionario.getTabela().getSelectedRow(), 4);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tentar Editar!", "Erro!", ERROR_MESSAGE);
            this.dispose();
        }
    }//GEN-LAST:event_pConfirmarMouseClicked

    private void pConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseEntered
        setColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseEntered

    private void pConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConfirmarMouseExited
        resetColor(pConfirmar);
    }//GEN-LAST:event_pConfirmarMouseExited

    private void lCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lCancelarMouseClicked

    public ConsultarFuncionarios getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(ConsultarFuncionarios funcionario) {
        this.funcionario = funcionario;
    }

    public JPasswordField getpSenha() {
        return pSenha;
    }

    public void setpSenha(JPasswordField pSenha) {
        this.pSenha = pSenha;
    }

    public JRadioButton getRbAdministrador() {
        return rbAdministrador;
    }

    public void setRbAdministrador(JRadioButton rbAdministrador) {
        this.rbAdministrador = rbAdministrador;
    }

    public JRadioButton getRbComum() {
        return rbComum;
    }

    public void setRbComum(JRadioButton rbComum) {
        this.rbComum = rbComum;
    }

    public JFormattedTextField gettCpf() {
        return tCpf;
    }

    public void settCpf(JFormattedTextField tCpf) {
        this.tCpf = tCpf;
    }

    public JTextField gettNome() {
        return tNome;
    }

    public void settNome(JTextField tNome) {
        this.tNome = tNome;
    }

    public JTextField gettUsuario() {
        return tUsuario;
    }

    public void settUsuario(JTextField tUsuario) {
        this.tUsuario = tUsuario;
    }

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
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JLabel lCancelar;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lPermissao;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JLabel lconfirmar;
    private javax.swing.JPanel pConfirmar;
    private javax.swing.JPasswordField pSenha;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.JFormattedTextField tCpf;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
