package revisando;

import cap02.Usuario;

public class Filter implements FilterPattern {

	@Override
	public boolean filterByNome(Usuario u, String nome) {
		return u.getNome().equals(nome);
	}

	@Override
	public boolean filterByPontos(int pontos) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
