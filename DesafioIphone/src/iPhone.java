public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("MUSICA SELECIONADA: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MUSICA");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("LIGANDO PARA" + numero);
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO LIGAÇÃO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("CORREIO DE VOZ");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PÁGINA: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA");
    }

}

