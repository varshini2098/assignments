
public class FootWareTester {
	public static void main(String[] args) {
		 
		FootWare f1 = new FootWare("bata","red",1500.00,"sandals");
		 System.out.println("Brand : " +f1.brand);
			System.out.println("colour : " +f1.colour);
			System.out.println("price: " +f1.price);
			System.out.println("type : " +f1.type);
		
		f1.FootWareFunction();
		FootWare f2 = new FootWare("puma","sportshoes");
		System.out.println("Brand : " +f2.brand);
		System.out.println("type : " +f2.type);
		f2.FootWareFunction1();
		
		
		
		
	}

}
