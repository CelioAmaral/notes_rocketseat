// package pessoa;

public class TesteDePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.cpf = "99999999999";
		pessoa1.nome = "Celio";
		pessoa1.idade = 33;

		System.out.println(pessoa1.imprimirDadosDaPessoa(1));

		Pessoa pessoa2 = new Pessoa();
		pessoa2.cpf = "33333333333";
		pessoa2.nome = "Amaral";
		pessoa2.idade = 30;

		System.out.println(pessoa2.imprimirDadosDaPessoa(2));
	}
}
