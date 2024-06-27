public interface ReprodutorMusical {
    public static void tocar(){
        System.out.println("TOCANDO MÚSICA");
    }
    public static void pausar(){
        System.out.println("PAUSANDO MÚSICA");
    }
    public static void selecionarMusica(String string){
        System.out.println("SELECIONANDO MÚSICA" + string);
    }
}
