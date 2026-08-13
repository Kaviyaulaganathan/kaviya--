package JavaPrograms;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the year");
		int year =sc.nextInt();
		boolean res=leapyear(year);
		if(res) {
			System.out.println("this is leap year");
		}
		else {
			System.out.println("this is not leap year");
		}
		
		
	}
	public static boolean leapyear(int year) {
		return ((year%4==0 && year%100!=0)||(year%400==0));
		
	}

}
