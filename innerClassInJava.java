class A {
    public void show() {
        System.out.println("In A show");
    }

    class B {
        public void show() {
            System.out.println("In B show");
        }
    }
}

public class innerClassInJava {
    public static void main(String args[]) {
        A obj = new A() { // anonymous inner class
            public void show() {
                System.out.println("In A show differently");
            }
        };
        obj.show();
        A.B obj1 = obj.new B();
        int start = 5;
        int end = 18;
        float res = (float) (start + end) / 2;
        System.out.println(res);
        obj1.show();
    }

}
