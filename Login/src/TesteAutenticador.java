import static org.junit.Assert.*;

import org.junit.Test;


public class TesteAutenticador {

	@Test
	public void loginComSucesso() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("barros", "123");
		
		assertEquals("barros", u.getLogin());
	}

	@Test(expected= LoginException.class)
	public void loginFalho() throws LoginException {
		Autenticador a = new Autenticador();
		Usuario u = a.logar("barros", "xpto");
	}
	
	@Test
	public void informacaoDoErro() {
		Autenticador a = new Autenticador();
		try {
			Usuario u = a.logar("barros", "xpto");
			fail();
		} catch (LoginException e) {
			assertEquals("barros", e.getLogin());
		}
	}
}
