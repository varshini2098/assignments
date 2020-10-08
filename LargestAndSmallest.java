package ArrayDemo;

public class LargestAndSmallest {
	public static void main(String[] args) {
		int temp ;
	int[] arraylist = new int[6];
	
		arraylist[0] =41;    
		arraylist[1] =21;
		arraylist[2] =32;
		arraylist[3] =44;
		arraylist[4] =51;
		
		
	   for(int i=0; i<5;i++) {
		   for(int j=i+1; j<5;j++) {
			   if(arraylist[i]>arraylist[j]) {
			   temp = arraylist[i];
			   arraylist[i] = arraylist[j];
			   arraylist[j] = temp;
			   }			   
		   }
		   
		    }
	   for(int i =0 ;i<5;i++) {
	   System.out.println(arraylist[i]);
	   }
	   System.out.println("smallest no" +arraylist[0]);
	   System.out.println("largest no" +arraylist[4]);
	    	
	   }
			
}
		
		

	


