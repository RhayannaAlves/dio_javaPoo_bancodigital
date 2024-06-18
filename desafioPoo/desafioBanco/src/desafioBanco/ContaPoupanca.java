package desafioBanco;

public class ContaPoupanca extends Conta{

	public ContaPoupanca(Cliente cliente, String dataAbertura) {
		super(cliente, dataAbertura);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
	

}
