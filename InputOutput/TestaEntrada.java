
//InputStream (Fluxo de Entrada) é possivel ler bytes.



import java.io.*;  //importa o pacote java.io.

class TestaEntrada{
	public static void main(String[] args) throws IOException{		//declara uma exceção.
		InputStream is = new FileInputStream("Arquivo.txt");	//cria um objeto do tipo FileInputStream, classe filha concreta da classe abstrata Inputstream, e passa o nome do arquivo como argumento.
		InputStreamReader isr = new InputStreamReader(is);	//através da classe InputStreamReader é possivel ler os bytes do arquivo transformando-os em char.
		BufferedReader br = new BufferedReader(isr);		
		String s = br.readLine();				//através do método readLine() da classe BufferedReader os char serão concatenados até formar strings.

		while(s != null){
			System.out.println(s);			//imprimi enquanto não chegar no fim do arquivo. Pois quando o método readLine chegar na ultima linha retornará null.
			s = br.readLine();
		}

		br.close(); 					//encerra o buffer.
	}
}