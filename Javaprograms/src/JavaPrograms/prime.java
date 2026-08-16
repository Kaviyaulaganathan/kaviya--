package JavaPrograms;
import java.util.Scanner;
 class prime {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the start");
		 int start=sc.nextInt();
		 System.out.println("enter the end");
		 int end=sc.nextInt();
		 for(int i=start;i<=end;i++) {
			 if(prime(i)) {

	System.out.println(i+"");
	 }
		 }} 
	 public static boolean prime(int number) {
		 if(number<2) {
			 return false;
		 }
		 int count=0;
		 for(int i=1;i<=number;i++) {
			if(number%i==0) {
				count++;
			}}
		 return count==2;
	 }
}