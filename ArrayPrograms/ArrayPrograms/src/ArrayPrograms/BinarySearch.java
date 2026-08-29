package ArrayPrograms;
class BinarySearch {
public static void main(String[] args) {
	int[]a= {15,20,25,30,35};
	int element=30;
	 boolean res= BinarySearch(a,element);
	 if(res) {
		 System.out.println("element is found");
	 }
	 else{
		 System.out.println("element is not found");
	 }
}
	public static boolean BinarySearch(int[]a,int element) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(a[mid]==element) {
				return true;
	
			}
			else if(a[mid]<=element){
			
				low=mid+1;
			}
			else {
				high=mid-1;
			}}
			return false;
		}
				
	}


