import java.util.Date;


public class Pessoa {

	private Date dataDeNascimento;
	private int valor;

	public void setDataNascimento(Date dataDeNascimento, int valor) {
		this.dataDeNascimento = dataDeNascimento;
		this.valor = valor;
	}
	
	@SuppressWarnings("deprecation")
	public int getIdade() {
		int idade = new Date().getYear() - dataDeNascimento.getYear();
		if(valor != 0) {
			Relogio rel = new Relogio();
			Date dataAtual = new Date(rel.agora());
			if(dataAtual.getMonth() <= dataDeNascimento.getMonth()) {
				idade -= 1;
			}
		}
		
		return idade;
	}
	
	@SuppressWarnings("deprecation")
	public String getSigno() {
		int diaNascimento = dataDeNascimento.getDate();
		int mesNascimento = dataDeNascimento.getMonth() + 1;
		String signo = null;
		
		if((diaNascimento >= 21 && mesNascimento == 3) || (diaNascimento <= 20 && mesNascimento == 4)) {
			signo = "Áries";
		}
		else if((diaNascimento >= 21 && mesNascimento == 4) || (diaNascimento <= 20 && mesNascimento == 5)) {
			signo = "Touro";
		}
		else if((diaNascimento >= 21 && mesNascimento == 5) || (diaNascimento <= 20 && mesNascimento == 6)) {
			signo = "Gêmeos";
		}
		else if((diaNascimento >= 21 && mesNascimento == 6) || (diaNascimento <= 21 && mesNascimento == 7)) {
			signo = "Câncer";
		}	
		else if((diaNascimento >= 22 && mesNascimento == 7) || (diaNascimento <= 21 && mesNascimento == 8)) {
			signo = "Leão";
		}
		else if((diaNascimento >= 23 && mesNascimento == 8) || (diaNascimento <= 22 && mesNascimento == 9)) {
			signo = "Virgem";
		}
		else if((diaNascimento >= 23 && mesNascimento == 9) || (diaNascimento <= 22 && mesNascimento == 10)) {
			signo = "Libra";
		}
		else if((diaNascimento >= 23 && mesNascimento == 10) || (diaNascimento <= 21 && mesNascimento == 11)) {
			signo = "Escorpião";
		}
		else if((diaNascimento >= 22 && mesNascimento == 11) || (diaNascimento <= 21 && mesNascimento == 12)) {
			signo = "Sagitário";
		}
		else if((diaNascimento >= 22 && mesNascimento == 12) || (diaNascimento <= 20 && mesNascimento == 1)) {
			signo = "Capricórnio";
		}
		else if((diaNascimento >= 21 && mesNascimento == 1) || (diaNascimento <= 19 && mesNascimento == 2)) {
			signo = "Aquário";
		}
		else if((diaNascimento >= 20 && mesNascimento == 2) || (diaNascimento <= 20 && mesNascimento == 3)) {
			signo = "Peixes";
		}
		
		return signo;
	}
}
