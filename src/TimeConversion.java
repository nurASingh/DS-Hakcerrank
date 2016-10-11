import java.util.Scanner;


public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		if(str.indexOf("PM" )!= -1){
			String[] ar = str.split(":");
			String h = ar[0];
			String m = ar[1];
			String s = ar[2];
			s = s.substring(0, 1);
			
			int hh = Integer.parseInt(h);
			//int mm = Integer.parseInt(m);
			//int ss = Integer.parseInt(s);
			
			hh = hh +12;
			
			System.out.println(hh + ":" + m +":"+ s);
			
		}else{
			System.out.println(str);
		}
		

	}

}
