package fag;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import fag.objetos.Cadastro_Quartos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		Cadastro_Quartos cadrastro =new Cadastro_Quartos();
		
		System.out.println("Ola, deseja cadastrar quantos Quartos: ");
		int quantidadequartos = scanner.nextInt();
		List<Cadastro_Quartos> listaquartos = new ArrayList<Cadastro_Quartos>();
		
		for (int i = 0; i < quantidadequartos; i++) {
			System.out.println("informe o numero do quarto, tipo de quarto, preço diario e se esta disponivel: ");
			Cadastro_Quartos Quartos = new Cadastro_Quartos(scanner.nextInt(),scanner.next(),scanner.nextDouble(),scanner.next());
			listaquartos.add(Quartos);
		}
		
		for (Cadastro_Quartos cadastro_Quartos : listaquartos) {
			System.out.println(cadastro_Quartos);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
