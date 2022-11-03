package br.senai.sp.jandira.dao;

import java.util.ArrayList;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.dynalink.StandardOperation;

public class PlanoDeSaudeDAO { // Simular nosso banco de dados

    private PlanoDeSaude planoDeSaude;
    private static ArrayList<PlanoDeSaude> planos = new ArrayList<>();
    private static final String ARQUIVO = "C:\\Users\\22282094\\java\\planoDeSaude.txt";
    private static final String ARQUIVO__TEMP = "C:\\Users\\22282094\\java\\planoDeSaude__temp.txt";
    private static final Path PATH = Paths.get(ARQUIVO); //PATh = navegador do istem de arquivos
    private static final Path PATH__TEMP = Paths.get(ARQUIVO__TEMP); //PATh = navegador do istem de arquivos

    public PlanoDeSaudeDAO(PlanoDeSaude planoDeSaude) {
        this.planos.add(planoDeSaude);
    }

    public PlanoDeSaudeDAO() {

    }

    public static void gravar(PlanoDeSaude planoDeSaude) {
        planos.add(planoDeSaude);
        
        try {
            BufferedWriter bw = Files.newBufferedWriter(PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            //Append indica que o arquivo será aberto em forma de ADIÇÂO
            //Write indica que o arquivo estará passivo a escrita
            
                    
                    bw.write (planoDeSaude.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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
    
    public static boolean excluir(Integer codigo) {
        for(PlanoDeSaude p : planos) {
            if(p.getCodigo().equals(codigo)){
                planos.remove(p);
                break;
            }
        }
        atualizarArquivo();
        return false;
        }
    
    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
      
        for(PlanoDeSaude p : planos) {
            if(p.getCodigo().equals(codigo)){
                return p;
            }
        }
        
        return null;  
    }
    
    public static void atualizar(PlanoDeSaude planoDeSaude) {
        for(PlanoDeSaude p : planos) {
            if(p.getCodigo().equals(planoDeSaude.getCodigo())){
                planos.set(planos.indexOf(p), planoDeSaude);
                break;
            }
        }
        atualizarArquivo();
    }

    public static ArrayList<PlanoDeSaude> listarTodos() {
        return planos;
    }

    public static void getListaPlanosDeSaude() {
//        PlanoDeSaude p1 = new PlanoDeSaude("Unimed", "Bronze");
//        PlanoDeSaude p2 = new PlanoDeSaude("Unimed", "Ouro");
//        PlanoDeSaude p3 = new PlanoDeSaude("Amil", "Advanced");
//        PlanoDeSaude p4 = new PlanoDeSaude("Bradesco", "Exclusive");
//        planos.add(p1);
//        planos.add(p2);
//        planos.add(p3);
//        planos.add(p4);

  // Abrindo arquivo de "DB" para leitura
  
        try {
            BufferedReader br = Files.newBufferedReader(PATH);
            String linha = br.readLine();
            //usaremos o metodo split, para dividir a leitura do arquivo em ";" 
            while(linha != null && !linha.isEmpty()){
            
                String linhaVetor [] = linha.split(";");
                //"split" retorna um vetor, sendo asssim a var tem que ser do tipo vetor
                PlanoDeSaude novoPlanoDeSaude = new PlanoDeSaude
        (Integer.valueOf(linhaVetor[0]),//tivemos que converter o tipo do valor "Codigo" de int para String
                        linhaVetor[1], 
                        linhaVetor[2]);
            planos.add(novoPlanoDeSaude);
            linha = br.readLine();
            br.close();
            
            };
           
            
            
        } catch (IOException ex) {
          
           
        }
    }

    public static DefaultTableModel getTableModel() {

        // Matriz que receberá os planos de saúde
        // que serão utilizados na Tabela (JTable)
        Object[][] dados = new Object[planos.size()][3];

        // For Each, para extrair cada objeto plano de saúde do
        // arraylist planos e separar cada dado na matriz dados
        int i = 0;
        for (PlanoDeSaude p : planos) {
            dados[i][0] = p.getCodigo();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getTipoDoPlano();
            i++;
        }

        // Definir um vetor com os nomes das colulas da tabela
        String[] titulos = {"Código", "Nome da operadora", "Tipo do plano"};

        // Criar o modelo que será utilizado pela JTable 
        // para exibir os dados dos planos
        DefaultTableModel tableModel = new DefaultTableModel(dados, titulos);

        return tableModel;

    }
    
    private static void atualizarArquivo(){
    
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
            for(PlanoDeSaude p : planos){
                bwTEMP.write(p.getPlanoDeSaudeSeparadoPorPontoEVirgula());
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
    

}
