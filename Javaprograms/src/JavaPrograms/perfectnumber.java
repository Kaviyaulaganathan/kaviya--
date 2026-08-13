package JavaPrograms;
import java.util.Scanner;
public class perfectnumber {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		boolean res=perfectnumber(number);
			if(res) {
				System.out.println("this is a prfect number");
			}
			else {
				System.out.println("this is not perfect number");
			}
		}
		public static boolean perfectnumber(int number) {
	int sum=0;
	for(int i=1;i<number;i++) {
		if(number%i==0) {
			sum=sum+i;
	}}
	return  sum==number;
}
}