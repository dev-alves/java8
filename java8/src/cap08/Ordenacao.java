package cap08;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import cap02.Usuario;

public class Ordenacao {
	
	public static void main(String[] args) {
		List<Usuario> usuarios = Usuario.listaDeUsuarios();
		
		//ordenar por nome
		Usuario.listaDeUsuarios()
		.sort(Comparator.comparing(Usuario::getNome));
		
		//ordenar e filtrar
		List<Usuario> usuariosFiltrados = usuarios.stream()
			.filter( u -> u.getPontos() > 30)
			.sorted(Comparator.comparingInt(Usuario::getPontos)
					.thenComparing(Usuario::getNome))
			.collect(Collectors.toList());
		
		usuariosFiltrados.forEach( u -> 
			System.out.println("Nome => " + u.getNome() + " Ponto => " + u.getPontos()));
	}
}
