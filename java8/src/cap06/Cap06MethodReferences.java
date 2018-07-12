package cap06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import cap02.Usuario;

public class Cap06MethodReferences {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("u3", 2, true);
		Usuario usuario2 = new Usuario("u2", 1, false);
		Usuario usuario3 = new Usuario("u1", 3, false);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		//usuarios.forEach(u->u.tornarModerador());
		usuarios.forEach(Usuario::tornarModerador); //Usuario::tornarModerador -> method references
		usuarios.forEach(u->System.out.println(u.getNome()+"\n" + u.isModerador()));
		
		usuarios.sort(Comparator.comparing(Usuario::getNome));
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
		
		//ou
		
		Function<Usuario, String> byName = Usuario::getNome;
		usuarios.sort(Comparator.comparing(byName));
		
		
		//ordena pra mim pelos pontos e, se tiver empate, ordene pelo nome!
		System.out.println("Ordenação pelos pontos, caso haja empate, ordene pelo nome");
		usuarios.sort(Comparator.comparingInt(Usuario::getPontos)
				.thenComparing(Usuario::getNome));
		
	
		//ordena pra mim, onde, todos os objetos que estão nulo, ficarão no final da lista
		//e todos serão ordenados pelos nomes
		System.out.println("Ordenando pelo nome!");
		usuarios.sort(Comparator.nullsLast(Comparator.comparing(Usuario::getNome)));
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
		
		//ordenando na ordem reversa
		System.out.println("Ordem reversa");
		usuarios.sort(Comparator.comparing(Usuario::getNome).reversed());
		usuarios.forEach(usuario -> System.out.println(usuario.getNome()));
	}
	
}
