package cap07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import cap02.Usuario;

/**
 * Podemos usar Collectors para guardar os elementos de um Stream<T>
 * para uma lista. 
 * @author dev-alves
 *
 */
public class CollectorsEStreams {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>();
		for(int i=0; i<10; i++) {
			Usuario user = new Usuario("user"+i, (i*2), false);
			usuarios.add(user);
		}
		
		List<Usuario> usuariosFiltrados =  usuarios.stream()
			.filter( u -> u.getPontos()> 10)
			.collect(Collectors.toList());
		
		System.out.println("Com List");
		usuariosFiltrados.sort(Comparator.comparing(Usuario::getPontos)
				.thenComparing(Usuario::getNome).reversed());
		usuariosFiltrados.forEach(System.out::println);
		
		//ou
		Stream<Usuario> stream = usuarios.stream().filter(u-> u.getPontos() < 10);
		Set<Usuario> set = stream.collect(Collectors.toSet());
		
		System.out.println("\nCom set");
		set.forEach(System.out::println); 
		
		//ou
		HashSet<Usuario> hash = stream.collect(Collectors.toCollection(HashSet::new));
		System.out.println("\nCom hash");
		hash.forEach(System.out::println);
	}

}
