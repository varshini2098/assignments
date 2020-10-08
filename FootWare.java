
public class FootWare {
	String brand;
	String colour;
	double price;
	String type;
	 
	 FootWare(String ibrand, String icolour, double iprice, String itype){
		 brand = ibrand;
		 colour =icolour;
		 price = iprice;
		 type = itype; 
	}
	 FootWare(String ibrand,String itype){
		 
		 brand = ibrand;
		 type = itype; 
		 
		 
	 }
	  void FootWareFunction() {
		  System.out.println("protects our feet");
	  }
      void  FootWareFunction1() {
    	  System.out.println("helps us run ");
      }
}
