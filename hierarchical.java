 package Program;
 public class hierarchical {
	    public static void main(String[] args) {
	        B obj1 = new B();
	        obj1.ds();

	        C obj2 = new C();
	        obj2.ds();
	    }
	}

class A {
    public void ds() {
        System.out.println("this is class A");
    }
}

class B extends A {
    public void ds() {
        System.out.println("students");
    }
}

class C extends A {
    public void ds() {
        System.out.println("books");
    }
}

 