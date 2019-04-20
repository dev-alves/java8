package cap08;

import java.util.List;
import java.util.function.IntBinaryOperator;

import cap02.Usuario;

public class OperacoesDeReducao {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarios = Usuario.listaDeUsuarios();
		double pontuacaoMedia = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.average()
				.getAsDouble();
		
		System.out.println(pontuacaoMedia);
		
		// utilizando o reduce
		
		IntBinaryOperator acum = (a, b) -> a + b;
		
		double pontuacaoMediaReduce = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(0, acum);
		
		System.out.println(pontuacaoMediaReduce);
		
		// evoluindo
		
		double pontuacaoMediaPorMethodReference = usuarios.stream()
				.mapToInt(Usuario::getPontos)
				.reduce(0, Integer::sum);
		
		System.out.println(pontuacaoMediaPorMethodReference);
		
	}
}
