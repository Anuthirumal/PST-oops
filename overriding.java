package Program;

public class overriding {

    public static void main(String[] args) {
        Display();
        classB obj = new classB();
        obj.aids();
    }

    public static void Display() {
        System.out.println("good");
    }
}

class classA {
    public static void aids() {
        System.out.println("bye");
    }
}

class classB extends classA {
    public static void aids() {
        System.out.println("morning");
    }
}