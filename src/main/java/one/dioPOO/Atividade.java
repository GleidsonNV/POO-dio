package one.dioPOO;

import java.time.LocalDate;

public class Atividade extends Conteudo {

	private LocalDate cargaHoraria;

	public Atividade() {
	}

	public void setCargaHoraria(LocalDate cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public LocalDate getCargaHoraria() {
		return cargaHoraria;
	}

	@Override
	double calculaXP() {
		return getXP_PADRAO()+20d;	
	}
	
	

}
