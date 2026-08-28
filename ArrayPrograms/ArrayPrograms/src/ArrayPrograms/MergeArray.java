package ArrayPrograms;
import java.util.Arrays;
 class MergeArray {
	 public static void main(String[] args) {
		 int[]a= {24,76,32,89,12};
		 int[]b= {65,21,14,90,31};
		 int[]c=new int[a.length+b.length];
		 for(int i=0;i<=a.length-1;i++) {
			 c[i]=a[i];
		 }
			 for(int i=0;i<b.length;i++) {
				 c[a.length+i]=b[i];
				 
			 }
			 Arrays.sort(c);
			 
	 System.out.println(Arrays.toString(c));
		 
	 }

 }
