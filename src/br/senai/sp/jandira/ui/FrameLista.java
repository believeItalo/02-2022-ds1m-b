
package br.senai.sp.jandira.ui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

public class FrameLista extends javax.swing.JPanel {
     private DefaultListModel<String> listaTodosModel = new DefaultListModel<>();
    private ArrayList<String> cidades = new ArrayList<>();
    
    private DefaultListModel<String> selecionadosModel = new DefaultListModel<>();
    private ArrayList<String> selecionados = new ArrayList<>();

    public FrameLista() {
        initComponents();
        carregarCidades();
    }
     private void carregarCidades() {
        cidades.add("100 - Cotia");
        cidades.add("200 - Itapevi");
        cidades.add("300 - São Roque");
        cidades.add("400 - Osasco");
        cidades.add("500 - Barueri");
        cidades.add("600 - Carapicuíba");
        cidades.add("700 - Santana de Parnaíba");
        
        listaTodosModel.addAll(cidades);
        jListTodos.setModel(listaTodosModel);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jListTodos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jListSelecionados = new javax.swing.JList<>();
        buttonAdd = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(471, 362));
        setMinimumSize(new java.awt.Dimension(471, 362));
        setLayout(null);

        jListTodos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jListTodos);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 110, 200);

        jScrollPane3.setPreferredSize(new java.awt.Dimension(471, 362));

        jListSelecionados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jListSelecionados);

        add(jScrollPane3);
        jScrollPane3.setBounds(260, 60, 110, 210);

        buttonAdd.setText("Add");
        buttonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddActionPerformed(evt);
            }
        });
        add(buttonAdd);
        buttonAdd.setBounds(160, 140, 72, 50);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddActionPerformed
      
     //String cidade = jListTodos.getSelectedValue(); Pega somente um, o primeiro
        //Object[] cidades = jListTodos.getSelectedValues(); Depreciado
        List<String> cidades = jListTodos.getSelectedValuesList(); // Usar esse aqui
        
        for (String cidade : cidades){
            selecionados.add(cidade);
        }
        
       
        selecionadosModel.clear();
        selecionadosModel.addAll(selecionados);
        jListSelecionados.setModel(selecionadosModel);}
     
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
            java.util.logging.Logger.getLogger(FrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLista().setVisible(true);
            }
        });
    
    }//GEN-LAST:event_buttonAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdd;
    private javax.swing.JList<String> jListSelecionados;
    private javax.swing.JList<String> jListTodos;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
