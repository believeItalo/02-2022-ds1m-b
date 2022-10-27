package br.senai.sp.jandira.model;

import javax.swing.JOptionPane;

public class Especialidade {
	
	 
        private String nome;
        private String descricao;
        private static int contador = 100;
        private Integer codigo;
       

        public Especialidade(){
            atualizarCodigo();
        }
        
        public Especialidade(String nome, String descricao) {
            this.nome = nome;
            this.descricao = descricao;
             atualizarCodigo();
          
        }
        public Especialidade(String nome){
            this.nome = nome;
            atualizarCodigo();
        }

        private void atualizarCodigo() {
		this.codigo = contador;
		contador++;
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

        public Integer getCodigo(){
         return codigo;
        
        
        
        }

}
