package Interface;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import mastertv.Cliente;

public class CadCliente extends javax.swing.JFrame {

    public CadCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lNome = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lCpf = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        TF1 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        jPanelCadastrar = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TF3 = new javax.swing.JFormattedTextField();
        TF4 = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/monitor.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tv-Master");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 490));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Cadastro");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, -1));

        lNome.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lNome.setForeground(new java.awt.Color(255, 255, 255));
        lNome.setText("Nome");
        jPanel1.add(lNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, -1, -1));

        lEmail.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lEmail.setForeground(new java.awt.Color(255, 255, 255));
        lEmail.setText("E-Mail");
        jPanel1.add(lEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        lCpf.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lCpf.setForeground(new java.awt.Color(255, 255, 255));
        lCpf.setText("CPF");
        jPanel1.add(lCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, 310, 18));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 310, 18));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 220, 310, 20));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 310, 18));

        TF1.setBackground(new java.awt.Color(0, 51, 51));
        TF1.setForeground(new java.awt.Color(255, 255, 255));
        TF1.setBorder(null);
        TF1.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 310, 20));

        TF2.setBackground(new java.awt.Color(0, 51, 51));
        TF2.setForeground(new java.awt.Color(255, 255, 255));
        TF2.setBorder(null);
        TF2.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 310, 20));

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

        jPanel1.add(jPanelCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, 210, 40));

        lTelefone.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lTelefone.setForeground(new java.awt.Color(255, 255, 255));
        lTelefone.setText("Telefone");
        jPanel1.add(lTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 51));
        jLabel11.setText("Cancelar");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 70, 40));

        TF3.setBackground(jPanel5.getBackground());
        TF3.setBorder(null);
        TF3.setForeground(new java.awt.Color(255, 255, 255));
        try {
            TF3.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TF3.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 310, 20));

        TF4.setBackground(jPanel5.getBackground());
        TF4.setBorder(null);
        TF4.setForeground(new java.awt.Color(255, 255, 255));
        try {
            TF4.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        TF4.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel1.add(TF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 310, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 489, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseClicked
        lNome.setForeground(Color.white);
        lEmail.setForeground(Color.white);
        lCpf.setForeground(Color.white);
        lTelefone.setForeground(Color.white);
        Cliente c = new Cliente(TF1.getText(), TF3.getText().replace(" ", ""), TF4.getText().replace("(  )         ", ""), TF2.getText());
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
        if(c.addOnDB()) JOptionPane.showMessageDialog(rootPane, "Cadastrado com Sucesso","Sucesso!", INFORMATION_MESSAGE);
        else JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro no cadastro!", "Erro!", ERROR_MESSAGE);
        this.dispose();
    }//GEN-LAST:event_jPanelCadastrarMouseClicked

    private void jPanelCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseEntered
       setColor(jPanelCadastrar);
    }//GEN-LAST:event_jPanelCadastrarMouseEntered

    private void jPanelCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCadastrarMouseExited
       resetColor(jPanelCadastrar);
    }//GEN-LAST:event_jPanelCadastrarMouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

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
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JFormattedTextField TF3;
    private javax.swing.JFormattedTextField TF4;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelCadastrar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lCpf;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lTelefone;
    // End of variables declaration//GEN-END:variables
}
