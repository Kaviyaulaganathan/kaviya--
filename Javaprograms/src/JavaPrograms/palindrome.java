package JavaPrograms;
import java.util.Scanner;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean result= palindrome(number);
		if(result) {
			System.out.println("this is palindrome");
		}
		else {
		System.out.println("this is not palindrome");
		}
		}
			
		public static boolean palindrome(int number) {
			int temp=number;
			int rev=0;
			while(number>0) {
				int rem=number%10;
				rev=rev*10+rem;
				number=number/10;
			}
			return temp==rev;
		
				
				
	
				

				
			}
				
	}