package cap04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import cap02.Usuario;

public class Capitulo04AndThen {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("user1", 1, true);
		Usuario user2 = new Usuario("user2", 2, false);
		Usuario user3 = new Usuario("user3", 3, true);

		List<Usuario> usuarios = Arrays.asList(user1, user2, user3);
		Consumer<Usuario> mostrarMensagem = u -> System.out.println("Mostrando mensagem");
		Consumer<Usuario> comporInstancia = u-> System.out.println(u.getNome());
		
		usuarios.forEach(mostrarMensagem.andThen(comporInstancia));
	}

}
