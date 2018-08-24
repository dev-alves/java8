package cap07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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
		
		Double pontuacaoMedia = usuarios.stream()
				.mapToDouble(Usuario::getPontos)
				.average()
				.orElse(0.0);
		System.out.println("Pontuação Média: " + pontuacaoMedia);
		
		//lançando exceptions
		Double pontuacaoException = usuarios.stream()
				.mapToDouble(Usuario::getPontos)
				.average()
				.orElseThrow(IllegalStateException::new);
		System.out.println("PontuaçãoException: " + pontuacaoException);
		
		//número de usuários com mais pontos
		Optional<String> maioresPontuadores = usuarios.stream()
				.max(Comparator.comparingInt(Usuario::getPontos))
				.map(Usuario::getNome);
		
		if(maioresPontuadores.isPresent())
				System.out.println(maioresPontuadores.get());
	}

}
