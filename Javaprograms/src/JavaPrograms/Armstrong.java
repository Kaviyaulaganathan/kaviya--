package JavaPrograms;
import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the  number");
		int number=sc.nextInt();
		boolean res=Armstrong(number);
		if(res) {
		System.out.println("this is armstrong");
	}
		else {
			System.out.println("this is not armstrong");
		}
	}
public static boolean Armstrong(int number) {
int temp =number;
int sum=0;
while(number>0) {
	int rem=number%10;
	sum=sum+(rem*rem*rem);
	number=number/10;
	
}	
return sum==temp;
}}