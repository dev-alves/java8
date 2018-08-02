package cap06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import cap02.Usuario;

public class ReferenciandoMetodosIntancia {

	public static void main(String[] args) {
		
		Usuario victor = new Usuario("nome", 10, true);
		Runnable bloco = victor::tornarModerador;
		bloco.run();
		
		//ou
		Usuario victorLambda = new Usuario("nome", 12, true);
		Runnable bloco2 = () -> victor.tornarModerador();
		bloco2.run();
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("u3", 2, true);
		Usuario usuario2 = new Usuario("g2", 2, false);
		Usuario usuario3 = new Usuario("u1", 3, false);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		usuarios.sort(Comparator.comparing(Usuario::getPontos).thenComparing(Usuario::getNome));
		usuarios.forEach(System.out::println);//utilizando o System::println
	}

}
