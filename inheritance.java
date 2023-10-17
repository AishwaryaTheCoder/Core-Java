class Calc {

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class A {
    public void show() {
        System.out.println("I am in A");
    }
}

class B extends A {
    public void show() {
        System.out.println("I am in B");
    }
}

public class inheritance {

    int i = 8;

    public static void main(String args[]) {
        var j = 0.5; // in Java 10
        AdvCalc calc = new AdvCalc();
        int r1 = calc.add(5, 9);
        int r2 = calc.sub(4, 3);

        // System.out.println(r1 + ":" + r2);

        A obj = new A();
        obj.show();
    }

}
