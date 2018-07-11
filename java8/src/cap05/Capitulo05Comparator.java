package cap05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import cap02.Usuario;

public class Capitulo05Comparator {
	
	public static void main(String[] args) {
		
		//com classes anônimas
		Comparator<Usuario> comparator = new Comparator<Usuario>() {
			public int compare (Usuario u1, Usuario u2) {
				return u1.getNome().compareTo(u2.getNome());
			}
		};
		
		//ou expressões lambdas
		
		Comparator<Usuario> compLambda = (u1, u2) -> u1.getNome().compareTo(u2.getNome());
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		Usuario usuario1 = new Usuario("u3", 1, true);
		Usuario usuario2 = new Usuario("u2", 2, false);
		Usuario usuario3 = new Usuario("u1", 3, false);
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		usuarios.add(usuario3);
		
		
		Collections.sort(usuarios, comparator);
		usuarios.forEach(u-> System.out.println(u.toString()));
		
		System.out.println("\nCom lambda!");
		Collections.sort(usuarios, compLambda);
		usuarios.forEach(u->System.out.println(u.toString()));
		
		//ou tudo em uma linha com expressões lambda!
		
		Collections.sort(usuarios, (u1,u2)->u1.getNome().compareTo(u2.getNome()));
		System.out.println("\nTudo em uma linha!");
		usuarios.forEach(u->System.out.println(u.toString()));
		
		//enxugando código utilizando o sort do List!
		usuarios.sort((u1, u2)-> u1.getNome().compareTo(u2.getNome()));
		System.out.println("\nEnxugando código utilizando o sort do List!");
		usuarios.forEach(u->System.out.println(u.toString()));
		
		
		//O método estático 'comparing' só funciona se passar um lambda que devolve um comprable 
		//enxugando ainda mais! :D
		usuarios.sort(Comparator.comparing(u -> u.getNome()));
		System.out.println("\nEnxugando código ainda mais!!");
		usuarios.forEach(u->System.out.println(u.toString()));
		
		
		List<Integer> numbers = Arrays.asList(1, 10, 9, 2, 3, 5, 8);
		numbers.sort(Comparator.naturalOrder()); //Retona um comparator que compara com objetos Comparable em ordem natural (crescente)
		System.out.println(numbers);
	}

}
