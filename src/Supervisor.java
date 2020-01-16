
public class Supervisor extends Funcionario {
	
	public Supervisor(String _nome, int _idade, Double _salario) {
		super(_nome, _idade, _salario);
		
	}

	public double bonificacao () {
		System.out.println("O salario do Supervisor(a) " + Supervisor.super.getNome() + " é: " + (Supervisor.super.getSalario() + 5000));
		return getSalario() + 5000;
	}


}
