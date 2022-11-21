package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico extends Pessoa {
    private static int contador = 100;
    private Integer codigo;
    private String crm;
    private Especialidade especialidades;
    
    
    public Medico(){
     
        atualizarCodigo();
        }
    
      public Medico(Integer codigo, String crm , String nome, String email, String telefone){
              
            this.codigo = contador;
            this.crm = crm;
            setNome(nome);
            setEmail(email);
            setTelefone(telefone);
            
          
            atualizarCodigo();
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
             this.getCrm() + ";" + this.getEmail()+";"+ this.getTelefone();
       
        return MedicosStr;
}}
