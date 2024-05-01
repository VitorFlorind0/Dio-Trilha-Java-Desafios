package ContaBanco;

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Digite o Numero: ");
		int numero = scanner.nextInt();
		
		System.out.println("Digite a Agencia: ");
		String agencia = scanner.next();
		
		System.out.println("Digite seu Nome completo: ");
		String nomeCliente = scanner.next();
		
		double saldo = 237.48;
		System.out.println("Ola senhor " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agencia é " + agencia +", conta numero " + numero + " e seu saldo de " + saldo + " ja esta disponivel.");

	}

}
