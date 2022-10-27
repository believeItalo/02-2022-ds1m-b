
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;
import javax.swing.JTable;


public class EspecialidadePanel extends javax.swing.JPanel {
int linha;
    public EspecialidadePanel() {
        initComponents();
        criarTabelaEspecialidade();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollTablePlanosDeSaude = new javax.swing.JScrollPane();
        tableEspecialidade = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        buttonExcluirEspecialidade = new javax.swing.JButton();
        buttonAlterarEspecialidade = new javax.swing.JButton();
        buttonAdicionarEspecialidade = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        tableEspecialidade.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollTablePlanosDeSaude.setViewportView(tableEspecialidade);

        add(scrollTablePlanosDeSaude);
        scrollTablePlanosDeSaude.setBounds(20, 40, 905, 240);

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 102));
        jLabel3.setText("Especialidades");
        add(jLabel3);
        jLabel3.setBounds(20, 10, 180, 20);

        buttonExcluirEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirEspecialidade.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonExcluirEspecialidade);
        buttonExcluirEspecialidade.setBounds(700, 294, 70, 60);

        buttonAlterarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarEspecialidade.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAlterarEspecialidade);
        buttonAlterarEspecialidade.setBounds(780, 294, 70, 60);

        buttonAdicionarEspecialidade.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarEspecialidade.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarEspecialidadeActionPerformed(evt);
            }
        });
        add(buttonAdicionarEspecialidade);
        buttonAdicionarEspecialidade.setBounds(860, 294, 70, 60);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirEspecialidadeActionPerformed
      
      linha = tableEspecialidade.getSelectedRow();  
        
      if(linha != -1){
      excluir();
      } else{
      JOptionPane.showMessageDialog(null, 
              "Por favor selecione uma das especialiades", 
              "Esepecialidades", 
              JOptionPane.ERROR_MESSAGE);
      
      
      }
      
    }//GEN-LAST:event_buttonExcluirEspecialidadeActionPerformed

    private void buttonAlterarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarEspecialidadeActionPerformed

    linha = tableEspecialidade.getSelectedRow();
      
      if(linha != -1){
      editar();
      } else{
      JOptionPane.showMessageDialog(null,
              "Por favor, selecione uma especialidade",
              "Especialidade",
              JOptionPane.ERROR_MESSAGE);
      
      }
       
      
     

      
    
    }//GEN-LAST:event_buttonAlterarEspecialidadeActionPerformed

    private void editar(){
        Especialidade especialidade = EspecialidadeDao.getEspecialidade(getCodigo());
        EspecialidadeDialog especialidadeDialog =
                new EspecialidadeDialog(null,
                        true, 
                        TipoOperacao.ALTERAR,
                        especialidade);
        
        especialidadeDialog.setVisible(true);
        
        criarTabelaEspecialidade();
        
    
    };
    
    
    private void buttonAdicionarEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarEspecialidadeActionPerformed

        EspecialidadeDialog especialidadeDialog =
                new EspecialidadeDialog(null,
                        true,
                        TipoOperacao.ADICIONAR,
                       null);
        
        especialidadeDialog.setVisible(true);
        criarTabelaEspecialidade();
      
    }//GEN-LAST:event_buttonAdicionarEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarEspecialidade;
    private javax.swing.JButton buttonAlterarEspecialidade;
    private javax.swing.JButton buttonExcluirEspecialidade;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane scrollTablePlanosDeSaude;
    private javax.swing.JTable tableEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaEspecialidade() {
      tableEspecialidade.setModel(EspecialidadeDao.getTableModel());
      tableEspecialidade.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
      
      // Definir a largura de cada coluna
        tableEspecialidade.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidade.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidade.getColumnModel().getColumn(2).setPreferredWidth(300);

        // Impedir/bloquear a movimentação das colunas
        tableEspecialidade.getTableHeader().setReorderingAllowed(false);

        // Bloquear edição das células
        tableEspecialidade.setDefaultEditor(Object.class, null);  
    }
  private Integer getCodigo() {
        String codigoStr = tableEspecialidade.getValueAt(linha, 0).toString();
        return Integer.valueOf(codigoStr);
    }
    
    private void excluir() {
      int resposta = JOptionPane.showConfirmDialog(this, 
               "Deseja Excluir a Especialidade selecionada ?",
               "Especialidade", 
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
      if(resposta == 0){
          EspecialidadeDao.excluir(getCodigo());
          criarTabelaEspecialidade();
      
      };
 
      
}}
