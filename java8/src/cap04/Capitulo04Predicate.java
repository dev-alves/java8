package cap04;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import cap02.Usuario;

public class Capitulo04Predicate {
	
	public static void main(String[] args) {
		
		Usuario user1 = new Usuario("user1", 1, true);
		Usuario user2 = new Usuario("user2", 2, false);
		Usuario user3 = new Usuario("user3", 3, true);
		
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(user3);
		
		Predicate<Usuario> predicate = p ->  p.isModerador() ;
		
		//aguarda um Predicate como parâmetro
		usuarios.removeIf(predicate); // ou usuarios.removeIf(u->u.isModerador());
		//aguarda um Consumer como parâmetro
		usuarios.forEach(u-> System.out.println(u.getNome()));
		
	}

}
