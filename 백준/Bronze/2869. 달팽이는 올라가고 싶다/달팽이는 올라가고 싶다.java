import java.util.Scanner;

public class Main {
	public static void main(String[] arge) {
		Scanner scan = new Scanner(System.in);

		long A = scan.nextLong();
		long B = scan.nextLong();
		long V = scan.nextLong();
		
		
		
		if((V-A)%(A-B) == 0) 
		System.out.println(((V-A)/(A-B))+1);
	
		else if ((V-A)%(A-B) > 0) 
		System.out.println(((V-A)/(A-B))+2);
		
		
		}

		}