package cap07;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import cap02.Usuario;

public class IntStreamFamiliaStream {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = new ArrayList<>();
		for(int i=0; i<10; i++) {
			Usuario user = new Usuario("user"+i, (i*2), false);
			usuarios.add(user);
		}
		
		//evitando autoboxing
		IntStream pontos = usuarios.stream()
				.mapToInt(Usuario::getPontos);
		pontos.forEach(System.out::println);
		
		//obtendo a média
		Double media = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.average()
				.getAsDouble();
		System.out.println("Média: " + media);
	}

}
