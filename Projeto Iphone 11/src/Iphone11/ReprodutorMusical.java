package Iphone11;

public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

class MeuReprodutor implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        if (musicaAtual != null) {
            System.out.println("TOCANDO MUSICA " + musicaAtual);
        } else {
            System.out.println("NENHUMA MUSICA SELECIONADA.");
        }
    }

    @Override
    public void pausar() {
        if (musicaAtual != null) {
            System.out.println("PAUSANDO A MUSICA " + musicaAtual);
        } else {
            System.out.println("NENHUMA MUSICA TOCANDO");
        }
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("MUSICA SELECIONADA " + musica);
    }
}