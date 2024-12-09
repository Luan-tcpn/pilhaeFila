package fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		Queue<String> fila = new LinkedList<String>();
		String nome;

		do {

			System.out.println("1 - Adicionar Cliente na fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da fila");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escreva o nome que quer adicionar a fila: ");
				nome = leia.next();
				fila.add(nome);
				System.out.println("Cliente adicionado");
				break;
			case 2:
				System.out.println("Os clientes presentes na fila: " + fila);
				break;
			case 3:
				System.out.println("Elemento removido " + fila.remove());
				break;
			default:
				System.out.println("Finalizado");

			}
		} while (opcao != 0);
	}
}
