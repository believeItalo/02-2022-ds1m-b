
package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicosDao;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JTable;

public class MedicosPanel extends javax.swing.JPanel {

   
    public MedicosPanel() {
        initComponents();
        criarTabelaMedicos();
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tituloMedicos = new javax.swing.JLabel();
        scrollTableMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonExcluirMedicos = new javax.swing.JButton();
        buttonAlterarMedicos = new javax.swing.JButton();
        buttonAdicionarMedicos = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setPreferredSize(new java.awt.Dimension(945, 370));
        setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setPreferredSize(new java.awt.Dimension(945, 370));
        jPanel1.setLayout(null);

        tituloMedicos.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        tituloMedicos.setForeground(new java.awt.Color(102, 0, 102));
        tituloMedicos.setText("Médicos");
        jPanel1.add(tituloMedicos);
        tituloMedicos.setBounds(20, 10, 180, 20);

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollTableMedicos.setViewportView(tableMedicos);

        jPanel1.add(scrollTableMedicos);
        scrollTableMedicos.setBounds(20, 40, 905, 240);

        buttonExcluirMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/delete32-2.png"))); // NOI18N
        buttonExcluirMedicos.setToolTipText("Excluir plano de saúde selecionado");
        buttonExcluirMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonExcluirMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonExcluirMedicos);
        buttonExcluirMedicos.setBounds(700, 294, 70, 60);

        buttonAlterarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png"))); // NOI18N
        buttonAlterarMedicos.setToolTipText("Editar plano de saúde selecionado");
        buttonAlterarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAlterarMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAlterarMedicos);
        buttonAlterarMedicos.setBounds(780, 294, 70, 60);

        buttonAdicionarMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        buttonAdicionarMedicos.setToolTipText("Adicionar plano de saúde");
        buttonAdicionarMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarMedicosActionPerformed(evt);
            }
        });
        jPanel1.add(buttonAdicionarMedicos);
        buttonAdicionarMedicos.setBounds(860, 294, 70, 60);

        add(jPanel1);
        jPanel1.setBounds(0, 0, 945, 370);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonExcluirMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonExcluirMedicosActionPerformed

////        // Obtemos o índice da linha selecionada na tabela
////        linha = tablePlanosDeSaude.getSelectedRow();
////
////        // Verificamos se a linha é diferente de -1
////        // -1 significa que o usuário não selecionou nada
////        if (linha != -1) {
////            excluir();
////        } else {
////            JOptionPane.showMessageDialog(
////                this,
////                "Por favor, selecione o plano que você deseja excluir!",
////                "Plano de Saúde",
////                JOptionPane.ERROR_MESSAGE);
////        }
    }//GEN-LAST:event_buttonExcluirMedicosActionPerformed

    private void buttonAlterarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAlterarMedicosActionPerformed

//        linha = tablePlanosDeSaude.getSelectedRow();
//
//        if (linha != -1) {
//            editar();
//        } else {
//            JOptionPane.showMessageDialog(
//                this,
//                "Por favor, selecione um plano de saúde para alterar.",
//                "Planos de Saúde",
//                JOptionPane.WARNING_MESSAGE);
//        }
//
    }//GEN-LAST:event_buttonAlterarMedicosActionPerformed

    private void buttonAdicionarMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarMedicosActionPerformed

        MedicosDialog medicosDialog = new MedicosDialog
        (       null, 
                true,
                TipoOperacao.ADICIONAR,
                null);
        medicosDialog.setVisible(true);
        criarTabelaMedicos();
        
//        PlanosDeSaudeDialog planosDeSaudeDialog =
//        new PlanosDeSaudeDialog(
//            null,
//            true,
//            TipoOperacao.ADICIONAR,
//            null);
//
//        planosDeSaudeDialog.setVisible(true);
//
//        criarTabelaPlanosDeSaude();
    }//GEN-LAST:event_buttonAdicionarMedicosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionarMedicos;
    private javax.swing.JButton buttonAlterarMedicos;
    private javax.swing.JButton buttonExcluirMedicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane scrollTableMedicos;
    private javax.swing.JTable tableMedicos;
    private javax.swing.JLabel tituloMedicos;
    // End of variables declaration//GEN-END:variables

    private void criarTabelaMedicos() {
        
        tableMedicos.setModel(MedicosDao.getTableModel());
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(300);
        tableMedicos.getTableHeader().setResizingAllowed(false);
        tableMedicos.setDefaultEditor(Object.class, null);
//          
    }
    }

