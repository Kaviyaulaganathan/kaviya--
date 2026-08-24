package ArrayPrograms;
import java.util.Scanner;
class ReverseArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int[]a1=new int[size];//create an array
		System.out.println("enter the value");//insert values
		for(int i=0;i<=a1.length-1;i++) {
			a1[i]=sc.nextInt();
		}
		System.out.println("result");
		for(int i=a1.length-1;i>=0;i--) {
			System.out.println(a1[i]);
		}
		
		
		
	}

}
