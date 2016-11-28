
public class EmbaralhadorFacil implements Embaralhador {
	
	private final int grauDificuldade = 2;

	@Override
	public String embaralhar(String palavra) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = palavra.length(); i > 0; i--) {
			sb.append(palavra.charAt(i-1));
		}
		
		return sb.toString();
	}

	@Override
	public int getGrauDificuldade() {
		return grauDificuldade;
	}

}
