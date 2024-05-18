package Iphone11;

public interface AparelhoTelefonico {
    void ligar(String numero);
    void atender();
    void iniciarCorreioVoz();
}

class MeuAparelhoTelefonico implements AparelhoTelefonico {
    private boolean chamadaAtiva;

    @Override
    public void ligar(String numero) {
        if (!chamadaAtiva) {
            chamadaAtiva = true;
            System.out.println("LIGANDO PARA: " + numero);
        } else {
            System.out.println("JÁ EXISTE UMA CHAMADA ATIVA.");
        }
    }

    @Override
    public void atender() {
        if (!chamadaAtiva) {
            chamadaAtiva = true;
            System.out.println("ATENDENDO A CHAMADA");
        } else {
            System.out.println("JÁ EXISTE UMA CHAMADA ATIVA.");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        if (!chamadaAtiva) {
            System.out.println("INICIANDO O CORREIO DE VOZ.");
        } else {
            System.out.println("FINALIZANDO A CHAMADA ATUAL ANTES DE INICIAR O CORREIO DE VOZ.");
            chamadaAtiva = false;
        }
    }
}
