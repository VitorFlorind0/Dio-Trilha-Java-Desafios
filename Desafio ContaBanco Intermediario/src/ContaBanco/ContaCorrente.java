package ContaBanco;

public class ContaCorrente extends Conta {
	
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);

	
	}

	public void ImprimirExtrato() {
		System.out.println("=== EXTRATO CONTA CORRENTE ===");
		super.ImprimirInfosComuns();

	}

}
