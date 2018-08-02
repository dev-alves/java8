package cap02;

public class Usuario {
	private String nome;
	private int pontos;
	private boolean moderador;
	
	public Usuario() {}
	
	public Usuario(String nome) {
		this.nome = nome;
	}
	
	public Usuario(String nome, int pontos) {
		this.nome = nome;
		this.pontos = pontos;
	}
	
	public Usuario(String nome, int pontos, boolean moderador) {
		super();
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = moderador;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPontos() {
		return pontos;
	}
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
	public boolean isModerador() {
		return moderador;
	}
	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}
	
	public void tornarModerador() {
		this.moderador = true;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}
	
	
}
