package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	 private static Integer contador = 100;
        private Integer codigo;
        private String nome;
        private String descricao;

        // Construtores da classe
       

        public Especialidade(){
        
        };
        
        public Especialidade(String nome, String descricao) {
            this.nome = nome;
            this.descricao = descricao;
            this.codigo = contador++;
        }


        // Métodos de acesso aos atributos
        public void setNome(String nome) {

   
                this.nome = nome;
            

        }

        public String getNome() {
            return nome;
        }

        public void setDescricao(String descricao) {
                this.descricao = descricao;
           
            
        }

        public String getDescricao() {
            return this.descricao;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }



}
