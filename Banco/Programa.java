class Programa{

	public static void main(String[] args){
		
		Conta minhaConta = new Conta();		
		Cliente cliente = new Cliente();
	
		minhaConta.titular = cliente;

		minhaConta.setNumero(667080);

		minhaConta.deposita(1000.00);

		minhaConta.titular.setDadosCliente("001","Ricardo Junior","Travessa Vila Nova, 348 B Curio CEP 60.844-050 Fortaleza-CE","039.870.753-76",26);


		try{
			minhaConta.saca(1100);
		}catch(SaldoInsuficienteException  e){
			System.out.println(e.getMessage());
		}

		minhaConta.verDados();
		minhaConta.titular.verDadosCliente();

		ControleDeBonificacoes controle = new ControleDeBonificacoes();

		Gerente funcionario1 = new Gerente();
		funcionario1.setSalario(5000.0);
		controle.registra(funcionario1);

		Diretor funcionario2 = new Diretor();
		funcionario2.setSalario(1000.00);
		controle.registra(funcionario2);

		System.out.println("Total de Bonificacoes: " + controle.getTotalDeBonificacoes());


	}

}