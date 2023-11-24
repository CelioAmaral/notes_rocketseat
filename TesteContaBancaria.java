// package conta;

public class TesteContaBancaria {

	public static void main(String[] args) {
		ContaBancaria contaBancaria1 = new ContaBancaria();
		contaBancaria1.numero = "1234";
		contaBancaria1.titular = "Jose";
		contaBancaria1.saldo = 100;

		contaBancaria1.depositar(50);
		contaBancaria1.sacar(100);
	}
}

// package conta;
// encapsulamento

//public class TesteContaBancaria {

//	public static void main(String[] args) {
//		ContaBancaria contaBancaria1 = new ContaBancaria();
//		contaBancaria1.setNumero("1234");
//		contaBancaria1.setTitular("Jose");

//		contaBancaria1.depositar(150);
//		contaBancaria1.sacar(100);
//	}
//}
