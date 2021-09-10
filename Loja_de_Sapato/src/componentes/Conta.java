package componentes;

public class Conta {
	private int idConta;
	private String usuario;
	private String senha;
	private int nivel;
	
	public Conta(int idConta, String usuario, String senha, int nivel) {
		super();
		this.idConta = idConta;
		this.usuario = usuario;
		this.senha = senha;
		this.nivel = nivel;
	}

	public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
	
}
