package ContaBanco;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}

	public void ImprimirExtrato() {

		System.out.println("=== EXTRATO CONTA POUPANCA ===");
		super.ImprimirInfosComuns();
	}
}
