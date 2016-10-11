import java.util.Arrays;
import java.util.Scanner;

public class SherelockAndMiniMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < n; i++) {

			ar[i] = sc.nextInt();
		}
		Arrays.sort(ar);
		
		int count =0 ;
		int i =0;
		while(i<n){
			
			int weight = ar[i];
			//System.out.println(weight);
			int temp =weight;
			int y =i;
			while(temp <= weight+4){
				y++;
				int x = ar[y];
				temp = x; 				
			}
			i = i+y;
			
		  count++;	
		}
		System.out.println(count);
	}

}
