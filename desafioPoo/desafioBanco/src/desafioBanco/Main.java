package desafioBanco;

public class Main {
	public static void main(String[] args) {
		Cliente maria = new Cliente();
		maria.setNome("Maria");
		
		Conta cc = new ContaCorrente(maria, "01/06/2024");
		Conta poupanca = new ContaPoupanca(maria, "01/06/2024");
		
		cc.depositar(200);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		System.out.println("=====================================");
		cc.encerrarConta();
		if (!cc.isAtiva()) {
            System.out.println("Conta Corrente encerrada com sucesso.");
        } else {
            System.out.println("Erro ao encerrar a Conta Corrente.");
        }
		
		poupanca.encerrarConta();
		if (!poupanca.isAtiva()) {
            System.out.println("Conta Poupança encerrada com sucesso.");
        } else {
            System.out.println("Erro ao encerrar a Conta Poupança.");
        }
	}

}
