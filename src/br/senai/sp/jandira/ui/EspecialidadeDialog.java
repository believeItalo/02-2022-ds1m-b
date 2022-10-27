package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.EspecialidadeDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class EspecialidadeDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Especialidade especialidade;

    public EspecialidadeDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperação,
            Especialidade especialidade) {
        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperação;
        this.especialidade = especialidade;

        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTituloEspecialidade = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        textNomeDaEspecialidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textDescDaEspecialidade = new javax.swing.JTextField();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        labelTituloEspecialidade.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTituloEspecialidade.setText("Adicionar - Especialidade");
        jPanel1.add(labelTituloEspecialidade);
        labelTituloEspecialidade.setBounds(20, 10, 310, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setLayout(null);

        jLabel2.setText("Código:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 50, 110, 16);

        textCodigo.setEditable(false);
        textCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textCodigo);
        textCodigo.setBounds(30, 70, 71, 30);

        jLabel3.setText("Nome da Especialidade:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(30, 110, 230, 16);

        textNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textNomeDaEspecialidade);
        textNomeDaEspecialidade.setBounds(30, 130, 500, 30);

        jLabel4.setText("Descrição Especialidade:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(30, 170, 230, 16);

        textDescDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textDescDaEspecialidadeActionPerformed(evt);
            }
        });
        jPanel2.add(textDescDaEspecialidade);
        textDescDaEspecialidade.setBounds(30, 190, 500, 30);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(370, 260, 80, 60);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Salvar Cadastro");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(460, 260, 80, 60);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 340);

        setSize(new java.awt.Dimension(598, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textDescDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textDescDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textDescDaEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void textCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCodigoActionPerformed

    private void textNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeDaEspecialidadeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelTituloEspecialidade;
    private javax.swing.JTextField textCodigo;
    private javax.swing.JTextField textDescDaEspecialidade;
    private javax.swing.JTextField textNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables

    private void gravar() {
        Especialidade e = new Especialidade();
        System.out.println(e.getCodigo());
        e.setNome(textNomeDaEspecialidade.getText());
        e.setDescricao(textDescDaEspecialidade.getText());
        if (validarCadastro()) {
            EspecialidadeDao.gravar(e);
            JOptionPane.showMessageDialog(this,
                    "Especialidade gravada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();

        }
    }

    private boolean validarCadastro() {
        if (textNomeDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, digite o nome da especialidade",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            textNomeDaEspecialidade.requestFocus();
            return false;
        }
        if (textDescDaEspecialidade.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor digite a descrição da especialidade",
                    "Especialidade",
                    JOptionPane.ERROR_MESSAGE);
            textDescDaEspecialidade.requestFocus();
            return false;
        }
        return true;
    }

    private void atualizar() {

        especialidade.setNome(textNomeDaEspecialidade.getText());
        especialidade.setDescricao(textDescDaEspecialidade.getText());

        if (validarCadastro()) {
            EspecialidadeDao.atualizar(especialidade);
            JOptionPane.showMessageDialog(this,
                    "Especialidade gravada com sucesso",
                    "Especialidade",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }

    private void preencherFormulario() {
        labelTituloEspecialidade.setText("Especialidade - " + tipoOperacao);
        textCodigo.setText(especialidade.getCodigo().toString());
        textNomeDaEspecialidade.setText(especialidade.getNome());
        textDescDaEspecialidade.setText(especialidade.getDescricao());

    }

}
