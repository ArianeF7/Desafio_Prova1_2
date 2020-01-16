
public class Main {
	public static void main(String[] args) {
		
		Gerente g1 = new Gerente("Zacarias", 35, 15000.0);
		Supervisor s1 = new Supervisor("Joanita", 24, 9000.0);
		Vendedor v1 = new Vendedor("Juliosvaldo", 18, 2500.0);
		
		g1.bonificacao();
		s1.bonificacao();
		v1.bonificacao();
		
		
		
	}

}
