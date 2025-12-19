import java.io.*;

class MaxNum {
	public static void main(String[] args) throws IOException {
		System.out.print("Enter the size of array");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];

		System.out.println("Enter Array Numbers : ");

		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		int max = arr[0];
		for(int i=1; i<n; i++) {
			if(max<arr[i])
				max = arr[i];
		}

		System.out.println("Max Num" + max);
	}
}
