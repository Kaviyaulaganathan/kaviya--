package ArrayPrograms;
class Kadane {
	public static void main(String[] args) {
		int[] a = {11,43,-9,6,-41,8};
		int currentsum=a[0];
		int maxsum=a[0];
		for(int i=1;i<a.length;i++) {
			currentsum=Math.max(a[i],currentsum+a[i]);
			maxsum=Math.max(maxsum,currentsum);
		}
		System.out.println("maxsum"+maxsum);

}}