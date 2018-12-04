package revisando;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import cap02.Usuario;

public class Revisando {
	
	public static void main(String[] args) {
		
		
		//Filter
		List<Usuario> usuarios = Arrays.asList(
				new Usuario("Victor", 100),
				new Usuario("Ana", 200),
				new Usuario("Heitor", 150)
		);
		
		FilterPattern filter = new Filter();
		List<Usuario> filterUsuario = usuarios
				.stream()
				.filter( u -> filter.filterByNome(u, "Heitor") )
				.sorted(Comparator.comparing(Usuario::getPontos))
				.collect(Collectors.toList());
		
		System.out.print("Usuários filtrados >>> ");
		filterUsuario.forEach( u -> System.out.print( u ));
		
		//Comparator
		Comparator<Usuario> compartorUsuario = ( uFirst, uSecond ) -> 
			uFirst.getNome().compareTo(uSecond.getNome());
			
		usuarios.sort(compartorUsuario);
		
		System.out.print("\n\nUsuários ordenados >>> ");
		usuarios.forEach( u-> System.out.print( u + "\n") );
	}

}
