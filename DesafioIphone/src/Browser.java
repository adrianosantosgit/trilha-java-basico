public class Browser {
    public static void main(String[] args) {
        NavegadorInternet browser = new iPhone();

        browser.exibirPagina("google.com");
        browser.adicionarNovaAba();
        browser.atualizarPagina();
    }
    
}
