
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
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }
        
        return null;
        
    }
    
    public static void atualizar(Especialidade especialidade) {
        
               for(Especialidade e : especialidades) {
            if(e.getCodigo().equals(especialidade.getCodigo())){
                especialidades.set(especialidades.indexOf(e), especialidade);
                break;
            }
        }
        
    }
    
       public static void criarEspecialidadesTeste() {
        Especialidade e1 = new Especialidade("Cardiologista", "Cuida do Coração");
        Especialidade e2 = new Especialidade("TEste", "teste");
        Especialidade e3 = new Especialidade("Pediatria", "cuida das crianças");
        Especialidade e4 = new Especialidade("Cardiologista", "Cuida do Coração");
        Especialidade e5 = new Especialidade("TEste", "teste");
        Especialidade e6 = new Especialidade("", "");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        especialidades.add(e4);
        especialidades.add(e5);
        especialidades.add(e6);
        
        
    }

    
    public static DefaultTableModel getTableModel() {
        
        Object[][] dadosEspecialidades = new Object[especialidades.size()][3];
        
        int linha = 0;
        for(Especialidade e : especialidades){
            dadosEspecialidades[linha][0] = e.getCodigo();
            dadosEspecialidades[linha][1] = e.getNome();
            dadosEspecialidades[linha][2] = e.getDescricao();
            linha++;
        }
        
        String[] colunas = {"Código", "Nome", "Descrição"};
        
        DefaultTableModel tableModel = new DefaultTableModel(dadosEspecialidades, colunas);
        
        return tableModel;
        
    }
    
   
}
