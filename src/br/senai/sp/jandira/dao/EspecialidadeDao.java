
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
private static final String ARQUIVO__TEMP = "C:\\Users\\22282094\\java\\especialidade__TEMP.txt";
private static final Path PATH = Paths.get(ARQUIVO);
private static final Path PATH__TEMP = Paths.get(ARQUIVO__TEMP);
    
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
        //reconstruir um arquivo atualizado, ou seja, sem o plano que foi excluído
        //utilizaremos a classe File
        
        //Passo 1: criar representação dos arquivos que serão manipulados
        
        
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
    
       public static void getTabelaEspecialidades() {
    
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = br.readLine();
                while(linha != null && !linha.isEmpty()){
                    String linhaVetor[] = linha.split(";");
                    Especialidade especialidade = new Especialidade(
                            Integer.valueOf(linhaVetor[0]),
                            linhaVetor[1],
                            linhaVetor[2]);
                   especialidades.add(especialidade);
                    linha = br.readLine();
                    br.close();
                
                
                };
    } catch (IOException ex) {
           
   
    
    }
        
        
        
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
