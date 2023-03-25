package one.dioPOO;

public abstract class Conteudo {
	
	private String titulo;
	private String descricao;
	private final double XP_PADRAO = 10;
	
	abstract double calculaXP();
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getXP_PADRAO() {
		return XP_PADRAO;
	}
	
	

}
