package revisando;

import cap02.Usuario;

public interface FilterPattern {
	boolean filterByNome(Usuario usuario, String nome);
	boolean filterByPontos(int pontos);
}


