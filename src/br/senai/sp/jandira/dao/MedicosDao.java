package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Pessoa;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MedicosDao {
    private Medico medicos;
    private static ArrayList<Medico> listaMedicos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282094\\java\\medico.txt";
    private static final String ARQUIVO__TEMP = "C:\\Users\\22282094\\java\\medico__temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO); //PATh = navegador do istem de arquivos
    private static final Path PATH__TEMP = Paths.get(ARQUIVO__TEMP); //PATh = navegador do istem de arquivos
    
   
    
    
    public static Medico getMedicos(Integer codigo){
        for(Medico m : listaMedicos){
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
       
        }
     return null;}
    
    
    
     public static void gravar(Medico medico) {
        listaMedicos.add(medico);
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            //Append indica que o arquivo será aberto em forma de ADIÇÂO
            //Write indica que o arquivo estará passivo a escrita
            
                    
                    bw.write (medico.getMedicosSeparadosPorPontoEVirgula());
                    bw.newLine();
                    bw.close();
            
        } catch (Exception e) {
             JOptionPane.showMessageDialog(
                     null, 
                    "O Arquivo não existe",
                    "Buffer",
                    2); 
        }}
      
    
    
    public static void atualizar(Medico medicos){
         for(Medico m : listaMedicos) {
            if(m.getCodigo().equals(medicos.getCodigo())){
                listaMedicos.set(listaMedicos.indexOf(m), medicos);
                break;
            }
        }
        atualizarArquivo();
         
        
        
    }
    public static boolean excluir(Integer codigo){
        for(Medico m : listaMedicos){
            if (m.getCodigo().equals(codigo)) {
                listaMedicos.remove(m);
                break;
                
            }
        }
        atualizarArquivo();
        return false;
    }
     private static void atualizarArquivo() {
        //reconstruir um arquivo atualizado, ou seja, sem o plano que foi excluído
        //utilizaremos a classe File
        
        //Passo 1: criar representação dos arquivos que serão manipulados
        
        File arquivoAtual = new File(ARQUIVO);
        File arquivoTemp = new File(ARQUIVO__TEMP);
        //Passo 2: criar o arquivo temporario
        try {
            arquivoTemp.createNewFile();  
            //abrir o arquivo temporario para escrita
            BufferedWriter bwTEMP = Files.newBufferedWriter(
                    PATH__TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
              
           
            //iterar na lista para adicionar os planos no arquivo temporário
            for(Medico m : listaMedicos){
                bwTEMP.write(m.getMedicosSeparadosPorPontoEVirgula());
                bwTEMP.newLine();
                
   
        
        }
            bwTEMP.close();
            
            //Excluir o arquivo atual - planoDeSaude.txt
            arquivoAtual.delete();
            // Renomear o arquivo temporário
            arquivoTemp.renameTo(arquivoAtual);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro, não foi possível criar o arquivo");
        }
      
    }
    
 
    
    
    
    //Metodos manipulação da ArrayList
    
    public MedicosDao(Medico medicos){
        this.listaMedicos.add(medicos);
        
    }
    public static ArrayList<Medico> listar(){
    return listaMedicos;
    }
   
    public static void getTableMEdicos(){
        
 try {
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = br.readLine();
            //usaremos o metodo split, para dividir a leitura do arquivo em ";" 
            while(linha != null && !linha.isEmpty()){
            
                String linhaVetor [] = linha.split(";");
                //"split" retorna um vetor, sendo asssim a var tem que ser do tipo vetor
               
                //"split" retorna um vetor, sendo asssim a var tem que ser do tipo vetor
                Medico novoMedico = new Medico(Integer.valueOf(linhaVetor[0]),
                        linhaVetor[1], 
                        linhaVetor[2],
                        linhaVetor[4],
                        linhaVetor[3],
                        linhaVetor[5]);
                
                listaMedicos.add(novoMedico);
                linha = br.readLine();
                br.close();
           

            };
           
            
            
        } catch (IOException ex) {
          
           
        }
    
    
    
    }
    
    public static DefaultTableModel getTableModel(){
    
        Object[][] dados = new Object[listaMedicos.size()][3];
        int i =0;
        for(Medico m : listaMedicos){
            dados[i][0] = m.getCodigo();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            i++;
        }
        String [] titulos = {"Codigo", "Crm", "Nome"};
         DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);
         

      return tableModel;
    
    }
        


        
       
    }

