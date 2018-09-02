package Interface;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.ERROR_MESSAGE;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import mastertv.Categoria;
import mastertv.Chamado;
import mastertv.Contrato;
import mastertv.Pagamento;
import mastertv.Plano;

public class ConsultarContratos extends javax.swing.JFrame {
    MenuCliente menu;
    public ConsultarContratos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tNumero = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        Pesquisar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        pDesfazer = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pVerChamados = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        pVerPagamentos = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pVerCategorias = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        pEditar = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        pMudarCategoria = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Consultar Contratos");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search (3).png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tv-Master");

        tNumero.setBackground(jPanel1.getBackground());
        tNumero.setForeground(new java.awt.Color(255, 255, 255));
        tNumero.setBorder(null);
        tNumero.setCaretColor(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pesquisar por número:");

        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/magnifier.png"))); // NOI18N
        Pesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PesquisarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addContainerGap(628, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addGap(18, 18, 18)
                                .addComponent(Pesquisar))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel1))
                .addGap(19, 19, 19))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Pesquisar)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 130));

        Tabela.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Número", "Receptores", "Endereço", "CPF", "Plano", "Preço", "Acesso"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tabela.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 130, 760, 300));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        pDesfazer.setBackground(new java.awt.Color(0, 102, 102));
        pDesfazer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pDesfazerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pDesfazerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pDesfazerMouseExited(evt);
            }
        });
        pDesfazer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Desfazer Contrato");
        pDesfazer.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Fechar");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pVerChamados.setBackground(new java.awt.Color(0, 102, 102));
        pVerChamados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pVerChamadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pVerChamadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pVerChamadosMouseExited(evt);
            }
        });
        pVerChamados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Ver Chamados");
        pVerChamados.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pVerPagamentos.setBackground(new java.awt.Color(0, 102, 102));
        pVerPagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pVerPagamentosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pVerPagamentosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pVerPagamentosMouseExited(evt);
            }
        });
        pVerPagamentos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ver Pagamentos");
        pVerPagamentos.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pVerCategorias.setBackground(new java.awt.Color(0, 102, 102));
        pVerCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pVerCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pVerCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pVerCategoriasMouseExited(evt);
            }
        });
        pVerCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Ver Categorias");
        pVerCategorias.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pEditar.setBackground(new java.awt.Color(0, 102, 102));
        pEditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pEditarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pEditarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pEditarMouseExited(evt);
            }
        });
        pEditar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Editar Contrato");
        pEditar.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        pMudarCategoria.setBackground(new java.awt.Color(0, 102, 102));
        pMudarCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pMudarCategoriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pMudarCategoriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pMudarCategoriaMouseExited(evt);
            }
        });
        pMudarCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Mudar Categorias");
        pMudarCategoria.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pVerCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pVerChamados, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pVerPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pDesfazer, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(pMudarCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(113, 113, 113)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pVerCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pVerPagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pMudarCategoria, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pVerChamados, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(pDesfazer, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 770, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pDesfazerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDesfazerMouseClicked
        int row = Tabela.getSelectedRow();
        if(row != -1){
            Contrato c = new Contrato();
            c.setNumeroContrato((String) Tabela.getModel().getValueAt(row, 0));
            if(c.delOnDb()) {
                JOptionPane.showMessageDialog(rootPane, "Contrato desfeito com Sucesso","Sucesso!", INFORMATION_MESSAGE);
                ((DefaultTableModel)Tabela.getModel()).removeRow(row);
            }
            else  JOptionPane.showMessageDialog(rootPane, "Ocorreu um erro ao tentar desfazer o contrato!", "Erro!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_pDesfazerMouseClicked

    private void pDesfazerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDesfazerMouseEntered
        setColor(pDesfazer);
    }//GEN-LAST:event_pDesfazerMouseEntered

    private void pDesfazerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pDesfazerMouseExited
        resetColor(pDesfazer);
    }//GEN-LAST:event_pDesfazerMouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void pVerChamadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerChamadosMouseClicked
        int row = Tabela.getSelectedRow();
        ConsultarChamados tela = new ConsultarChamados();
        if(row != -1){
            ArrayList<Chamado> array;
            array = Chamado.getAllFromDB(Integer.parseInt(Tabela.getModel().getValueAt(row, 0).toString()));
            tela.preencherTabela(array);
        }
        tela.setCon(this);
        tela.setVisible(true);
    }//GEN-LAST:event_pVerChamadosMouseClicked

    private void pVerChamadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerChamadosMouseEntered
        setColor(pVerChamados);
    }//GEN-LAST:event_pVerChamadosMouseEntered

    private void pVerChamadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerChamadosMouseExited
        resetColor(pVerChamados); 
    }//GEN-LAST:event_pVerChamadosMouseExited

    private void pVerPagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerPagamentosMouseClicked
        int row = Tabela.getSelectedRow();
        ConsultarPagamento tela = new ConsultarPagamento();
        if(row != -1){
            Contrato c = new Contrato();
            c.setNumeroContrato((String) Tabela.getModel().getValueAt(row, 0));
            ArrayList<Pagamento> array;
            array = Pagamento.getAllFromDB(Integer.parseInt(c.getNumeroContrato()));
            tela.preencherTabela(array);
        }
        tela.setCon(this);
        tela.setVisible(true);
    }//GEN-LAST:event_pVerPagamentosMouseClicked

    private void pVerPagamentosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerPagamentosMouseEntered
        setColor(pVerPagamentos);
    }//GEN-LAST:event_pVerPagamentosMouseEntered

    private void pVerPagamentosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerPagamentosMouseExited
        resetColor(pVerPagamentos);
    }//GEN-LAST:event_pVerPagamentosMouseExited

    private void pVerCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerCategoriasMouseClicked
        int row = Tabela.getSelectedRow();
        ConsultarCategoria tela = new ConsultarCategoria();
        if(row != -1){
            Contrato c = new Contrato();
            c.setNumeroContrato((String) Tabela.getModel().getValueAt(row, 0));
            c.getFromDB();
            c.getCatFromDB();
            ArrayList<Categoria> array;
            if(c.getPlano() == 1){
                array = new ArrayList<>();
                Categoria cat = new Categoria();
                cat.setId(c.getCategorias()[0]);
                cat.getFromDB();
                array.add(cat);
                cat = new Categoria();
                cat.setId(c.getCategorias()[1]);
                cat.getFromDB();
                array.add(cat); 
            }else if(c.getPlano() == 2){
                array = new ArrayList<>();
                Categoria cat = new Categoria();
                cat.setId(c.getCategorias()[0]);
                cat.getFromDB();
                array.add(cat);
                cat = new Categoria();
                cat.setId(c.getCategorias()[1]);
                cat.getFromDB();
                array.add(cat);
                cat = new Categoria();
                cat.setId(c.getCategorias()[2]);
                cat.getFromDB();
                array.add(cat);
            }else array = Categoria.getAllFromDB();
            tela.preencherTabela(array);
        }
        tela.setVisible(true);
    }//GEN-LAST:event_pVerCategoriasMouseClicked

    private void pVerCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerCategoriasMouseEntered
        setColor(pVerCategorias);
    }//GEN-LAST:event_pVerCategoriasMouseEntered

    private void pVerCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pVerCategoriasMouseExited
        resetColor(pVerCategorias);
    }//GEN-LAST:event_pVerCategoriasMouseExited

    public JTable getTabela() {
        return Tabela;
    }

    public void setTabela(JTable Tabela) {
        this.Tabela = Tabela;
    }

    private void pEditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEditarMouseClicked
        int row = Tabela.getSelectedRow();
        if(row != -1){
            EditarContrato tela = new EditarContrato();
            tela.gettEndereco().setText((String) Tabela.getModel().getValueAt(row, 2).toString());
            tela.getFtReceptores().setText((String) Tabela.getModel().getValueAt(row, 1).toString());
            tela.setContrato(this);
            tela.setVisible(true);
        }
    }//GEN-LAST:event_pEditarMouseClicked

    private void pEditarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEditarMouseEntered
        setColor(pEditar);
    }//GEN-LAST:event_pEditarMouseEntered

    private void pEditarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEditarMouseExited
        resetColor(pEditar);
    }//GEN-LAST:event_pEditarMouseExited

    private void PesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PesquisarMouseClicked
        while(Tabela.getRowCount()>0) ((DefaultTableModel)Tabela.getModel()).removeRow(0);
        preencherTabela(Contrato.getAllFromDB(menu.gettCpf().getText(), tNumero.getText()));
    }//GEN-LAST:event_PesquisarMouseClicked

    private void pMudarCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMudarCategoriaMouseClicked
        int row = Tabela.getSelectedRow();
        if(row != -1){
            Contrato c = new Contrato();
            c.setNumeroContrato((String) Tabela.getModel().getValueAt(row, 0));
            c.getFromDB();
            c.getCatFromDB();
            if(c.getPlano() == 1){
                EditarPlano tela = new EditarPlano();
                ArrayList<Categoria> array = new ArrayList<>();
                array = Categoria.getAllFromDB();
                for(Categoria c1:array){
                    tela.getCbCategoria1().addItem(c1.getNome());
                    tela.getCbCategoria2().addItem(c1.getNome());
                }
                tela.getCbCategoria3().setVisible(false);
                Categoria cat = new Categoria();
                cat.setId(c.getCategorias()[0]);
                cat.getFromDB();
                tela.getCbCategoria1().setSelectedItem(cat.getNome());
                cat = new Categoria();
                cat.setId(c.getCategorias()[1]);
                cat.getFromDB();
                tela.getCbCategoria2().setSelectedItem(cat.getNome());
                tela.setContrato(null);
                tela.setContrato2(this);
                tela.setVisible(true);
            }
            else if(c.getPlano() == 2){
                EditarPlano tela = new EditarPlano();
                ArrayList<Categoria> array = new ArrayList<>();
                array = Categoria.getAllFromDB();
                for(Categoria c1:array){
                    tela.getCbCategoria1().addItem(c1.getNome());
                    tela.getCbCategoria2().addItem(c1.getNome());
                    tela.getCbCategoria3().addItem(c1.getNome());
                }
                Categoria cat = new Categoria();
                cat.setId(c.getCategorias()[0]);
                cat.getFromDB();
                tela.getCbCategoria1().setSelectedItem(cat.getNome());
                cat = new Categoria();
                cat.setId(c.getCategorias()[1]);
                cat.getFromDB();
                tela.getCbCategoria2().setSelectedItem(cat.getNome());
                cat = new Categoria();
                cat.setId(c.getCategorias()[2]);
                cat.getFromDB();
                tela.getCbCategoria3().setSelectedItem(cat.getNome());
                tela.setContrato(null);
                tela.setContrato2(this);
                tela.setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "O plano é ilimitado já tem todas categorias", "Erro!", ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_pMudarCategoriaMouseClicked

    private void pMudarCategoriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMudarCategoriaMouseEntered
        setColor(pMudarCategoria);
    }//GEN-LAST:event_pMudarCategoriaMouseEntered

    private void pMudarCategoriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pMudarCategoriaMouseExited
        resetColor(pMudarCategoria);
    }//GEN-LAST:event_pMudarCategoriaMouseExited

    public void preencherTabela(ArrayList<Contrato> array){
        int i = 0;
        Object row[] = new Object[7];
        for(Contrato c : array){
            row[0] = c.getNumeroContrato();
            row[1] = c.getNumeroReceptores();
            row[2] = c.getEndereco();
            row[3] = c.getCpf();
            row[4] = Plano.getPlano(c.getPlano());
            row[5] = c.getMensalidade();
            row[6] = c.isAcesso();
            ((DefaultTableModel)Tabela.getModel()).insertRow(i, row);
            i++;
        }
    }

    public MenuCliente getMenu() {
        return menu;
    }

    public void setMenu(MenuCliente menu) {
        this.menu = menu;
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
            java.util.logging.Logger.getLogger(ConsultarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarContratos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarContratos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pesquisar;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pDesfazer;
    private javax.swing.JPanel pEditar;
    private javax.swing.JPanel pMudarCategoria;
    private javax.swing.JPanel pVerCategorias;
    private javax.swing.JPanel pVerChamados;
    private javax.swing.JPanel pVerPagamentos;
    private javax.swing.JTextField tNumero;
    // End of variables declaration//GEN-END:variables
}
