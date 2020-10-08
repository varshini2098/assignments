package exceptiondemo;

public class ArryOutOfBound {

	public static void main(String[] args) {
		
		int[] num = new int[5];
		num[0] =2;
		num[1] =3;
		num[3] =8;
		try {
		for(int i =0; i<=5; i++) {
			System.out.println(num[i]);
		}
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("inavlid index");
		}
		
		
		
	}
}