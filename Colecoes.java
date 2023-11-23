import java.util.HashMap;
import java.util.Map;

public class Colecoes {

	public static void main(String[] args) {
		// key and value
		// key single
		Map<String, Integer> notas = new HashMap<>();
		notas.put("Celio", 9);
		notas.put("Silva", 10);
		notas.put("Amaral", 10);

		// Integer = var
		// var nota = notas.get("Celio");
		// System.out.println(nota);

		for(Map.Entry<String,Integer> entry : notas.entrySet() ) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			System.out.println("A chave é " + key + " e o valor é " + value);
		}
	}
}
