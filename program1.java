package Program;

public class program1 {
	 
		 
	

	public static void main(String[] args) {
		method1();
		Friends code=new Friends();
		code.method1();
		Aids code2= new Aids();
		code2.method2();
	   
	}
public static void method1() {
	System.out.println("We are friends of aids");
	 
	method2();
}	
	public static void method2() {
		System.out.println("AIDS guys");
		 
}
	
} 
		 class Friends{
			 public static void method1() {
				 System.out.println("harunick");
				 method2();
			 }
		    public static void method2() {
		    	System.out.println("poorna");
		    }
				 
			 }
			

		 class Aids{
			 public static void method2() {
				 System.out.println("she is the student of Aids department");
				 method3();
			 }
			public static void method3() {
				System.out.println("she study well");
				 
			 }
}
 

 