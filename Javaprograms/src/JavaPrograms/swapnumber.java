package JavaPrograms;
import java.util.Scanner;
 class swapnumber {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("entr a number");
		 int a=sc.nextInt();
		 System.out.println("enter b bumber");
		 int b=sc.nextInt();
		 int temp=a;
		 a=b;
		 b=temp;
		 System.out.println("a="+a);
		 System.out.println("b="+b);
		 
	 }

}
