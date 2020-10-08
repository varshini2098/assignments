package ArrayDemo;

public class Mobile {
	String brand;
	double price;
	String colour;
	
	 Mobile(String ibrand,double iprice,String icolour){
		 brand = ibrand;
		 price = iprice;
		 colour =icolour;
		 
	 }
	 Mobile(String ibrand,double iprice){
		 brand = ibrand;
		 price = iprice;
		 
		 
	 }
	 
	
	
	void details() {
		
		System.out.println("brand is : " +brand);
		System.out.println("colour is : " +colour);
		System.out.println("price is : " +price);
		
	}
	

	
	

	
	
	
}

