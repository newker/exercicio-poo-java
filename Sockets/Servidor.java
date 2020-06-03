import java.net.*;
import java.util.*;
import java.io.*;

public class Servidor{
	public static void main(String[] args) throws IOException{

		ServerSocket servidor = new ServerSocket(12345);
		System.out.println("Porta 12345 aberta");

		Socket cliente = servidor.accept();
		System.out.println("Nova Conexao com o Cliente " + cliente.getInetAddress().getHostAddress());

		Scanner s = new Scanner(cliente.getInputStream());
		while (s.hasNextLine()){
			System.out.println(s.nextLine());
		} 

		s.close();
		servidor.close();
		cliente.close();

	}
}