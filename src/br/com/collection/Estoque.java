package br.com.collection;

import java.util.ArrayList;

import java.util.Collections;

public class Estoque {

		public static void main(String[] args) {
			
			
			String arroz = "Arroz";
			String feijao = "Feijao";
			String batata = "Batata";
			String macarrao = "Macarr�o";
			
		
			ArrayList<String> estoque = new ArrayList<>();
			
		
			estoque.add(arroz);
			estoque.add(feijao);
			estoque.add(batata);
			estoque.add(macarrao);
			
		
			System.out.println(estoque);
			
			
			System.out.println("========================");
		
			System.out.println("Removendo item do estoque..");
			System.out.println("========================");
			estoque.remove(0);
			System.out.println(estoque);
			System.out.println("========================");
			System.out.println("Estoque atualizado");
			System.out.println("========================");
		
			
			for(String i: estoque) {  
				System.out.println("Estoque: " + i);
				}
			
		
			String feijao1 =estoque.get(0);
			System.out.println("========================");
			System.out.println("O primeiro item do estoque  �: " + feijao1);
			
			String batata1 =estoque.get(1);
			System.out.println("========================");
			System.out.println("O Segundo item do estoque �: " + batata1);
			
			String macarrao1 =estoque.get(2);
			System.out.println("========================");
			System.out.println("O terceiro item do estoque �: " + macarrao1);
			
			
			System.out.println("========================");
			System.out.println(" A quantidade de item no estoque �: " + estoque.size());
		
		
		}
		

	}


