
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		
		p.empilhar("João");
		p.empilhar("Maria ");
		p.empilhar("José");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		

		Object[] arrayElementos = p.getElementos();
		System.out.println(arrayElementos.length);
		arrayElementos[2] = "Outro";
		
		//desempilhando
		System.out.println("----------------");
		System.out.println(p.desempilhar());
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		
		System.out.println(p.getElementos().length);
	}

}
