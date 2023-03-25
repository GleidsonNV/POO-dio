package one.dioPOO;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Unit test for Mentoria class.
 */
public class MentoriaTest 
    
{
	@Test
	 void xpTest() {
		Conteudo mentoriaTest = new Mentoria();
		Assertions.assertEquals(30d, mentoriaTest.calculaXP());
	}


}
