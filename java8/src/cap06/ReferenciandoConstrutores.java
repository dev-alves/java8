package cap06;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Supplier;
import java.util.function.ToIntBiFunction;

import cap02.Usuario;

public class ReferenciandoConstrutores {
	
	public static void main(String[] args) {
		Supplier<Usuario> criadorDeUsuario = Usuario::new; //para construtores default
		Usuario novoUsuario = criadorDeUsuario.get(); //criando uma novo instância da classe
		
		/** Para classes que possuem um construtor com um único parâmetro
		 * Function<Tipo_de_dado, Classe> = Classe::new;
		 */
		Function<String, Usuario> construtorUmComParametro = Usuario::new;
		Usuario victor = construtorUmComParametro.apply("Victor como um parâmetro"); //apply aplica o valor ao atributo do construtor
		System.out.println(victor.getNome());
		
		/**
		 * Para classe que possuem um construtor com dois parâmetros
		 */
		BiFunction<String, Integer, Usuario> construtorComParametros = Usuario::new;
		Usuario victorDoisParametros = construtorComParametros.apply("Victor dois parâmetros", 10);
		System.out.println(victorDoisParametros.getNome());
		
		/**
		 * Evitando o auto boxing
		 */
		BiFunction<Integer, Integer, Integer> max = Math::max;
		ToIntBiFunction<Integer, Integer> maxToInt = Math::max; //evitando o unboxing de retorno
		IntBinaryOperator maxBinaryOperator = Math::max;
	}

}
