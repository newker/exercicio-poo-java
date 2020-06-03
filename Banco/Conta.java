class Conta  implements Comparable<Conta>{

	private int numero;
	public Cliente titular;
	private double saldo;
	private double limite;

	Conta(){

	}

	public int compareTo(Conta outra){
		
		if (this.getNumero( ) < outra.getNumero( )){
			return -1;
		}

		if (this.getNumero( ) > outra.getNumero( )){
			return 1;
		}

		return 0;

	}

	public void setNumero(int numero){
		this.numero = numero;
	} 

	public int getNumero(){
		return this.numero;
	}

	public void verDados(){
		System.out.println("---------------------------------------------------------------");
		System.out.println("Conta: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("---------------------------------------------------------------");
	}

	


	public void saca(double quantidade){			
		if(this.saldo < quantidade){
			throw new SaldoInsuficienteException ("Saldo MUITO Insuficiente.");
		}else{
			this.saldo-=quantidade;
		}
	}

	
	public void deposita(double quantidade){
		this.saldo += quantidade; 
	}

	public void transferePara(Conta destino, double valor){
		if(this.saldo < valor){
			throw new IllegalArgumentException("Saldo Insuficiente.");
		}else{
			this.saldo -= valor;
			destino.deposita(valor);
		}
	}
}