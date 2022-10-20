
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;
import java.util.Objects;
import javax.swing.table.DefaultTableModel;


public class EspecialidadeDao {
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();
    
    public static void gravar(Especialidade especialidade) {
        especialidades.add(especialidade);
    }
    
    public static void excluir(int codigo) {
        
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                System.out.println("Excluindo especialidade...");
                break;
            }
        }
        
    }
    
    public static ArrayList<Especialidade> listar() {
        return especialidades;
    }
    
    public static Especialidade getEspecialidade(int codigo) {
        Especialidade especialidade = new Especialidade();
        
        for(Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }
        
        return null;
        
    }
    
    public static void atualizar(Especialidade especialidadeAtualizada) {
        
        for(Especialidade e : especialidades) {
            if(Objects.equals(e.getCodigo(), especialidadeAtualizada.getCodigo())) {
                int i = especialidades.indexOf(e);
                especialidades.set(i, especialidadeAtualizada);
                break;
            }
        }
        
    }
    
    public static DefaultTableModel getTableModel() {
        
        Object[][] dadosEspecialidades = new Object[especialidades.size()][3];
        
        int linha = 0;
        for(Especialidade e : especialidades) {
            dadosEspecialidades[linha][0] = e.getCodigo().toString();
            dadosEspecialidades[linha][1] = e.getNome();
            dadosEspecialidades[linha][2] = e.getDescricao();
            linha++;
        }
        
        String[] colunas = {"Código", "Nome", "Descrição"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dadosEspecialidades, colunas);
        
        return tableModel;
        
    }
    
   
}
