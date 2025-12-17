import java.util.*;

class Program1 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number : "); //3

		int n = sc.nextInt();

		for(int i=0; i<n; i++) { //row
		
			for(int j=0; j<n; j++) { //column
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}
