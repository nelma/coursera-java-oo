
public class Principal {

	public static void main(String[] args) {
		Pilha p = new Pilha(10);
		
		p.empilhar("João");
		p.empilhar("Maria ");
		p.empilhar("José");
		
		System.out.println(p.topo());
		System.out.println(p.tamanho());
		
		//p.setTopo(6);
		
		//desempilhando
		System.out.println("----------------");
		System.out.println(p.desempilhar().toString().toUpperCase());
		System.out.println(p.topo().toString().toUpperCase());
		System.out.println(p.tamanho());
		
	}

}
