import java.util.Scanner;
import java.io.*;

public class EscrevendoSalvando{
	public static void main(String[] args) throws IOException{
	
		Scanner s = new Scanner(System.in);
		PrintStream ps = new PrintStream("Arquivo2.txt");
		while (s.hasNextLine()){
			ps.println(s.nextLine());
		}	

	}
}