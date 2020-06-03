class Gerente extends Funcionario implements Autenticavel{
	int senha;
	int numeroDeFuncionariosGerenciados;

	public boolean autentica(int senha){
		if(this.senha == senha){
			System.out.println("Acesso Permitido!");
			return true;
		}else{
			System.out.println("Acesso Negado!");
			return false;
		}
	}

	public double getBonificacao(){
		return this.salario * 0.10 + 1000;
	}
}