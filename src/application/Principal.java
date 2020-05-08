package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Games;
import entities.Store;

public class Principal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Store[] vectorStore = new Store[3];
		Games[] vectorgame = new Games[50];
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int x = 0;
		do {
			System.out.println("MENU PRINCIPAL : \n1 - Cadastrar jogo\n2 - Adquirir unidades\n3 - Saida de unidades\n4 - Atualizar quantidade minima\n5 - Editar jogo\n6 - Menu relatorios\n0 - Sair\n");
			int resp = sc.nextInt();
			switch (resp) {
			case 1: {
				System.out.print("Codigo : ");
				int code = sc.nextInt();
				sc.nextLine();
				for (int i = 0; i < vectorgame.length; i++) {
					if (code != vectorgame[i].getCode()) {
						System.out.print("Nome : ");
						String name = sc.nextLine();
						System.out.print("Custo : ");
						float costPerUnity = sc.nextLong();
						vectorgame[cont] = new Games(name, code, costPerUnity);
						System.out.println("Inserir unidades do jogo em uma loja? [1-sim, 0-não] ");
						int resp2 = sc.nextInt();
						System.out.print("Digite a quantidade ");
						int quant = sc.nextInt();
						if (resp2 == 1) {
							vectorStore[cont] = new Store(vectorgame[cont++], quant);
						}
					}else {
						System.out.println("codigo existente ou invalido");
					}
				}
				cont++;
				break;
			}
			case 2: {
				System.out.println("not yet");
				break;
			}
			case 3: {
				System.out.println("not yet");
				break;
			}
			case 4: {
				System.out.println("not yet");
				break;
			}
			case 5: {
				System.out.println("not yet");
				break;
			}
			case 6: {
				for (int i = 0; i < cont; i++) {
					System.out.println(vectorgame[i]);
				}
				break;
			}
			case 0: {
				System.out.println("Finalizado!");
				x++;
				break;
			}
			default:
				// throw new IllegalArgumentException("Unexpected value: " + key);
				break;
			}

		} while (x == 0);
		sc.close();
	}

}
