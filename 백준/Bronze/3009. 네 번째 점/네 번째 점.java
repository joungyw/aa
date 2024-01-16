import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int d = scan.nextInt();
		int e = scan.nextInt();
		int f = scan.nextInt();
		
		int x =0;
		int y = 0;
		
		if(a == c) {
			  x = e;}
		else if(a==e) {
			x = c;}
		
		else if(c==e) {
			 x = a;}
		
		
		if(b == d) { 
			  y = f;}
		else if(d==f) {
			 y = b;}
		
		else if(b==f) {
			 y = d;}
		
		System.out.println(x);
		System.out.println(y);
	}
}