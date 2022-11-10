package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Pessoa;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
public class MedicosDao {
  
    private Medico medicos;
    private static ArrayList<Medico> listaMedicos = new ArrayList<>();
   
    
    public MedicosDao(Medico medicos){
        this.listaMedicos.add(medicos);
        
    }
    public static ArrayList<Medico> listar(){
    return listaMedicos;
    }
   
    public static void getTableMEdicos(){
    Medico m = new Medico("22222", "João");
    Medico m1 = new Medico("33333", "Carlos");
    Medico m2 = new Medico("44444", "Gustavo");
    Medico m3 = new Medico("22222", "Rogério");
    listaMedicos.add(m);
    listaMedicos.add(m1);
    listaMedicos.add(m2);
    listaMedicos.add(m3);
    
    
    
    }
    
    public static DefaultTableModel getTableModel(){
    
        Object[][] dados = new Object[listaMedicos.size()][3];
        int i =0;
        for(Medico m : listaMedicos){
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getNome();
            dados[i][2] = m.getCrm();
            i++;
        }
        String [] titulos = {"Codigo", "Nome", "Crm"};
         DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
         

      return tableModel;
    
    }
        


        
       
    }

