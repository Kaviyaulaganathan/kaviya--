package ArrayPrograms;
 class Minvalue {
	 public static void main(String[] args) {
		 int[]a1= {54,10,61,12,42};
		 int min=a1[0];
		 for(int i=0;i<=a1.length-1;i++){
			 if(a1[i]<min) {
				 min=a1[i];
				 
			 }
			 
		 }
		 System.out.println(min);
		 
	 }

}
