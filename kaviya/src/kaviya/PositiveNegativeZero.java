package kaviya;
import java.util.Scanner;
public class PositiveNegativeZero {
		public static void main(String[] args) {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter the number");
			  int number=sc.nextInt();
			  String res=(number==0)? "Zero":(number>0)?"Positive":"Negative";
			  System.out.println(res);
			 
		}
		
	}



	                      


