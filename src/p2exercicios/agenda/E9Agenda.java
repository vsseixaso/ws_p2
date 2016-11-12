package p2exercicios.agenda;

import java.util.Scanner;

public class E9Agenda {

	public static void main(String[] args) {
		System.out.println("(C)ADASTRAR | (I)MPRIMIR | (P)ROCURAR | (A)PAGAR | (S)AIR");
		Scanner sc = new Scanner(System.in);
		String[] nomes = new String[1000];
		String[] tels = new String[1000];
		int pos = 0;
		String op = sc.nextLine();
				
		while (!op.equals("S")) {
			
			if (op.equals("C")) {
				nomes[pos] = sc.nextLine();
				tels[pos] = sc.nextLine();
				pos++;
				System.out.println("(C)ADASTRAR | (I)MPRIMIR | (P)ROCURAR | (A)PAGAR | (S)AIR");
			}
			else if (op.equals("I")) {
				for (int i = 0; i < pos; i++) {
					System.out.println(i + ". " + nomes[i] + " " + tels[i]);
				}
				System.out.println("(C)ADASTRAR | (I)MPRIMIR | (P)ROCURAR | (A)PAGAR | (S)AIR");
			}
			else if (op.equals("P")) {
				String n = sc.nextLine();
				for (int i = 0; i < pos; i++) {
					if (n.equals(nomes[i])) {
						System.out.println(tels[i]);
						break;
					}
				}
				System.out.println("(C)ADASTRAR | (I)MPRIMIR | (P)ROCURAR | (A)PAGAR | (S)AIR");
			}
			else if (op.equals("A")) {
				int indice = sc.nextInt();
				for (int i = indice; i < pos; i++) {
					nomes[i] = nomes[i+1];
					tels[i] = tels[i+1];
				}
				pos--;
				System.out.println("(C)ADASTRAR | (I)MPRIMIR | (P)ROCURAR | (A)PAGAR | (S)AIR");
			}
			op = sc.nextLine();
		}
		sc.close();
	}

}
