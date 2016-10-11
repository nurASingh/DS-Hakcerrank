import java.util.Scanner;

public class DiagonalDiffrence {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int n1 = 0;
        int z = 0;
        
        for(int i = 0 ; i < n ; i++){
            int x = sc.nextInt();
            if(x == 0 ){
               z++; 
            }else if ( x>0){
                p++;
            }else {
                n1++;
            }
                
        }
        
         
        System.out.println(((double)1/3));
         //System.out.println(n1/n);
 //System.out.println(z/n);

    }
}