import static org.junit.Assert.*;

import org.junit.Test;


public class TesteEmbaralhador {

	@Test
	public void testEmbaralhadorFacil() {
		EmbaralhadorFacil ef = new EmbaralhadorFacil();
		assertEquals("ODNUM", ef.embaralhar("MUNDO"));
	}
	
	@Test
	public void testEmbaralhadorMedio() {
		EmbaralhadorMedio em = new EmbaralhadorMedio();
		assertEquals("UMDNO", em.embaralhar("MUNDO"));
	}


}
