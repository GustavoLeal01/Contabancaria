package conta.model;

public class contapoupanca  extends conta {

	private int aniversario;
	
	public contapoupanca(int numero, int agencia, int tipo, String titular, float saldo, int aniversario) {
		super(numero, agencia, tipo, titular, saldo);
		
	}

	public int getAniversario() {
		return aniversario;
	}

	public void setAniversario(int aniversario) {
		this.aniversario = aniversario;
	}

	@Override
public void visualizar() {
		super.visualizar();
		System.out.println("Aniversario de conta: " + this.aniversario);
	}

}
