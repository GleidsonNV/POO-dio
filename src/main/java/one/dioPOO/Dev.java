package one.dioPOO;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

/*
 * Principal classe do desafio. Nela são relacionadas as classes bootcamp, mentoria e atividade.
 */
public class Dev {
	
	private String nome;
	private Set<Conteudo> inscritos = new LinkedHashSet<Conteudo>();
	private Set<Conteudo> concluidos = new LinkedHashSet<Conteudo>();
	
	public Dev(String nome) {
		this.nome = nome;
		
	}
	
	/*
	 * Retira a primeira mentoria ou atividade do bootcamp e insere na lista de concluidos.
	 */
	public void progredir() {
		Optional<Conteudo> conteudo = this.inscritos.stream().findFirst();
		if(conteudo.isPresent()) {
			this.concluidos.add(conteudo.get());
			this.inscritos.remove(conteudo.get());
		}
		else System.err.println("Nao inscrito em nenhum conteudo.");
	}
	
	/*
	 * Adiciona as atividades e mentorias do bootcamp para o dev.
	 * @param  recebe um tipo Bootcamp
	 */
	public void increverBootcmap(Bootcamp bootcamp){
		this.inscritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
		}
	
	/*
	 * Soma do xp base de todas as atividades e mentorias concluidas.
	 * @return XP total em double
	 */
	public double calcularXPTotal(){
		return this.concluidos.stream().mapToDouble(Conteudo::calculaXP).sum();
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

	public Set<Conteudo> getInscritos() {
		return inscritos;
	}

	public void setInscritos(Set<Conteudo> inscritos) {
		this.inscritos = inscritos;
	}

	public Set<Conteudo> getConcluidos() {
		return concluidos;
	}

	public void setConcluidos(Set<Conteudo> concluidos) {
		this.concluidos = concluidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((concluidos == null) ? 0 : concluidos.hashCode());
		result = prime * result + ((inscritos == null) ? 0 : inscritos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		if (concluidos == null) {
			if (other.concluidos != null)
				return false;
		} else if (!concluidos.equals(other.concluidos))
			return false;
		if (inscritos == null) {
			if (other.inscritos != null)
				return false;
		} else if (!inscritos.equals(other.inscritos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dev [nome=" + nome + ", inscritos=" + inscritos + ", concluidos=" + concluidos + "]";
	}
	
	



	
	

}
