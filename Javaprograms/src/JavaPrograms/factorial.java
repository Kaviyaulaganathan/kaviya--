package JavaPrograms;
import java.util.Scanner;
 class factorial {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter the number");
		 int number=sc.nextInt();
		 int fact=1;
		 while(number>0) {
			 fact=fact*number;
			 number--;
		 }
		 System.out.println(fact);
		 
		  }
 }
