
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class EspecialidadeDao {
private static ArrayList<Especialidade> especialidades = new ArrayList<>();
private static final String ARQUIVO = "C:\\Users\\22282094\\java\\especialidade.txt";
private static final Path PATH = Paths.get(ARQUIVO);
    
    public static void gravar(Especialidade especialidade) {
        
        especialidades.add(especialidade);
      
        try {
            //abrindo arquivo para escrita
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
                    
                    bw.write(especialidade.getEspecialidadeSeparadaPorPontoEVirgula());
                    bw.newLine();
                    bw.close();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(
                     null, 
                    "O Arquivo não existe",
                    "Buffer",
                    2); 
        }
    
       
            
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
        Especialidade e2 = new Especialidade("Acupuntura", "A Acupuntura é recomendada para o tratamento de 200 doenças e sintomas.");
        Especialidade e3 = new Especialidade("Pediatria", "Cuida da saúde de bebês, crianças e adolescentes");
        especialidades.add(e1);
        especialidades.add(e2);
        especialidades.add(e3);
        
        
        
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
