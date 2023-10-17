class A extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hii");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }
    }
}

class D {

}

class C implements Runnable {
    public void run() {

    }
}

public class ThreadingInJava {
    public static void main(String args[]) {
        A obj1 = new A();
        B obj2 = new B();
        obj1.start();
        obj2.start();

    }
}
