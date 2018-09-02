package Interface;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import mastertv.Categoria;
import mastertv.PlanoIlimitado;

public class TelaContrato extends javax.swing.JFrame {
    MenuCliente menu;
    
    public TelaContrato() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lEndereco = new javax.swing.JLabel();
        lReceptores = new javax.swing.JLabel();
        lPlano = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        rbIlimitado = new javax.swing.JRadioButton();
        rbRegular = new javax.swing.JRadioButton();
        rbTop = new javax.swing.JRadioButton();
        ftReceptores = new javax.swing.JFormattedTextField();
        pFConfirmar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        pCancelar = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tEndereco = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tv-Master");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 19, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/contract.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 130, 10));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 170, 10));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 150, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 480));

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contrato");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        lEndereco.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lEndereco.setForeground(new java.awt.Color(255, 255, 255));
        lEndereco.setText("Endereço");
        jPanel2.add(lEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        lReceptores.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lReceptores.setForeground(new java.awt.Color(255, 255, 255));
        lReceptores.setText("Número de receptores");
        jPanel2.add(lReceptores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        lPlano.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lPlano.setForeground(new java.awt.Color(255, 255, 255));
        lPlano.setText("Plano");
        jPanel2.add(lPlano, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 70, 10));

        rbIlimitado.setBackground(jPanel2.getBackground());
        buttonGroup1.add(rbIlimitado);
        rbIlimitado.setForeground(new java.awt.Color(255, 255, 255));
        rbIlimitado.setText("Ilimitado");
        jPanel2.add(rbIlimitado, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        rbRegular.setBackground(jPanel2.getBackground());
        buttonGroup1.add(rbRegular);
        rbRegular.setForeground(new java.awt.Color(255, 255, 255));
        rbRegular.setText("Regular");
        jPanel2.add(rbRegular, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, -1, -1));

        rbTop.setBackground(jPanel2.getBackground());
        buttonGroup1.add(rbTop);
        rbTop.setForeground(new java.awt.Color(255, 255, 255));
        rbTop.setText("Top");
        jPanel2.add(rbTop, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        ftReceptores.setBackground(jPanel2.getBackground());
        ftReceptores.setBorder(null);
        ftReceptores.setForeground(new java.awt.Color(255, 255, 255));
        ftReceptores.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        ftReceptores.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(ftReceptores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 70, 20));

        pFConfirmar.setBackground(new java.awt.Color(0, 102, 102));
        pFConfirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pFConfirmarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pFConfirmarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pFConfirmarMouseExited(evt);
            }
        });
        pFConfirmar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Confirmar");
        pFConfirmar.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jPanel2.add(pFConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 150, 40));

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
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        pCancelar.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jPanel2.add(pCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, 70, 40));

        tEndereco.setBackground(jPanel2.getBackground());
        tEndereco.setColumns(20);
        tEndereco.setForeground(new java.awt.Color(255, 255, 255));
        tEndereco.setLineWrap(true);
        tEndereco.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tEndereco);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 370, 70));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 460, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pFConfirmarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFConfirmarMouseEntered
        setColor(pFConfirmar);
    }//GEN-LAST:event_pFConfirmarMouseEntered

    private void pFConfirmarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFConfirmarMouseExited
        resetColor(pFConfirmar);
    }//GEN-LAST:event_pFConfirmarMouseExited

    private void pCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_pCancelarMouseClicked

    private void pFConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pFConfirmarMouseClicked
        lEndereco.setForeground(Color.white);
        lReceptores.setForeground(Color.white);
        lPlano.setForeground(Color.red);
        EscolherCategorias tela = new EscolherCategorias();
        if(tEndereco.getText().isEmpty() || tEndereco.getText().length()>80){
            JOptionPane.showMessageDialog(rootPane, "Endereço não preenchido ou muito grande", "Erro!", ERROR_MESSAGE);
            lEndereco.setForeground(Color.red);
            if(ftReceptores.getText().isEmpty()){
                JOptionPane.showMessageDialog(rootPane, "Número de recptores não preenchido", "Erro!", ERROR_MESSAGE);
                lReceptores.setForeground(Color.red);
            }
            if(!(rbRegular.isSelected() || rbIlimitado.isSelected() || rbIlimitado.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Plano não escolhido", "Erro!", ERROR_MESSAGE);
                lPlano.setForeground(Color.red);
            }
            return;
        }
        else if(ftReceptores.getText().isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Número de recptores não preenchido", "Erro!", ERROR_MESSAGE);
            lReceptores.setForeground(Color.red);
            if(!(rbRegular.isSelected() || rbIlimitado.isSelected() || rbIlimitado.isSelected())){
                JOptionPane.showMessageDialog(rootPane, "Plano não escolhido", "Erro!", ERROR_MESSAGE);
                lPlano.setForeground(Color.red);
            }
            return;
        }
        else if(!(rbRegular.isSelected() || rbTop.isSelected() || rbIlimitado.isSelected())){
            JOptionPane.showMessageDialog(rootPane, "Plano não escolhido", "Erro!", ERROR_MESSAGE);
            lPlano.setForeground(Color.red);
            return;
        }
        
        if(rbTop.isSelected()){
            tela.getCbCategoria3().setVisible(false);
            ArrayList<Categoria> array = Categoria.getAllFromDB();
            for(Categoria c: array){
                tela.getCbCategoria1().addItem(c.getNome());
                tela.getCbCategoria2().addItem(c.getNome());
            }
            tela.getCbCategoria1().setSelectedIndex(0);
            tela.getCbCategoria2().setSelectedIndex(0);
        }
        else if(rbRegular.isSelected()){
            ArrayList<Categoria> array = Categoria.getAllFromDB();
            for(Categoria c: array){
                tela.getCbCategoria1().addItem(c.getNome());
                tela.getCbCategoria2().addItem(c.getNome());
                tela.getCbCategoria3().addItem(c.getNome());
            }
            tela.getCbCategoria1().setSelectedIndex(0);
            tela.getCbCategoria2().setSelectedIndex(0);
            tela.getCbCategoria2().setSelectedIndex(0);
        }
        else if(rbIlimitado.isSelected()){
            tela.getCbCategoria1().setVisible(false);
            tela.getCbCategoria2().setVisible(false);
            tela.getCbCategoria3().setVisible(false);
            tela.getFtPreco().setText(Float.toString(PlanoIlimitado.calcularMensalidade()));
        }
        tela.setContrato(this);
        tela.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_pFConfirmarMouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    public JFormattedTextField getFtReceptores() {
        return ftReceptores;
    }

    public void setFtReceptores(JFormattedTextField ftReceptores) {
        this.ftReceptores = ftReceptores;
    }

    public JTextArea gettEndereco() {
        return tEndereco;
    }

    public void settEndereco(JTextArea tEndereco) {
        this.tEndereco = tEndereco;
    }

    public JRadioButton getRbIlimitado() {
        return rbIlimitado;
    }

    public void setRbIlimitado(JRadioButton rbIlimitado) {
        this.rbIlimitado = rbIlimitado;
    }

    public JRadioButton getRbRegular() {
        return rbRegular;
    }

    public void setRbRegular(JRadioButton rbRegular) {
        this.rbRegular = rbRegular;
    }

    public JRadioButton getRbTop() {
        return rbTop;
    }

    public void setRbTop(JRadioButton rbTop) {
        this.rbTop = rbTop;
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
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaContrato.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaContrato().setVisible(true);
            }
        });
    }

    public MenuCliente getMenu() {
        return menu;
    }

    public void setMenu(MenuCliente menu) {
        this.menu = menu;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftReceptores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lPlano;
    private javax.swing.JLabel lReceptores;
    private javax.swing.JPanel pCancelar;
    private javax.swing.JPanel pFConfirmar;
    private javax.swing.JRadioButton rbIlimitado;
    private javax.swing.JRadioButton rbRegular;
    private javax.swing.JRadioButton rbTop;
    private javax.swing.JTextArea tEndereco;
    // End of variables declaration//GEN-END:variables
}
