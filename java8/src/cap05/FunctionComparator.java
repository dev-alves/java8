package cap05;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import cap02.Usuario;

public class FunctionComparator {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("u3", 2, true);
		Usuario usuario2 = new Usuario("u2", 1, false);
		Usuario usuario3 = new Usuario("u1", 3, false);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		Function<Usuario, String> extraiNome = u->u.getNome();
		Comparator<Usuario> comparator = Comparator.comparing(extraiNome);
		
		System.out.println("Ordenando pelo nome");
		usuarios.sort(comparator);
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
		
		//ordenando por pontos
		System.out.println("Ordenando pelos pontos");
		usuarios.sort(Comparator.comparingInt(u->u.getPontos()));
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
	}
}
