package one.dioPOO;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
	
	
	private LocalDate dataMentoria;
	
	
	public Mentoria() {
	}



	public LocalDate getDataMentoria() {
		return dataMentoria;
	}


	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}



	@Override
	double calculaXP() {
		return getXP_PADRAO()+20d;	
	}
	
	
	
	

}
