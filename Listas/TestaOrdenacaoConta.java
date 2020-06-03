import java.util.*;

public class TestaOrdenacaoConta{

	public static void main(String[ ] args){

		List<Conta> contas = new ArrayList<Conta>( );

		Conta c1 = new ContaCorrente();
		c1.setNumero(1973);
		contas.add(c1);

		Conta c2 = new ContaCorrente();
		c2.setNumero(1462);
		contas.add(c2);

		Conta c3 = new ContaCorrente();
		c3.setNumero(1854);
		contas.add(c3);

		Collections.sort(contas);
				
		for(int i=0; i < contas.size( ); i++){
				
			Conta atual = contas.get(i);
			System.out.println("numero: " + atual.getNumero());		

		}

		System.out.println(contas);

	}

}