package Iphone11;

import java.util.ArrayList;
import java.util.List;

public interface NavegadorNaInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class MeuNavegadorIOS implements NavegadorNaInternet {
    private List<String> abas;
    private int abaAtual;

    public MeuNavegadorIOS() {
        this.abas = new ArrayList<>();
        this.abaAtual = -1;
        adicionarNovaAba(); // Inicia com uma aba aberta
    }

    @Override
    public void exibirPagina(String url) {
        if (abaAtual >= 0 && abaAtual < abas.size()) {
            abas.set(abaAtual, url);
            System.out.println("EXIBINDO A PAGINA " + url + " NA ABA " + (abaAtual + 1));
        } else {
            System.out.println("NENHUMA ABA DISPONIVEL PARA EXIBIR A PAGINA.");
        }
    }

    @Override
    public void adicionarNovaAba() {
        abas.add("PÁGINA EM BRANCO");
        abaAtual = abas.size() - 1;
        System.out.println("NOVA ABA ACIDIONADA. ABA ATUAL: " + (abaAtual + 1));
    }

    @Override
    public void atualizarPagina() {
        if (abaAtual >= 0 && abaAtual < abas.size()) {
            System.out.println("ATUALIZANDO PAGINA: " + abas.get(abaAtual) + " NA ABA " + (abaAtual + 1));
        } else {
            System.out.println("NENHUMA ABA DISPONIVEL PARA ATUALIZAR.");
        }
    }
}