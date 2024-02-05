import java.util.Scanner;
public class Charactercount {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		String inputString=scanner.nextLine();
		int count=inputString.length();
		System.out.println("Number of characters in string:"+count);
		scanner.close();
		

	}

}
