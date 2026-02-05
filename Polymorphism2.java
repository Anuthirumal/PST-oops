package Program;

public class Polymorphism2 {

    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println(add(a, b));
        System.out.println(multi(a,b));
        System.out.println(divi(a,b));
        System.out.println(sub(a,b));
        System.out.println(mod(a,b));
    }

    public static int add(int a, int b) {
        return a + b;
    }
    public static int multi(int a,int b) {
    	return a*b;
    	
    }
    public static int divi(int a,int b) {
    	return a/b;
    }
    public static int sub(int a, int b) {
    	return a-b;
    }
    public static int mod( int a, int b) {
    	return a%b;
    }
}
