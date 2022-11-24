package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.DataLine;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    
   
    
    public String getDataDeNascimentcerta(){
    
        String[] separado =  dataDeNascimento.toString().split("-");
        String dataCerta = separado[2] + "/" + separado[1] + "/" + separado[0];
        return dataCerta;
    
    };
    
 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

}
