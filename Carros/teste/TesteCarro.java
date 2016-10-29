import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TesteCarro {
	
	Carro c; 
	
	@Before
	public void inicializaCarro() {
		c = new Carro("teste", 10, 100);
	}
	
	
	@Test
	public void testParadp() {
		assertEquals(0, c.getVelocidade());
	}

	@Test
	public void testAcelerar() {
		c.acelerar();
		assertEquals(10, c.getVelocidade());
	}

	@Test
	public void testFrear() {
		c.acelerar();
		c.frear();
		assertEquals(5, c.getVelocidade());
	}
	
	@Test
	public void testFrearAteZero() {
		c.acelerar();
		c.frear();
		c.frear();
		c.frear();
		c.frear();
		assertEquals(0, c.getVelocidade());
	}
	
	@Test
	public void testAcelerarAteVelocidadeMaxima() {
		
		for(int i = 0; i < 14; i++)
			c.acelerar();
		assertEquals(100, c.getVelocidade());
	}
	
}
