
//InputStream (Fluxo de Entrada) � possivel ler bytes.



import java.io.*;  //importa o pacote java.io.

class TestaEntrada{
	public static void main(String[] args) throws IOException{		//declara uma exce��o.
		InputStream is = new FileInputStream("Arquivo.txt");	//cria um objeto do tipo FileInputStream, classe filha concreta da classe abstrata Inputstream, e passa o nome do arquivo como argumento.
		InputStreamReader isr = new InputStreamReader(is);	//atrav�s da classe InputStreamReader � possivel ler os bytes do arquivo transformando-os em char.
		BufferedReader br = new BufferedReader(isr);		
		String s = br.readLine();				//atrav�s do m�todo readLine() da classe BufferedReader os char ser�o concatenados at� formar strings.

		while(s != null){
			System.out.println(s);			//imprimi enquanto n�o chegar no fim do arquivo. Pois quando o m�todo readLine chegar na ultima linha retornar� null.
			s = br.readLine();
		}

		br.close(); 					//encerra o buffer.
	}
}