class A {
    public void show() throws ClassNotFoundException {
        Class.forName("ExceptionInJava");
    }
}

public class ExceptionInJava {
    public static void main(String args[]) {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        }
        int i = 0;
        int j = 0;
        int num[] = new int[4];
        try {

            j = 18 / i;

            System.out.println(num[5]);
            if (j == 0) {
                throw new ArithmeticException();
            }
        }

        catch (ArithmeticException e) {
            // System.out.println("Cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("stay in limit");
        }

        System.out.println(j);
        String str = "Aishwarya";
        str = "Gopal";
        System.out.println(str);
    }
}
