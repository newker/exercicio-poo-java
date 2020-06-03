import java.util.Set;
import java.util.HashSet;

public class Conjuntos{
	public static void main(String[ ] args){
		
		Set<String> cargos = new HashSet<String>();

		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretaria");
		cargos.add("Funcionario");

		for (String palavra : cargos) {
			System.out.println(palavra);
		}

	}
}