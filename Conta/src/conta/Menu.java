package conta;

import java.util.Scanner;
import conta.util.Cores;
import conta.controller.contacontroller;
import conta.model.conta;
import conta.model.contacorrente;
import conta.model.contapoupanca;
import java.io.IOException;
import java.util.InputMismatchException;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int Opcao, numero, agencia, tipo, aniversario;
		String titular;
		float saldo, limite;

		contacontroller contas = new contacontroller();
// teste da classe C.C
		contacorrente cc1 = new contacorrente(2, 123, 1, " Jéssica", 10000.0f, 15.0f);
		cc1.visualizar();
		cc1.sacar(11000.0f);
		cc1.depositar(5000.0f);
		cc1.visualizar();

		// teste pounpança
		contapoupanca cp1 = new contapoupanca(3, 123, 2, " Fabiana", 10000.0f, 20);
		cp1.visualizar();
		cp1.sacar(11000.0f);
		cp1.depositar(5000.0f);
		cp1.visualizar();

		int opcao;

		while (true) {

			System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND
					+ "*********************************************");
			System.out.println("                                             ");
			System.out.println("            BANCO COM B DE BRASIL            ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("                                             ");
			System.out.println("             1 - Criar Conta                 ");
			System.out.println("             2 - Listar todas as Contas      ");
			System.out.println("             3 - Buscar Conta por numero     ");
			System.out.println("             4 - Atualizar Dados da Conta    ");
			System.out.println("             5 - Apagar a Conta              ");
			System.out.println("             6 - Sacar                       ");
			System.out.println("             7 - Depositar                   ");
			System.out.println("             8 - Transferir valores          ");
			System.out.println("             9 - Sair                        ");
			System.out.println("                                             ");
			System.out.println("                                             ");
			System.out.println("*********************************************");
			System.out.println("Entre com a opção deseja:                    ");
			System.out.println("                                             ");

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;

			}

			if (opcao == 9) {
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND
						+ "\nBanco com B de Brasil - O seu dinheiro fica travado aqui ☻");
				leia.close();
				System.exit(0);
			}
			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Criar Conta \n\n");

				System.out.println("Digite o numero da agência: ");
				agencia = leia.nextInt();
				System.out.println("Digite o Nome do Titular: ");
				leia.skip("\\R?");
				titular = leia.next();

				do {
					System.out.println("Digite o Tipo de conta (1-cc ou 2-cp): ");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);

				System.out.println("Digite o Salado da conta (R$): ");
				saldo = leia.nextFloat();

				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o Limite de Crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new contacorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));

				}
				case 2 -> {
					System.out.println("Digite o dia de Aniversário da Conta: ");
					aniversario = leia.nextInt();
					contas.cadastrar(new contapoupanca(contas.gerarNumero(), agencia, tipo, titular, saldo, aniversario));
				}
				}

				keyPress();
				break;

			case 2:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Listar todas as contas\n\n");
				
				contas.listarTodas();
				keyPress();
				break;

			case 3:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND
						+ "Consultar dados da conta por número\n\n");
				keyPress();
				break;

			case 4:
				System.out
						.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Atualizar dados da conta\n\n");
				keyPress();
				break;

			case 5:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Apagar conta\n\n");
				keyPress();
				break;

			case 6:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Para Saque\n\n");
				keyPress();
				break;

			case 7:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Para Depósito\n\n");
				keyPress();
				break;

			case 8:
				System.out.println(
						Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "Para transferência entre contas\n\n");
				keyPress();
				break;

			default:
				System.out.println(Cores.TEXT_GREEN_BOLD + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida♪\n");
				keyPress();
				break;
			}
		}

	}

	private static void keyPress() {

		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
	}
}