package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteArrayList {

	public static void main(String[] args) { // arguments
		
		PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "Basic");
		PlanoDeSaude plano2 = new PlanoDeSaude("Allianz", "Bronze");
		PlanoDeSaude plano3 = new PlanoDeSaude("Unimed", "Prata");
		PlanoDeSaude plano4 = new PlanoDeSaude("Notredame", "Advanced");
		
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();
		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);
		planos.add(plano4);
		planos.add(plano1);
		planos.add(plano3);
		
		int i = 0;
		
		while (i < planos.size()) {
			System.out.println(planos.get(i).getOperadora());
			i++;
		}
		
		System.out.println("Saiu do looping!!");
		
		// Looping FOR
//		for(contador;condição;acumulador) {
//			
//		}
		System.out.println("------------ UTILIZANDO FOR -----------------");
		for(int contador = 0; contador < planos.size(); contador++) {
			System.out.println(planos.get(contador).getOperadora());
		}
		
		System.out.println("------------- FOR EACH - PARA CADA ----------------------");
		// Iteração em listas - ArrayList<>
		for(PlanoDeSaude plano : planos) {
			System.out.println(plano.getOperadora());
		}
		
		// Criar 3 especialidades, guardar as especialidades em um arraylist
		// e exibir o nome das especialides usando for each
		
		
		
	}

}
