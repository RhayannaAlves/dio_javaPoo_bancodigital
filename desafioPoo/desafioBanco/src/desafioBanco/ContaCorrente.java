package desafioBanco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente, String dataAbertura) {
		super(cliente, dataAbertura);
	}
 
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}


}
