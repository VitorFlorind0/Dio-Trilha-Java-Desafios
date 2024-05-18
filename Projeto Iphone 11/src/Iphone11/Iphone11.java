package Iphone11;

public class Iphone11 implements ReprodutorMusical, AparelhoTelefonico, NavegadorNaInternet {
    private MeuReprodutor reprodutor;
    private MeuAparelhoTelefonico telefone;
    private MeuNavegadorIOS navegador;

    public Iphone11() {
        this.reprodutor = new MeuReprodutor();
        this.telefone = new MeuAparelhoTelefonico();
        this.navegador = new MeuNavegadorIOS();
    }

    // Métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        reprodutor.tocar();
    }

    @Override
    public void pausar() {
        reprodutor.pausar();
    }

    @Override
    public void selecionarMusica(String musica) {
        reprodutor.selecionarMusica(musica);
    }

    // Métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        telefone.ligar(numero);
    }

    @Override
    public void atender() {
        telefone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        telefone.iniciarCorreioVoz();
    }

    // Métodos da interface NavegadorNaInternet
    @Override
    public void exibirPagina(String url) {
        navegador.exibirPagina(url);
    }

    @Override
    public void adicionarNovaAba() {
        navegador.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        navegador.atualizarPagina();
    }
}
