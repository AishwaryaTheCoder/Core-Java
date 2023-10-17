
interface A {
    int show(int i, int j);

    static int show2(int num) {
        return num;
    }
}

public class InterfaceInJava {
    public static void main(String args[]) {
        A obj = (i, j) -> i + j; // this is lambda expression
        int res = obj.show(5, 8);
        System.out.println(res);
    }
}
