package Interface;

import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class CadFuncionario extends javax.swing.JFrame {

    public CadFuncionario() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
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
        jPanelCadastrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro");
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
        buttonGroup1.add(rbComum);
        rbComum.setForeground(new java.awt.Color(255, 255, 255));
        rbComum.setText("Comum");
        jPanel2.add(rbComum, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, -1, 20));

        rbAdministrador.setBackground(jPanel2.getBackground());
        buttonGroup1.add(rbAdministrador);
        rbAdministrador.setForeground(new java.awt.Color(255, 255, 255));
        rbAdministrador.setText("Administrador");
        jPanel2.add(rbAdministrador, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, 20));

        jPanelCadastrar.setBackground(new java.awt.Color(0, 102, 102));
        jPanelCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCadastrarMouseExited(evt);
            }
        });
        jPanelCadastrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cadastrar");
        jPanelCadastrar.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jPanel2.add(jPanelCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 210, 40));

        lCancelar.setBackground(new java.awt.Color(255, 255, 255));
        lCancelar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lCancelar.setForeground(new java.awt.Color(255, 153, 51));
        lCancelar.setText("Cancelar");
        lCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lCancelarMouseClicked(evt);
            }
        });
        jPanel2.add(lCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, -1, 20));
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
        cbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnico", "Atendente", "Chefe Atendente" }));
        jPanel2.add(cbCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Cargo");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, -1, 20));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 470, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseClicked
        lNome.setForeground(Color.white);
        lUsuario.setForeground(Color.white);
        lSenha.setForeground(Color.white);
        lCpf.setForeground(Color.white);
        lPermissao.setForeground(Color.white);
        ConfirmarCadFuncionario tela = new ConfirmarCadFuncionario();
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
        tela.setFuncionario(this);
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jPanelCadastrarMouseClicked

    private void jPanelCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseEntered
        setColor(jPanelCadastrar);
    }//GEN-LAST:event_jPanelCadastrarMouseEntered

    private void jPanelCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseExited
        resetColor(jPanelCadastrar);
    }//GEN-LAST:event_jPanelCadastrarMouseExited

    private void lCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_lCancelarMouseClicked

    public JComboBox<String> getCbCargo() {
        return cbCargo;
    }

    public void setCbCargo(JComboBox<String> cbCargo) {
        this.cbCargo = cbCargo;
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
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadFuncionario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbCargo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCadastrar;
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
    private javax.swing.JPasswordField pSenha;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbComum;
    private javax.swing.JFormattedTextField tCpf;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables
}
