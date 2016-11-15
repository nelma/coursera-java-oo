
public class Principal {

	public static void main(String[] args) {
		a(-100);
		System.out.println("termianndo execução de main");
	}

	public static void a(int i){
		System.out.println("executando a() com "+ i);
		try {
			b(i);
		} catch (Exception e) {
			System.out.println("tratando a exceção:  "+ e.getMessage());
		}
		System.out.println("termianndo execução de a");
	}
	
	public static void b(int b) throws Exception {
		System.out.println("executando b() com "+ b);
		throw new Exception("mensagem");
	}
}
