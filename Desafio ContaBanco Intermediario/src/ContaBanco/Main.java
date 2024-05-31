package ContaBanco;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cliente Vitor = new Cliente();
		Vitor.setNome("Vitor");
		Conta cc = new ContaCorrente(Vitor);
		
		System.out.println("Digite o valor do deposito na conta corrente: ");
		double valor = scanner.nextDouble();
		cc.depositar(valor);
		

		System.out.print("Digite o valor de saque da Conta Corrente: ");
        double valorSaque = scanner.nextDouble();
        cc.sacar(valorSaque);
		
        System.out.print("Digite o valor de transferência da Conta Corrente para a Poupança: ");
        Conta cp = new ContaPoupanca(Vitor);
        double valorTransferencia = scanner.nextDouble();
        cc.transferir(valorTransferencia, cp);
		
        System.out.println("\nExtrato da Conta Corrente:");
        cc.ImprimirExtrato();
        
        System.out.println("\nExtrato da Conta Poupança:");
        cp.ImprimirExtrato();
        
        scanner.close();
	}
}
