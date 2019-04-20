package cap07;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

import cap02.Usuario;

public class OptionalMetodos {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = Usuario.listaDeUsuarios();
		usuarios.forEach(System.out::println);
		
		///calculando a média
		OptionalDouble optionalDouble = usuarios.stream()
				.mapToDouble(Usuario::getPontos)
				.average();
		
		// caso o optioanlDouble fosse 0, exception: NoSuchElementException
		double media = optionalDouble.orElse(0.0);
		System.out.println("Média => " + media);
		
		//usuário com maior quantidade de pontos;
		Optional<Usuario> max = usuarios.stream()
				.max(Comparator.comparingInt(Usuario::getPontos));
		System.out.println("max => " + max.get().getNome());
		
		//ou podemos fazer da seguinte forma
		List<Usuario> usuariosAux = usuarios;
		usuariosAux.removeIf( u -> u.getPontos() > 0 );
		usuariosAux.stream()
			.mapToInt(Usuario::getPontos)
			.average()
			.orElseThrow(IllegalStateException::new);
	}

}
