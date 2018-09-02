package Interface;

import Dados.ContratoDAO;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.INFORMATION_MESSAGE;
import javax.swing.JPanel;
import mastertv.Canal;
import mastertv.Categoria;
import mastertv.Cliente;
import mastertv.Contrato;
import mastertv.Funcionario;
import mastertv.Pagamento;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pConsuCategorias = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pCadCliente = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        pCadCanal = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pConsuCliente = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        pConsuCanais = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        pCadCategorias = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        lVoltar = new javax.swing.JLabel();
        EmitirPagamentos = new javax.swing.JLabel();
        CortarAcesso = new javax.swing.JLabel();
        ConsultarFuncionarios = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Menu");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/list.png"))); // NOI18N

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 130));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pConsuCategorias.setBackground(new java.awt.Color(0, 153, 153));
        pConsuCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConsuCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConsuCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConsuCategoriasMouseExited(evt);
            }
        });
        pConsuCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/research.png"))); // NOI18N
        pConsuCategorias.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Consultar Categorias");
        pConsuCategorias.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        pCadCliente.setBackground(new java.awt.Color(0, 153, 153));
        pCadCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCadClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCadClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCadClienteMouseExited(evt);
            }
        });
        pCadCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/add-contact.png"))); // NOI18N
        pCadCliente.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 60, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cadastrar Cliente");
        pCadCliente.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pCadCanal.setBackground(new java.awt.Color(0, 153, 153));
        pCadCanal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCadCanalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCadCanalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCadCanalMouseExited(evt);
            }
        });
        pCadCanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/computer.png"))); // NOI18N
        pCadCanal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cadastrar Canal");
        pCadCanal.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pConsuCliente.setBackground(new java.awt.Color(0, 153, 153));
        pConsuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConsuClienteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConsuClienteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConsuClienteMouseExited(evt);
            }
        });
        pConsuCliente.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/search.png"))); // NOI18N
        pConsuCliente.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 70, 70));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Consultar Clientes");
        pConsuCliente.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        pConsuCanais.setBackground(new java.awt.Color(0, 153, 153));
        pConsuCanais.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pConsuCanaisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pConsuCanaisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pConsuCanaisMouseExited(evt);
            }
        });
        pConsuCanais.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Consultar Canais");
        pConsuCanais.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/monitor (2).png"))); // NOI18N
        pConsuCanais.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        pCadCategorias.setBackground(new java.awt.Color(0, 153, 153));
        pCadCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pCadCategoriasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pCadCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pCadCategoriasMouseExited(evt);
            }
        });
        pCadCategorias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Cadastrar Categorias");
        pCadCategorias.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/category-add-button.png"))); // NOI18N
        pCadCategorias.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 70));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCadCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConsuCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pCadCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConsuCanais, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCadCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConsuCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pCadCanal, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCadCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pCadCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pConsuCanais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConsuCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pConsuCategorias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 730, 380));

        jPanel3.setBackground(new java.awt.Color(0, 51, 51));

        jPanel5.setBackground(new java.awt.Color(0, 51, 51));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lVoltar.setBackground(new java.awt.Color(255, 255, 255));
        lVoltar.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        lVoltar.setForeground(new java.awt.Color(255, 153, 51));
        lVoltar.setText("Voltar");
        lVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lVoltarMouseClicked(evt);
            }
        });
        jPanel5.add(lVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        EmitirPagamentos.setBackground(new java.awt.Color(255, 255, 255));
        EmitirPagamentos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        EmitirPagamentos.setForeground(new java.awt.Color(255, 153, 51));
        EmitirPagamentos.setText("Emitir Pagamentos");
        EmitirPagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EmitirPagamentosMouseClicked(evt);
            }
        });

        CortarAcesso.setBackground(new java.awt.Color(255, 255, 255));
        CortarAcesso.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        CortarAcesso.setForeground(new java.awt.Color(255, 153, 51));
        CortarAcesso.setText("Fazer verificação e cortar ou liberar acesso");
        CortarAcesso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CortarAcessoMouseClicked(evt);
            }
        });

        ConsultarFuncionarios.setBackground(new java.awt.Color(255, 255, 255));
        ConsultarFuncionarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        ConsultarFuncionarios.setForeground(new java.awt.Color(255, 153, 51));
        ConsultarFuncionarios.setText("Consultar Funcionários");
        ConsultarFuncionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultarFuncionariosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(EmitirPagamentos)
                        .addGap(22, 22, 22)
                        .addComponent(ConsultarFuncionarios))
                    .addComponent(CortarAcesso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 302, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(EmitirPagamentos)
                        .addComponent(ConsultarFuncionarios))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CortarAcesso)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 730, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pCadClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadClienteMouseEntered
        setColor(pCadCliente);
    }//GEN-LAST:event_pCadClienteMouseEntered

    private void pCadClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadClienteMouseExited
        resetColor(pCadCliente);
    }//GEN-LAST:event_pCadClienteMouseExited

    private void pCadCanalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCanalMouseEntered
        setColor(pCadCanal);
    }//GEN-LAST:event_pCadCanalMouseEntered

    private void pCadCanalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCanalMouseExited
       resetColor(pCadCanal);
    }//GEN-LAST:event_pCadCanalMouseExited

    private void pCadClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadClienteMouseClicked
        new CadCliente().setVisible(true);
    }//GEN-LAST:event_pCadClienteMouseClicked

    private void pCadCanalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCanalMouseClicked
        CadCanal Tela = new CadCanal();
        ArrayList<Categoria> a = Categoria.getAllFromDB();
        for(Categoria c: a){
            Tela.getCbCategoria().addItem(c.getNome());
        }
        Tela.getCbCategoria().setSelectedIndex(0);
        Tela.setVisible(true);
    }//GEN-LAST:event_pCadCanalMouseClicked

    private void pConsuCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCategoriasMouseExited
        resetColor(pConsuCategorias);
    }//GEN-LAST:event_pConsuCategoriasMouseExited

    private void pConsuCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCategoriasMouseEntered
        setColor(pConsuCategorias);
    }//GEN-LAST:event_pConsuCategoriasMouseEntered

    private void pConsuCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCategoriasMouseClicked
        ConsultarCategoria Tela = new ConsultarCategoria();
        Tela.preencherTabela(Categoria.getAllFromDB());
        Tela.setVisible(true);
    }//GEN-LAST:event_pConsuCategoriasMouseClicked

    private void pConsuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuClienteMouseClicked
        ConsultarClientes Tela = new ConsultarClientes();
        Tela.preencherTabela(Cliente.getAllFromDB()); 
        Tela.setVisible(true);
    }//GEN-LAST:event_pConsuClienteMouseClicked

    private void pConsuClienteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuClienteMouseEntered
        setColor(pConsuCliente);
    }//GEN-LAST:event_pConsuClienteMouseEntered

    private void pConsuClienteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuClienteMouseExited
        resetColor(pConsuCliente);
    }//GEN-LAST:event_pConsuClienteMouseExited

    private void pConsuCanaisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCanaisMouseClicked
        ConsultarCanais Tela = new ConsultarCanais();
        Tela.preencherTabela(Canal.getAllFromDB());
        Tela.setVisible(true);
    }//GEN-LAST:event_pConsuCanaisMouseClicked

    private void pConsuCanaisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCanaisMouseEntered
        setColor(pConsuCanais);
    }//GEN-LAST:event_pConsuCanaisMouseEntered

    private void pConsuCanaisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pConsuCanaisMouseExited
        resetColor(pConsuCanais);
    }//GEN-LAST:event_pConsuCanaisMouseExited

    private void pCadCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCategoriasMouseClicked
       new CadCategoria().setVisible(true);
    }//GEN-LAST:event_pCadCategoriasMouseClicked

    private void pCadCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCategoriasMouseEntered
        setColor(pCadCategorias);
    }//GEN-LAST:event_pCadCategoriasMouseEntered

    private void pCadCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pCadCategoriasMouseExited
       resetColor(pCadCategorias);
    }//GEN-LAST:event_pCadCategoriasMouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
        this.dispose();
    }//GEN-LAST:event_jPanel5MouseClicked

    private void lVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lVoltarMouseClicked
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lVoltarMouseClicked

    private void CortarAcessoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CortarAcessoMouseClicked
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();
        ArrayList<Pagamento> pagamentos = new ArrayList<>();
        clientes = Cliente.getAllFromDB();
        for(Cliente c: clientes){
            contratos = Contrato.getAllFromDB(c.getCpf());
            for(Contrato con: contratos){
                int count = 0;
                pagamentos = Pagamento.getAllFromDB(Integer.parseInt(con.getNumeroContrato()));
                for(Pagamento p: pagamentos){
                    if(!p.isPago()) count++;
                    if(count>=2){
                        con.setAcesso(false);
                        con.updateOnDb(p.getNumeroContrato());
                        break;
                    }
                } 
                if(count<2){
                    if(!con.isAcesso()){
                        con.setAcesso(true);
                        con.updateOnDb(Integer.parseInt(con.getNumeroContrato()));
                    }
                }
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Contratos verificados e alterações possiveis feitas","Sucesso!", INFORMATION_MESSAGE);
    }//GEN-LAST:event_CortarAcessoMouseClicked

    private void EmitirPagamentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EmitirPagamentosMouseClicked
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Contrato> contratos = new ArrayList<>();
        clientes = Cliente.getAllFromDB();
        for(Cliente c: clientes){
            contratos = Contrato.getAllFromDB(c.getCpf());
            for(Contrato con: contratos){
                Pagamento p = new Pagamento(); 
                p.setValor(con.getMensalidade());
                p.setNumeroContrato(Integer.parseInt(con.getNumeroContrato()));
                p.addOnDb();
            }
        }
        JOptionPane.showMessageDialog(rootPane, "Pagamentos Emitidos","Sucesso!", INFORMATION_MESSAGE);
    }//GEN-LAST:event_EmitirPagamentosMouseClicked

    private void ConsultarFuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultarFuncionariosMouseClicked
        ConsultarFuncionarios Tela = new ConsultarFuncionarios();
        Tela.preencherTabela(Funcionario.getAllFromDB());
        Tela.setVisible(true);
    }//GEN-LAST:event_ConsultarFuncionariosMouseClicked

    public JLabel getCortarAcesso() {
        return CortarAcesso;
    }

    public void setCortarAcesso(JLabel CortarAcesso) {
        this.CortarAcesso = CortarAcesso;
    }

    public JLabel getEmitirPagamentos() {
        return EmitirPagamentos;
    }

    public void setEmitirPagamentos(JLabel EmitirPagamentos) {
        this.EmitirPagamentos = EmitirPagamentos;
    }

    public JLabel getConsultarFuncionarios() {
        return ConsultarFuncionarios;
    }

    public void setConsultarFuncionarios(JLabel ConsultarFuncionarios) {
        this.ConsultarFuncionarios = ConsultarFuncionarios;
    }
    
    
    
    public void setColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,224,204));
    }
    public void resetColor(JPanel panel){
        panel.setBackground(new java.awt.Color(0,153,153));
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ConsultarFuncionarios;
    private javax.swing.JLabel CortarAcesso;
    private javax.swing.JLabel EmitirPagamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lVoltar;
    private javax.swing.JPanel pCadCanal;
    private javax.swing.JPanel pCadCategorias;
    private javax.swing.JPanel pCadCliente;
    private javax.swing.JPanel pConsuCanais;
    private javax.swing.JPanel pConsuCategorias;
    private javax.swing.JPanel pConsuCliente;
    // End of variables declaration//GEN-END:variables
}
