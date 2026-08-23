package ArrayPrograms;
class findtheposition {
	public static  void main(String[] args) {
		int[]a1= {34,34,89,34,98};
		int position=98;
		for(int i=0;i<=a1.length-1;i++) {
			if(position==a1[i]) {
				System.out.println("find the position:"+i);
				
			}
		}
	}

}
