import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class ReadF {

	public static void main(String[] args) 
		throws FileNotFoundException
		
		{
			File file = new File("C:\\Users\\HP\\Documents\\TT.txt");
			Scanner c = new Scanner(file);
			
			c.useDelimiter("\\Z");
			System.out.println(c.next());
			}
	}