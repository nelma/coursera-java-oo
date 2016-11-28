import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Before;
import org.junit.Test;


public class TesteIdadeSigno {

	Pessoa p;
	
	@Before
	public void inicializa() {
		p = new Pessoa();
	}
	
	@Test
	public void testeIdadePessoa1() {
		Date dataDeNascimento = new Date(79, 02, 23);
		p.setDataNascimento(dataDeNascimento, 1);
		
		assertEquals(37, p.getIdade());
		assertEquals("Áries", p.getSigno());
	}
	
	@Test
	public void testeIdadePessoa2() {
		Date dataDeNascimento = new Date(65, 06, 10);
		p.setDataNascimento(dataDeNascimento, 1);
		
		assertEquals(51, p.getIdade());
		assertEquals("Câncer", p.getSigno());
	}

	@Test
	public void testeIdadePessoa3() {
		Date dataDeNascimento = new Date(41, 10, 9);
		p.setDataNascimento(dataDeNascimento, 1);
		
		assertEquals(74, p.getIdade());
		assertEquals("Escorpião", p.getSigno());
	}
}
