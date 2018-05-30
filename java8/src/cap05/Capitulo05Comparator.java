package cap05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cap02.Usuario;

public class Capitulo05Comparator {
	
	public static void main(String[] args) {
		
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare (Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("u3", 1, true);
		Usuario usuario2 = new Usuario("u2", 2, false);
		Usuario usuario3 = new Usuario("u1", 3, false);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		
		Collections.sort(usuarios, comparator);
		usuarios.forEach(u-> System.out.println(u.toString()));
	}

}
