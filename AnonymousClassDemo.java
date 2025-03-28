interface A {
    void show();
}

public class AnonymousClassDemo {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("In show method using anonymous inner class");
            }
        };
        obj.show();
    }
}
