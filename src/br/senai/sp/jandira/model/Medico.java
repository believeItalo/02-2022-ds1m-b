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
    
    
    public Medico(String crm, String nome){
        this.crm = crm;
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
             this.getCrm() + ";" + this.especialidades;
        return MedicosStr;
    
   
}}
