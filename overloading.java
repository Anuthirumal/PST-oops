package Program;

public class overloading {

	public static void main(String[] args) {
	 int a=10,b=20,c=30;
	 System.out.println(add(a,b));
	 System.out.println(add(a,b,c));

	}
	public static int add(int a, int b) {
		return a+b;
	}
	public static int add(int a, int b, int c) {
		return a+b+c;
	}

}
