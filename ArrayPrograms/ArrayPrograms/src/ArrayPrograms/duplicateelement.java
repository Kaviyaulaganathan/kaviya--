package ArrayPrograms;

class duplicateelement {
	public static void main(String[] args) {
		int[]a1= {10,54,78,10,90};
		for(int i=0;i<=a1.length-1;i++) {
			for(int j=i+1;j<=a1.length-1;j++) {
				if(a1[i]==a1[j]) {
				System.out.println(a1[i]);
			}
			
		}
		}}}
