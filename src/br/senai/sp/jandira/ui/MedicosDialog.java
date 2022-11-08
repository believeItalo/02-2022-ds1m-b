package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import javax.swing.JOptionPane;

public class MedicosDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private PlanoDeSaude planoDeSaude;

    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
            PlanoDeSaude planoDeSaude) {

        super(parent, modal);
        initComponents();
        this.tipoOperacao = tipoOperacao;
        this.planoDeSaude = planoDeSaude;

        // Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        labelTituloMedicos.setText("Planos de Saúde - " + tipoOperacao);
        labelTituloMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/edit32.png")));
        textFieldCodigoMedicos.setText(planoDeSaude.getCodigo().toString());
        textFieldTelefoneMedico.setText(planoDeSaude.getOperadora());
        textfieldDataDeNascimentoDoMedico.setText(planoDeSaude.getTipoDoPlano());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTituloMedicos = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigoMedicos = new javax.swing.JLabel();
        textFieldCodigoMedicos = new javax.swing.JTextField();
        labelCrmMedico = new javax.swing.JLabel();
        textFieldTelefoneMedico = new javax.swing.JTextField();
        labelTelefoneMedico = new javax.swing.JLabel();
        textfieldDataDeNascimentoDoMedico = new javax.swing.JTextField();
        buttonCancelarMedico = new javax.swing.JButton();
        buttonSalvarMedico = new javax.swing.JButton();
        textFieldCrm1 = new javax.swing.JTextField();
        labelDataDeNascimentoDoMedico = new javax.swing.JLabel();
        textfieldNomeDoMedico1 = new javax.swing.JTextField();
        labelNomeDoMedico2 = new javax.swing.JLabel();
        labelEmailDoMedico1 = new javax.swing.JLabel();
        textfieldEmailDoMedico1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListListaDeMedicos = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        JlistListaDeEspecialidades = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        labelTituloMedicos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelTituloMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/add32.png"))); // NOI18N
        labelTituloMedicos.setText("Cadastro de Médicos - NOVO");
        jPanel1.add(labelTituloMedicos);
        labelTituloMedicos.setBounds(10, 10, 530, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 50);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do(a) Médico(a):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14), new java.awt.Color(153, 0, 51))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigoMedicos.setText("Código:");
        jPanel2.add(labelCodigoMedicos);
        labelCodigoMedicos.setBounds(40, 50, 70, 16);

        textFieldCodigoMedicos.setEditable(false);
        jPanel2.add(textFieldCodigoMedicos);
        textFieldCodigoMedicos.setBounds(40, 70, 90, 30);

        labelCrmMedico.setText("CRM:");
        jPanel2.add(labelCrmMedico);
        labelCrmMedico.setBounds(150, 50, 50, 16);

        textFieldTelefoneMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldTelefoneMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldTelefoneMedico);
        textFieldTelefoneMedico.setBounds(40, 150, 90, 30);

        labelTelefoneMedico.setText("Telefone:");
        jPanel2.add(labelTelefoneMedico);
        labelTelefoneMedico.setBounds(40, 130, 100, 16);

        textfieldDataDeNascimentoDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldDataDeNascimentoDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldDataDeNascimentoDoMedico);
        textfieldDataDeNascimentoDoMedico.setBounds(400, 150, 150, 30);

        buttonCancelarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancel32.png"))); // NOI18N
        buttonCancelarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelarMedico);
        buttonCancelarMedico.setBounds(490, 370, 60, 60);

        buttonSalvarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvarMedico.setToolTipText("Salvar Cadastro");
        buttonSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvarMedico);
        buttonSalvarMedico.setBounds(490, 290, 60, 60);

        textFieldCrm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrm1ActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrm1);
        textFieldCrm1.setBounds(140, 70, 90, 30);

        labelDataDeNascimentoDoMedico.setText("Data De Nascimento:");
        jPanel2.add(labelDataDeNascimentoDoMedico);
        labelDataDeNascimentoDoMedico.setBounds(400, 130, 120, 16);

        textfieldNomeDoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDoMedico1ActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldNomeDoMedico1);
        textfieldNomeDoMedico1.setBounds(250, 70, 300, 30);

        labelNomeDoMedico2.setText("Nome do Médico:");
        jPanel2.add(labelNomeDoMedico2);
        labelNomeDoMedico2.setBounds(250, 50, 100, 16);

        labelEmailDoMedico1.setText("Email:");
        jPanel2.add(labelEmailDoMedico1);
        labelEmailDoMedico1.setBounds(150, 130, 100, 16);

        textfieldEmailDoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldEmailDoMedico1ActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldEmailDoMedico1);
        textfieldEmailDoMedico1.setBounds(140, 150, 250, 30);

        jListListaDeMedicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListListaDeMedicos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(280, 230, 160, 210);

        JlistListaDeEspecialidades.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(JlistListaDeEspecialidades);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(40, 230, 160, 210);

        jButton1.setText(">");
        jPanel2.add(jButton1);
        jButton1.setBounds(220, 260, 40, 23);

        jButton2.setText("<");
        jPanel2.add(jButton2);
        jButton2.setBounds(220, 310, 40, 23);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 500);

        setBounds(0, 0, 598, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldDataDeNascimentoDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldDataDeNascimentoDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldDataDeNascimentoDoMedicoActionPerformed

    private void buttonSalvarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarMedicoActionPerformed

        if (tipoOperacao == TipoOperacao.ADICIONAR) {
            gravar();
        } else {
            atualizar();
        }

    }//GEN-LAST:event_buttonSalvarMedicoActionPerformed

    private void textFieldTelefoneMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldTelefoneMedicoActionPerformed
      
    }//GEN-LAST:event_textFieldTelefoneMedicoActionPerformed

    private void textFieldCrm1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCrm1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCrm1ActionPerformed

    private void textfieldNomeDoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNomeDoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNomeDoMedico1ActionPerformed

    private void textfieldEmailDoMedico1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldEmailDoMedico1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmailDoMedico1ActionPerformed

    private void buttonCancelarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarMedicoActionPerformed
      dispose();
    }//GEN-LAST:event_buttonCancelarMedicoActionPerformed

    private void atualizar() {
        
        planoDeSaude.setOperadora(textFieldTelefoneMedico.getText());
        planoDeSaude.setTipoDoPlano(textfieldDataDeNascimentoDoMedico.getText());
        
        if(validarCadastro()) {
            PlanoDeSaudeDAO.atualizar(planoDeSaude);

            JOptionPane.showMessageDialog(
                    null,
                    "Plano de saúde atualizado com sucesso!",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
        

    }

    private void gravar() {
        // Criar um objeto Plano de Saúde
        PlanoDeSaude planoDeSaude = new PlanoDeSaude();
        planoDeSaude.setOperadora(textFieldTelefoneMedico.getText());
        planoDeSaude.setTipoDoPlano(textfieldDataDeNascimentoDoMedico.getText());

        if (validarCadastro()) {
            PlanoDeSaudeDAO.gravar(planoDeSaude);

            JOptionPane.showMessageDialog(
                    this,
                    "Plano de saúde gravado com sucesso!",
                    "Plano de Saúde",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private boolean validarCadastro() {

        if (textFieldTelefoneMedico.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o nome da operadora!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);

            textFieldTelefoneMedico.requestFocus();

            return false;

        }

        if (textfieldDataDeNascimentoDoMedico.getText().isEmpty()) {

            JOptionPane.showMessageDialog(
                    this,
                    "Por favor preencha o tipo do plano!",
                    "Plano de Saúde",
                    JOptionPane.ERROR_MESSAGE);

            textfieldDataDeNascimentoDoMedico.requestFocus();

            return false;

        }

        return true;

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistListaDeEspecialidades;
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JList<String> jListListaDeMedicos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelCodigoMedicos;
    private javax.swing.JLabel labelCrmMedico;
    private javax.swing.JLabel labelDataDeNascimentoDoMedico;
    private javax.swing.JLabel labelEmailDoMedico1;
    private javax.swing.JLabel labelNomeDoMedico2;
    private javax.swing.JLabel labelTelefoneMedico;
    private javax.swing.JLabel labelTituloMedicos;
    private javax.swing.JTextField textFieldCodigoMedicos;
    private javax.swing.JTextField textFieldCrm1;
    private javax.swing.JTextField textFieldTelefoneMedico;
    private javax.swing.JTextField textfieldDataDeNascimentoDoMedico;
    private javax.swing.JTextField textfieldEmailDoMedico1;
    private javax.swing.JTextField textfieldNomeDoMedico1;
    // End of variables declaration//GEN-END:variables
}
