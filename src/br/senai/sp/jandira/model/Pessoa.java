package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.sound.sampled.DataLine;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.sql.Date;
import java.time.Month;
import static java.time.temporal.TemporalQueries.localDate;

public class Pessoa {

    private String nome;
    private String email;
    private String telefone;
    private LocalDate dataDeNascimento;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
 
   
  
    public String getDataDeNascimento() {
        return dataDeNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
              
            
    }
 

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

    

}
