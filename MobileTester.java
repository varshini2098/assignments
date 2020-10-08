package ArrayDemo;

public class MobileTester {

	public static void main(String[] args) {
		Mobile[] marray = new Mobile[5];
		Mobile m1 = new Mobile("samsung",20000.00,"black");
	    m1.details();
	
		Mobile m2 = new Mobile("oneplus",25000.00);
	    m2.details();
      for(int i = 0; i<5; i++ )		{
    	  if(i!=0) {
    	   System.out.println("the details are" +marray[i]);
    	   
    	  }
      }
		
		
	}

}
