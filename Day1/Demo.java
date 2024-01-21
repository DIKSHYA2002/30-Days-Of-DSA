package Day1;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("output.txt");

		try(Scanner ip = new Scanner(new File("input.txt"));
			PrintWriter op = new PrintWriter(f);  ){
			int x = ip.nextInt();
			int y = ip.nextInt();
			op.println(x+y);

		}
	}
}
