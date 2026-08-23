package ArrayPrograms;

 class secondsmallest {
	 public static void main(String[] args) {
		 int[]a1= {34,7,10,32,12};
		 int smallest=a1[0];
		 int secondsmallest=a1[0];
		 for(int i=1;i<=a1.length-1;i++) {
			 if(a1[i]<smallest) {
				 secondsmallest=smallest;
				 smallest=a1[i];
				 
			 }
			 else if((a1[i]<secondsmallest)&&(a1[i]!=smallest)) {
				 secondsmallest=a1[i];
				 
			 }
		 }
		 System.out.println("secondsmallestt:"+secondsmallest);
		 
	 }

}
