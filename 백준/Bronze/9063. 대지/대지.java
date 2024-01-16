import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();

		int[] arr = new int[N];
		int[] a = new int[N];
		int[] b = new int[N];

		for (int i = 0; i < N; i++) {
			int X = scan.nextInt();
			a[i] = X;
			int Y = scan.nextInt();
			b[i] = Y;}

			Arrays.sort(a);
			int c = a[a.length-1]-a[0];
			Arrays.sort(b);
			int d = b[b.length-1]-b[0];

			System.out.println(c*d);
		
	}
}