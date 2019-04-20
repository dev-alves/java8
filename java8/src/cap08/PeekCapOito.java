package cap08;

import cap02.Usuario;

public class PeekCapOito {
	
	public static void main(String[] args) {
		
		Usuario.listaDeUsuarios().stream()
			.filter(u -> u.getPontos() > 20)
			.peek(p -> p.setModerador(true))
			.peek(System.out::println)
			.findAny();
		
	}

}
