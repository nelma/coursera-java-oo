
public class EmbaralhadorMedio implements Embaralhador {
	
	private final int grauDificuldade = 5;

	@Override
	public String embaralhar(String palavra) {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < palavra.length(); i++) {
			
			if(i % 2 != 0) {
				sb.append(palavra.charAt(i));//impar
				sb.append(palavra.charAt(i-1));//par
			} 
			else if(i == (palavra.length() - 1)) {
				sb.append(palavra.charAt(i));
			}
		}
		
		return sb.toString();
	}

	@Override
	public int getGrauDificuldade() {
		return grauDificuldade;
	}

}
