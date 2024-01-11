import java.util.Scanner;

class Main {
	public static void main(String[] arge) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int sum = 0;
		
		for(int i =1; i < n+1; i++) {
			
			sum = sum + i;
			
		}
		System.out.println(sum);
	}
}
