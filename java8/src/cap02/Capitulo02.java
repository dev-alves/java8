package cap02;

import java.util.Arrays;
import java.util.List;

public class Capitulo02 {
	
	public static void main(String[] args) {
		
		Usuario user = new Usuario("vic1", 123, true);
		Usuario user1 = new Usuario("vic2", 124, false);
		Usuario user2 = new Usuario("vic3", 125, true);
		
		/**
		 * Arrays.asList() -> Maneira simles de criar uma list imutável
		 */
		List<Usuario> usuarios = Arrays.asList(user, user1, user2);
		//Consumer<Usuario> mostrador = u -> System.out.println(u.toString());
		
		System.out.println("Imprimindo com o novo método forEach do pacote function do Java 8");
		usuarios.forEach(u->System.out.println(u.toString()));
	}

}
