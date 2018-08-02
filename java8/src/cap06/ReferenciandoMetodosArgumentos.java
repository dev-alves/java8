package cap06;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import cap02.Usuario;

/**
 * Também podemos referenciar métodos que recebem argumentos
 * @author dev-alves
 *
 */
public class ReferenciandoMetodosArgumentos {
	
	public static void main(String[] args) {
		Usuario user1 = new Usuario("j1", 3, false);
		Usuario user2 = new Usuario("k2", 2, true);
		Usuario user3 = new Usuario("h3", 3, false);
		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		
		usuarios.sort(Comparator.comparing(Usuario::getNome)
				.thenComparing(Usuario::getPontos));
		usuarios.forEach(System.out::println);
	}
}
