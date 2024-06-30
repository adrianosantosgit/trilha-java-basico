public class Player {
    public static void main(String[] args) {
        ReprodutorMusical player = new iPhone();

        player.selecionarMusica("Imagine - John Lennon");
        player.tocar();
        player.pausar();
    }
}
