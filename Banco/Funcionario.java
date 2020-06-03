abstract class Funcionario{
	protected String nome;
	protected String cpf;
	protected double salario;

	abstract double getBonificacao();

	public void setSalario(double salario){
		this.salario = salario;
	}
}

