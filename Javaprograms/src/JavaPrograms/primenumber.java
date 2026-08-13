package JavaPrograms;
import java.util.Scanner;
public class primenumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean res=primenumber(number);
		if(res) {
			System.out.println("this is primenumber");
		}
		else {
			System.out.println("this is not primenumber");
		}
	}
		public static boolean primenumber(int number) {
			int count=0;
			for(int i=1;i<=number;i++) {
				if(number%i==0) {
					count++;
				}
			}
					return count==2;
		}
		}
                                                                                            