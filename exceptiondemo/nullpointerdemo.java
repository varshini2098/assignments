package exceptiondemo;

public class nullpointerdemo {

	public static void main(String[] args) {
		try {
		String[] colours = null;
		
	    System.out.println(colours[5]);
		}
		catch(NullPointerException e) {
			
			System.out.println("array cant be null");
		}

	}

}
