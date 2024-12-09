package pilha;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		Stack<String> pilha = new Stack<String>();
		String nome;

		do {

			System.out.println("1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("Escreva o Livro que quer adicionar a pilha: ");
				nome = leia.next();
				pilha.push(nome);
				System.out.println("Livro adicionado");
				break;
			case 2:
				System.out.println("Os Livros presentes na pilha: " + pilha);
				break;
			case 3:
				if(pilha.isEmpty() == true) {
				System.out.println("A pilha esta vazia");
				} else {
					System.out.println("Livro removido " + pilha.pop());
				}
				break;
			default:
				System.out.println("Finalizado");

			}
		} while (opcao != 0);
	}
}