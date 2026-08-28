package ArrayPrograms; 
import java.util.Arrays;
 class InsertionSort {
	 public static void main(String[] args) {
		int[]a= {25,10,22,12,71};
		for(int i=1;i<=a.length-1;i++) {
			int prev=i-1;
			int curr=a[i];
			while(prev>=0 && a[prev]>curr) {
				a[prev+1]=a[prev];
				prev--;
			}
			a[prev+1]=curr;
			
			}
		System.out.println(Arrays.toString(a));
		}

}
