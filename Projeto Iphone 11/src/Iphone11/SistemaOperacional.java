package Iphone11;

import java.util.Scanner;

public class SistemaOperacional {
    public static void main(String[] args) {
        Iphone11 iphone = new Iphone11();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selecione a funcionalidade:");
            System.out.println("1. Reprodutor Musical");
            System.out.println("2. Aparelho Telefônico");
            System.out.println("3. Navegador na Internet");
            System.out.println("4. Sair");
            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            switch (escolha) {
                case 1:
                    System.out.println("1. Tocar");
                    System.out.println("2. Pausar");
                    System.out.println("3. Selecionar Música");
                    int escolhaMusica = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaMusica) {
                        case 1:
                            iphone.tocar();
                            break;
                        case 2:
                            iphone.pausar();
                            break;
                        case 3:
                            System.out.print("Digite o nome da música: ");
                            String musica = scanner.nextLine();
                            iphone.selecionarMusica(musica);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. Ligar");
                    System.out.println("2. Atender");
                    System.out.println("3. Iniciar Correio de Voz");
                    int escolhaTelefone = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaTelefone) {
                        case 1:
                            System.out.print("Digite o número: ");
                            String numero = scanner.nextLine();
                            iphone.ligar(numero);
                            break;
                        case 2:
                            iphone.atender();
                            break;
                        case 3:
                            iphone.iniciarCorreioVoz();
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. Exibir Página");
                    System.out.println("2. Adicionar Nova Aba");
                    System.out.println("3. Atualizar Página");
                    int escolhaNavegador = scanner.nextInt();
                    scanner.nextLine(); // Consumir nova linha

                    switch (escolhaNavegador) {
                        case 1:
                            System.out.print("Digite a URL: ");
                            String url = scanner.nextLine();
                            iphone.exibirPagina(url);
                            break;
                        case 2:
                            iphone.adicionarNovaAba();
                            break;
                        case 3:
                            iphone.atualizarPagina();
                            break;
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Escolha inválida.");
                    break;
            }
        }
    }
}
