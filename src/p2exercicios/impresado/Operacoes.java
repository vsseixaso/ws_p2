package p2exercicios.impresado;

import java.util.Scanner;

public class Operacoes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op;
		while (true) {
			printMenu();
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:
				Jogo.jogar();
				break;
			case 2: 
				historico();
				break;
			default: break;
			}
			if (op == 3) {
				System.out.println("Xau!");
				break;
			}
		}
	}
	
	public static void printMenu() {
		System.out.println("MENU:");
		System.out.println("1) Iniciar Partida\n2) Histórico\n3) Sair\n");
		System.out.print("Sua escolha? ");
		System.out.println();
	}
	
	public static void historico() {
		System.out.println("- " +derrota+ " derrota");
		System.out.println("- " +vitoria+ "vitoria");
	}
}
