
public class Principal {

	public static void main(String[] args) throws Exception {
		a(100);
	}

	public static void a(int i) throws Exception {
		System.out.println("executando a() com "+ 1);
		b(i);
	}
	
	public static void b(int b) throws Exception {
		System.out.println("executando b() com "+ 1);
		throw new Exception("mensagem");
	}
}
