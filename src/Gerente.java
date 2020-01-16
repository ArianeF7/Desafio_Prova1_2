
public class Gerente extends Funcionario {
	
	public Gerente(String _nome, int _idade, Double _salario) {
		super(_nome, _idade, _salario);
		
	}

	public double bonificacao () {
		System.out.println("O salario do(a) Gerente " + Gerente.super.getNome() + " é: " + (Gerente.super.getSalario() + 10000));
		return getSalario() + 10000;
	}

}
