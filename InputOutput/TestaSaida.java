import java.io.*;
class TestaSaida {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("Saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("Escrevendo e Salvando em arquivos.");

		bw.close();
	}
}