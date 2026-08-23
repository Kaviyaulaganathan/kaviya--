package ArrayPrograms;
 class secondlargestelement {
	 public static void main(String[] args) {
	 int[]a1= {32,80,10,99,97};
	 int largest=a1[0];
	 int secondlargest=a1[0];
	 for(int i=1;i<=a1.length-1;i++) {
		 if(a1[i]>largest) {
			 secondlargest=largest;
			 largest=a1[i];
		 }
			 else if(a1[i]>secondlargest && a1[i]!=largest) {
				 
				 secondlargest=a1[i];
			 }
		 }
	 System.out.println("secondlargest:"+secondlargest);
	 }
	 

}
