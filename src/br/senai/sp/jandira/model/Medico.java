package br.senai.sp.jandira.model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private Especialidade especialidades;
    
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public Medico(){
     
        atualizarCodigo();
        }
    
      public Medico(Integer codigo, String nome, String crm, String telefone, String email, String dataDeNascimento) {

        this.codigo = codigo;
        this.crm = crm;
        setNome(nome);
        setEmail(email);
        setTelefone(telefone);
        setDataDeNascimento(dataDeNascimento);
         this.contador = codigo; 
    }
    
    public Medico(Integer codigo, String crm, String nome){
        this.crm = crm;
        this.codigo = contador;
        setNome(nome);
        atualizarCodigo();
    }

    public Integer getCodigo() {
        return codigo;
    }

    
    
    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

 

    public Especialidade getEspecialidades() {
        return especialidades;
    }

    private void atualizarCodigo() {
        contador++;
        this.codigo = contador;
    }

    public String getMedicosSeparadosPorPontoEVirgula(){
     String MedicosStr = 
             this.codigo + ";"
             + this.getNome() + ";" +
             this.getCrm() + ";" + 
             this.getEmail()+";"+ 
             this.getTelefone() + ";" +
             this.getDataDeNascimento();
       
        return MedicosStr;
}}
