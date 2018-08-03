package cap07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import cap02.Usuario;

public class StreamsECollectors {
	
	public static void main(String[] args) {
		
		
		List<Usuario> usuarios = new ArrayList<>();
		
		for(int i=0; i<10; i++) {
			Usuario user = new Usuario("user"+i, (i*2), false);
			usuarios.add(user);
		}
		
		
		usuarios.forEach(System.out::println);
		
		//Tornando em moderadores os três usuários com mais pontos
		usuarios.sort(Comparator.comparing(Usuario::getPontos).reversed());
		usuarios.subList(0, 3).forEach(Usuario::tornarModerador);
		usuarios.forEach(System.out::println);
		
		//filtrando usuários com mais de 12 pontos
		System.out.println("filtrando usuários com mais de 100 pontos");
		Stream<Usuario> streamUsuario = usuarios.stream().filter(u-> u.getPontos() > 12);//um stream devolve um stream, exemplo
		streamUsuario.forEach(System.out::println);
		
		//ou
		usuarios.stream()
			.filter(u->u.getPontos() > 12)
			.forEach(Usuario::tornarModerador);
		
		usuarios.forEach(System.out::println);
		
		//Obs: O Stream não tem efeito colateral sobre a coleção que o originou
	}

}
