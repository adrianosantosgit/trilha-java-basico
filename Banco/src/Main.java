
public class Main {

	public static void main(String[] args) {
		
		Cliente adriano = new Cliente();
		adriano.setNome("Adriano");
		
		
		Conta cc = new ContaCorrente(adriano);
		cc.depositar(100);
		
		Conta cp = new ContaPoupanca(adriano);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc.transferir(100, cp);
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();

	}

}
