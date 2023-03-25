package one.dioPOO;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Classe que contem as mentorias e atividades do bootcamp
 *
 */
public class Bootcamp 
{
   
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
    private String nome;
    private String descricao;
    private Set<Conteudo> conteudos = new LinkedHashSet<Conteudo>();
    private Set<Dev> devs = new HashSet<Dev>();
    
    
    
	public Bootcamp() {
	
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public Set<Dev> getDevs() {
		return devs;
	}

	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}

	public LocalDate getDataFinal() {
		return dataFinal;
	}

	public LocalDate getDataInicial() {
		return dataInicial;
	}
	
	

	public Set<Conteudo> getConteudos() {
		return conteudos;
	}

	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos = conteudos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
		result = prime * result + ((devs == null) ? 0 : devs.hashCode());
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
		Bootcamp other = (Bootcamp) obj;
		if (conteudos == null) {
			if (other.conteudos != null)
				return false;
		} else if (!conteudos.equals(other.conteudos))
			return false;
		if (devs == null) {
			if (other.devs != null)
				return false;
		} else if (!devs.equals(other.devs))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bootcamp [dataInicial=" + dataInicial + ", dataFinal=" + dataFinal + ", nome=" + nome + ", descricao="
				+ descricao + ", conteudos=" + conteudos + ", devs=" + devs + "]";
	}

	
    
    
}
