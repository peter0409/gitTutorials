
class DivThree{
	
	public static void main(String[] args) {
		int numToCheck = 15;
		
		if(numToCheck % 3 == 0) {
			
			if(numToCheck % 5 ==0){
				System.out.println("Awesome");
			} else{
				
				System.out.println("Waoooo");
			}

		} else if( numToCheck % 5 == 0 ) {
			System.out.println("Oooohhhh");
		}
	}
}