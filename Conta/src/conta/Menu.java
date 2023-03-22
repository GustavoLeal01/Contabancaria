package conta;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner(System.in);

int opcao;

while (true) {
	
	System.out.println("********************************************");
	System.out.println("                                            ");
	System.out.println("            BANCO COM B DE BRASIL           ");
	System.out.println("                                            ");
	System.out.println("********************************************");
	System.out.println("                                            ");
	System.out.println("             1 - Criar Conta                ");
	System.out.println("             2 - Listar todas as Contas     ");
	System.out.println("             3 - Buscar Conta por numero"     );
	System.out.println("             4 - Atualizar Dados da Conta"    );
	System.out.println("             5 - Apagar a Conta"              );
	System.out.println("             6 - Sacar"                       );
	System.out.println("             7 - Depositar"                   );
	System.out.println("             8 - Transferir valores entre contas"   );
	System.out.println("             9 - Sair");
	System.out.println("                                            ");
	System.out.println("                                            ");
	System.out.println("********************************************");
	System.out.println("Entre com a opção deseja:");
	System.out.println("********************************************");
	
	opcao =  leia.nextInt();
	
	if (opcao ==9) {
		System.out.println("\nBanco com B de Brasil - O seu dinheiro fica travado aqui ☻");
	leia.close();
	System.exit(0);
	}
	switch (opcao) {
	case 1:
		System.out.println("Criar Conta \n\n");	
		break;

	case 2: System.out.println("Listar todas as contas\n\n");
	break;
	
	case 3: System.out.println("Consultar dados da conta por número\n\n");
	break;
	
	case 4: System.out.println("Atualizar dados da conta\n\n");
	break;
	
	case 5: System.out.println("Apagar conta\n\n");
	break;
	
	case 6: System.out.println("Para Saque\n\n");
	break;
	
	case 7: System.out.println("Para Depósito\n\n");
	break;
	
	case 8: System.out.println("Para transferência entre contas\n\n");
	break;
	
	case 9: System.out.println("\nOpção Inválida♪\n");
	break;
	}
}

	}

}
