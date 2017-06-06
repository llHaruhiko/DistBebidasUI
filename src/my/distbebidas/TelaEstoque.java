/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my.distbebidas;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import my.distbebidas.conexaobd.conexaoBD;


/**
 *
 * @author Avell
 */
public class TelaEstoque extends javax.swing.JFrame {
    public String informacaoTabelaCOD;
    public int linha;
    

    /**
     * Creates new form TelaEstoque
     */
    public TelaEstoque() {
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

        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButtonAltQnt = new javax.swing.JButton();
        jTextFieldConsultaEstoque = new javax.swing.JTextField();
        jButtonConsultar = new javax.swing.JButton();
        jButtonMostrarTodos = new javax.swing.JButton();
        jButtonRemProduto = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonFechar = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(false);

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Quantidade", "Preço Venda", "Preço Compra", "Validade"
            }
        ));
        tabelaConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaConsulta);

        jLabel1.setText("ESTOQUE");

        jButtonAltQnt.setText("Alterar Quantidade");
        jButtonAltQnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltQntActionPerformed(evt);
            }
        });

        jTextFieldConsultaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldConsultaEstoqueActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jButtonMostrarTodos.setText("Mostrar Todos");
        jButtonMostrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMostrarTodosActionPerformed(evt);
            }
        });

        jButtonRemProduto.setText("Remover Produto");
        jButtonRemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemProdutoActionPerformed(evt);
            }
        });

        jLabel2.setText("Consulta:");

        jButtonFechar.setText("Fechar");
        jButtonFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButtonMostrarTodos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldConsultaEstoque)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonAltQnt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonRemProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonFechar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldConsultaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonConsultar)
                            .addComponent(jButtonMostrarTodos))
                        .addGap(33, 33, 33)
                        .addComponent(jButtonAltQnt)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonRemProduto))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButtonFechar)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMostrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMostrarTodosActionPerformed
        // TODO add your handling code here:
        ArrayList<EstoqueDAO> p = new ArrayList<EstoqueDAO>();
            conexaoBD cb = new conexaoBD();
            
            try{
                p = (ArrayList<EstoqueDAO>) cb.consultaTodos();
            } catch (SQLException ex) {
            
                Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(p.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há registros que satisfazem a pesquisa!");
                return;
            }
            
            DefaultTableModel modelo = (DefaultTableModel) tabelaConsulta.getModel();
            
            modelo.setNumRows(0);
            
            Object[] fila = new Object[modelo.getColumnCount()];
            for(int i=0; i < p.size(); i++){
                modelo.addRow(new Object[]{
                    p.get(i).getCod_produto(),
                    p.get(i).getNome_produto(),
                    p.get(i).getQnt_produto(),
                    p.get(i).getPreco_produto_compra(),
                    p.get(i).getPreco_produto_venda(),
                    p.get(i).getValidade_produto()
                });
                
            }
          
    }//GEN-LAST:event_jButtonMostrarTodosActionPerformed

    private void jButtonFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFecharActionPerformed
        // TODO add your handling code here:
        TelaEstoque.this.dispose();
        new DistBebidasUI().setVisible(true);
    }//GEN-LAST:event_jButtonFecharActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        ArrayList<EstoqueDAO> p = new ArrayList<EstoqueDAO>();
            conexaoBD cb = new conexaoBD();
            
            try{
                p = (ArrayList<EstoqueDAO>) cb.consultaEspec(jTextFieldConsultaEstoque.getText());
            } catch (SQLException ex) {
            
                Logger.getLogger(TelaEstoque.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if(p.isEmpty()){
                JOptionPane.showMessageDialog(null, "Não há registros que satisfazem a pesquisa!");
                return;
            }
            
            DefaultTableModel modelo = (DefaultTableModel) tabelaConsulta.getModel();
            
            modelo.setNumRows(0);
            
            Object[] fila = new Object[modelo.getColumnCount()];
            for(int i=0; i < p.size(); i++){
                modelo.addRow(new Object[]{
                    p.get(i).getCod_produto(),
                    p.get(i).getNome_produto(),
                    p.get(i).getQnt_produto(),
                    p.get(i).getPreco_produto_compra(),
                    p.get(i).getPreco_produto_venda(),
                    p.get(i).getValidade_produto()
                });
                
            }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jTextFieldConsultaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldConsultaEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldConsultaEstoqueActionPerformed

    private void tabelaConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaConsultaMouseClicked
        // TODO add your handling code here:
        informacaoTabelaCOD = info();
        EstoqueDAO e = new EstoqueDAO();
        e.setCodigotabela(Integer.parseInt(informacaoTabelaCOD));
        System.out.println("INFO: "+informacaoTabelaCOD);
    }//GEN-LAST:event_tabelaConsultaMouseClicked

    private void jButtonAltQntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltQntActionPerformed
        // TODO add your handling code here: ALTERAR QUANTIDADE
        AtualizarQntEstoque atualizaEstoque = new AtualizarQntEstoque();
        atualizaEstoque.jTextFieldQNT.setText(tabelaConsulta.getModel().getValueAt(linha, 2).toString());
        atualizaEstoque.jLabelCodigo.setText(informacaoTabelaCOD);
        atualizaEstoque.setVisible(true);
        
    }//GEN-LAST:event_jButtonAltQntActionPerformed

    private void jButtonRemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemProdutoActionPerformed
        // TODO add your handling code here:
        conexaoBD conexao = new conexaoBD();
        try{
            conexao.excluirProduto(Integer.parseInt(informacaoTabelaCOD));
            JOptionPane.showMessageDialog(null, "Removido com sucesso!");
            
        }catch (Exception ex) {
            JOptionPane.showMessageDialog(null,""+ex,"Erro",JOptionPane.ERROR_MESSAGE,null);
        }
    }//GEN-LAST:event_jButtonRemProdutoActionPerformed
public String info(){
        linha = tabelaConsulta.getSelectedRow();
        String info = tabelaConsulta.getModel().getValueAt(linha, 0).toString();
        
        return info;
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
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonAltQnt;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonFechar;
    private javax.swing.JButton jButtonMostrarTodos;
    private javax.swing.JButton jButtonRemProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldConsultaEstoque;
    private javax.swing.JTable tabelaConsulta;
    // End of variables declaration//GEN-END:variables
}
