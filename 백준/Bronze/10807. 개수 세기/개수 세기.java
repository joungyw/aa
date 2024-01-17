import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int[] arr =new int[N];
		
        for(int i=0; i<N; i++) {
            int num = scan.nextInt();
            arr[i] = num;
            
            
        }
        int V = scan.nextInt();
        int sum = 0;
        for(int i=0; i<N; i++) {
            if(arr[i]==V) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}