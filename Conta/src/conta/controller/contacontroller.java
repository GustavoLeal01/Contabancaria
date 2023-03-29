package conta.controller;

import java.util.ArrayList;

import conta.model.conta;
import conta.repository.contarepository;

public class contacontroller  implements contarepository{

	private ArrayList<conta> listaContas = new ArrayList <conta>();
	int numero = 0;
	
	@Override
	public void procurarPorNumero(int numero) {
		
			
		}
		
	

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(conta conta) {
		listaContas.add(conta);
		System.out.println("\nA Conta número: " + conta.getNumero() + " foi criada com sucesso");
	}

	@Override
	public void atualizar(conta conta) {
		
		
	}

	@Override
	public void deletar(int numero) {
		
		
	}

	@Override
	public void sacar(int numero, float valor) {
		
		
	}

	@Override
	public void depositar(int numero, float valor) {
		
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		
		
	}
public int gerarNumero() {
	return ++ numero;
}
}
