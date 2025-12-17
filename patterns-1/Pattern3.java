
import java.io.*;
class Pattern3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		System.out.println(n);

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i == 1 || i==n) {
					System.out.print("* ");
				}else {
					if(j==1 || j==n) {
						System.out.print("* ");
					}else{
						System.out.print("  ");
					}
				}
			}

			System.out.println();
		}


	}
}
