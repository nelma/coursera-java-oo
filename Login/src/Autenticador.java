
public class Autenticador {

	public Usuario logar(String login, String senha) throws LoginException {
		if(login.equals("barros") && senha.equals("123")) {
			return new Usuario(login);
		}
		throw new LoginException("O usuario ou senha não batem", login);
	}
}
