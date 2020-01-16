
public class Vendedor extends Funcionario {
	
	public Vendedor(String _nome, int _idade, Double _salario) {
		super(_nome, _idade, _salario);

	}

	public double bonificacao () {
		System.out.println("O salario do Vendedor(a) " + Vendedor.super.getNome() + " é: " + (Vendedor.super.getSalario() + 3000));
		return getSalario() + 3000;
	}


}
