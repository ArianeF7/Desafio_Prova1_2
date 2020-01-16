
public abstract class Funcionario {
	
	private String nome;
	private int idade;
	private double salario;
	
	public Funcionario(String _nome, int _idade, Double _salario) {
		this.nome = _nome;
		this.idade = _idade;
		this.salario = _salario;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double bonificacao () {
		return salario;
	}
	
	

}
