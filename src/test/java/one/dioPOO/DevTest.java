package one.dioPOO;

import java.time.LocalDate;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class DevTest {
	
	private static Atividade atividadeTest = new Atividade();
	private static Dev devTest = new Dev("Joao");
	private static Bootcamp bootcampTest = new Bootcamp();
	
	@BeforeAll
	static void inscreverTest() {
		bootcampTest.setNome("bootcamp Test");
		bootcampTest.setDescricao("Junit test");
		
		atividadeTest.setTitulo("Junit");
		atividadeTest.setDescricao("Junit Test");
		atividadeTest.setCargaHoraria(LocalDate.of(2023,03,24));
		
		bootcampTest.getConteudos().add(atividadeTest);
		
		devTest.increverBootcmap(bootcampTest);
	}

	@Test
	void progredirTest() {
		
		devTest.progredir();
		
		Assertions.assertEquals(1,devTest.getConcluidos().size());
		
	}
	
	@AfterAll
	static void calculaXpTotalTest() {
		Assertions.assertEquals(30d, devTest.calcularXPTotal());
	}
}
