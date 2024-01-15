import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int z = scan.nextInt();

		if (x == y && x < w - x && x < z - y)
			System.out.println(x);
		
		else if (x<y&&x<w - x &&x< z - y)
			System.out.println(x);
		else if (x>y&&y<w - x &&y< z - y)
			System.out.println(y);

		else if (w - x > z - y)
			System.out.println(z - y);
		else
			System.out.println(w - x);

	}
}