package JavaPrograms;
import java.util.Scanner;
public class perfectsquare {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean res= perfectsquare(number);
	if(res){
			System.out.println("this is perfect square");
			
		}
		else {
			System.out.println("this is not perfect square");
		}
	}
		public static boolean perfectsquare(int number) {
			for(int i=1;i<=number;i++) {
				if(i*i==number) {
					return true;
			
	
				}
			
		}
			return false;
		
		
		}
}