public interface AparelhoTelefonico {
    public static void ligar(String string){
        System.out.println("LIGANDO PARA: " + string);
    }
    public static void atender(){
        System.out.println("EM LIGAÇÃO...");
    }
    public static void iniciarCorreioVoz(){
        System.out.println("CORREIO DE VOZ");
    }
}
