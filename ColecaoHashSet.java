import java.util.HashSet;
import java.util.Set;

public class ColecaoHashSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<>();
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);

		// System.out.println(numeros.size());

		// numeros.remove(12);

		// for(Integer elemento : numeros) {
		// 	System.out.println(elemento);
		// }

		// true or false
		System.out.println(numeros.contains(12));
	}
}
