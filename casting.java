class A {
    public void show() {
        System.out.println("Int show 1");
    }
}

class B extends A {
    public void show2() {
        System.out.println("Int show 1");
    }
}

public class casting {
    static public void main(String args[]) {

        double d = 4.5;
        int c = (int) d; // this is called typecasting

        // System.out.println(c);
        A obj = new B(); // this is upcasting
        obj.show();

        B obj1 = (B) obj;
        obj1.show2(); // this is downcasting

    }
}
