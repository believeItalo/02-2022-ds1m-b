package br.senai.sp.jandira.ui;

import br.senai.sp.jandira.dao.MedicosDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDAO;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import br.senai.sp.jandira.model.TipoOperacao;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import lista.FrameLista;

public class MedicosDialog extends javax.swing.JDialog {

    private TipoOperacao tipoOperacao;
    private Medico medico;
    private DefaultListModel<String> listaTodosModel = new DefaultListModel<>();
    private ArrayList<String> especialidades = new ArrayList<>();
    
    private DefaultListModel<String> tabela2 = new DefaultListModel<>();
    private ArrayList<String> tabela1 = new ArrayList<>();
    

    public MedicosDialog(
            java.awt.Frame parent,
            boolean modal,
            TipoOperacao tipoOperacao,
           Medico medico) {

        super(parent, modal);
        
        initComponents();
        carregarEspecialidades();
        this.tipoOperacao = tipoOperacao;
        this.medico = medico;
       
        
        
       //  Preencher os campos, caso o tipo de operação for ALTERAR
        if (tipoOperacao == TipoOperacao.ALTERAR) {
            preencherFormulario();
        }

    }

    private void preencherFormulario() {
        
       labelTituloMedicos.setText("Médicos - " + tipoOperacao);
       textFieldCrm1.setText(medico.getCrm());
       textfieldNomeDoMedico1.setText(medico.getNome());
       textFieldCodigoMedicos.setText(medico.getCodigo().toString());
       textfieldEmailDoMedico1.setText(medico.getEmail());
       textFieldTelefoneMedico.setText(medico.getTelefone());
       textfieldDataDeNascimentoDoMedico.setText(medico.getDataDeNascimento());
  
      
       
       
       
       
       
//       textCodigo.setText(planoDeSaude.getCodigo().toString());
//        textNomeDaOperadora.setText(planoDeSaude.getOperadora());
//        textTipoDoPlano.setText(planoDeSaude.getTipoDoPlano());
        

 
       
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
        jListTodos = new javax.swing.JList<>();
        buttonTrocar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListSelecionados = new javax.swing.JList<>();
        buttonTrocar2 = new javax.swing.JButton();

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
        textFieldCodigoMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCodigoMedicosActionPerformed(evt);
            }
        });
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
        buttonCancelarMedico.setBounds(470, 390, 60, 60);

        buttonSalvarMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvarMedico.setToolTipText("Salvar Cadastro");
        buttonSalvarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvarMedico);
        buttonSalvarMedico.setBounds(470, 300, 60, 60);

        textFieldCrm1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCrm1ActionPerformed(evt);
            }
        });
        jPanel2.add(textFieldCrm1);
        textFieldCrm1.setBounds(150, 70, 60, 30);

        labelDataDeNascimentoDoMedico.setText("Data De Nascimento:");
        jPanel2.add(labelDataDeNascimentoDoMedico);
        labelDataDeNascimentoDoMedico.setBounds(400, 130, 120, 16);

        textfieldNomeDoMedico1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDoMedico1ActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldNomeDoMedico1);
        textfieldNomeDoMedico1.setBounds(230, 70, 280, 30);

        labelNomeDoMedico2.setText("Nome do Médico:");
        jPanel2.add(labelNomeDoMedico2);
        labelNomeDoMedico2.setBounds(230, 50, 100, 16);

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

        jListTodos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListTodos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 210, 130, 270);

        buttonTrocar.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonTrocar.setText(">");
        buttonTrocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrocarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonTrocar);
        buttonTrocar.setBounds(190, 320, 70, 50);

        jListSelecionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListSelecionados);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(300, 210, 140, 270);

        buttonTrocar2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        buttonTrocar2.setText("<");
        buttonTrocar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTrocar2ActionPerformed(evt);
            }
        });
        jPanel2.add(buttonTrocar2);
        buttonTrocar2.setBounds(190, 250, 70, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 60, 560, 500);

        setBounds(0, 0, 598, 615);
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldDataDeNascimentoDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldDataDeNascimentoDoMedicoActionPerformed
        
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

    private void textFieldCodigoMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCodigoMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCodigoMedicosActionPerformed

    private void buttonTrocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrocarActionPerformed
        //String cidade = jListTodos.getSelectedValue(); Pega somente um, o primeiro
        //Object[] cidades = jListTodos.getSelectedValues(); Depreciado
        List<String> especialidade = jListTodos.getSelectedValuesList(); // Usar esse aqui

        for (String especialidades : especialidade){
            tabela1.add(especialidades);
        }
   
        tabela2.clear();
        tabela2.addAll(tabela1);
        jListSelecionados.setModel(tabela2);
         
        
        
    }//GEN-LAST:event_buttonTrocarActionPerformed

    private void buttonTrocar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTrocar2ActionPerformed
       List<String> especialidade = jListSelecionados.getSelectedValuesList();
        for (String especialidades : especialidade){
            tabela1.remove(especialidades);
        }
          tabela2.clear();
        tabela2.addAll(tabela1);
        jListSelecionados.setModel(tabela2);
    }//GEN-LAST:event_buttonTrocar2ActionPerformed


   

   

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelarMedico;
    private javax.swing.JButton buttonSalvarMedico;
    private javax.swing.JButton buttonTrocar;
    private javax.swing.JButton buttonTrocar2;
    private javax.swing.JList<String> jListSelecionados;
    private javax.swing.JList<String> jListTodos;
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

    private void gravar() {
        
        Medico m = new Medico();
        m.setNome(textfieldNomeDoMedico1.getText());
        m.setCrm(textFieldCrm1.getText());
        m.setEmail(textfieldEmailDoMedico1.getText());
        m.setTelefone(textFieldTelefoneMedico.getText());
        m.setDataDeNascimento(textfieldDataDeNascimentoDoMedico.getText());
        if(validarCadastro()){
        
            MedicosDao.gravar(m);
            JOptionPane.showMessageDialog(this, "Médico gravado com sucesso");
            dispose();
        }
        

    }

    private boolean validarCadastro() {
        
            if (textfieldNomeDoMedico1.getText().isEmpty() || textFieldCrm1.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Preencha os campos (Nome) e (Crm) ", 
                    "Médicos", 
                    JOptionPane.WARNING_MESSAGE); 
                    return false;
            }
            return true;
        
        
    }

    private void atualizar() {
        medico.setNome(textfieldNomeDoMedico1.getText());
        medico.setCrm(textFieldCrm1.getText());
        medico.setEmail(textfieldEmailDoMedico1.getText());
        medico.setTelefone(textFieldTelefoneMedico.getText());
        medico.setDataDeNascimento(textfieldDataDeNascimentoDoMedico.getText());

        if (validarCadastro()) {
            MedicosDao.atualizar(medico);
            JOptionPane.showMessageDialog(this,
                    "Medico gravado com sucesso",
                    "Medico",
                    JOptionPane.INFORMATION_MESSAGE);
            dispose();
    }

    }

    private void carregarEspecialidades() {
        especialidades.add("100 - Cardiologista");
        especialidades.add("200 - Fisioterapeuta");
        especialidades.add("300 - Pediatra");
        especialidades.add("400 - Neurocirurgião");
        especialidades.add("500 - Clínico Geral");
        
        listaTodosModel.addAll(especialidades);
        jListTodos.setModel(listaTodosModel);
    }
    private void carregarEspecialidadesParaTroca(){
    
        especialidades.add("100 - Cardiologista");
        especialidades.add("200 - Fisioterapeuta");
        especialidades.add("300 - Pediatra");
        especialidades.add("400 - Neurocirurgião");
        especialidades.add("500 - Clínico Geral");
        
        listaTodosModel.addAll(especialidades);
        jListTodos.setModel(listaTodosModel);
    
    
}
    
}


