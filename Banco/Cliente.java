class Cliente{
	
	private String cod;
	private String nome;
	private String endereco;
	private String cpf;
	private int idade;

	public void setDadosCliente(String cod, String nome, String endereco, String cpf, int idade){
		this.cod = cod;
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.idade = idade;
	}

	public void verDadosCliente(){
		System.out.println("---------------------------------------------------------------");
		System.out.println("Codigo: " + this.cod);
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereco: " + this.endereco);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Idade: " + this.idade + " anos.");
		System.out.println("---------------------------------------------------------------");
	}

}