class Demo {
    int num; // this is called instance variable and will be stored in heap memory

    public void playMusic() { // this method will have separate stack in jvm

    }
}

class Test {
    static public void main(String a[]) {
        // int b = 5;
        // int c = 5;
        // char k = 'f';
        // float l = 6.5f;
        // byte b = 127;
        // int c = 257;
        // byte k = (byte) c;
        // int n = 5;
        // int res = 0;
        // res = n % 2 == 0 ? 10 : 20;
        // int i = 1;
        // while (i <= 4) {

        // System.out.println("Hii" + i);
        // int j = 1;
        // while (j <= 3) {
        // System.out.println("Hello" + j);
        // j++;

        // }
        // i++;
        // }
        // int arr[] = { 1, 2, 3, 4, 5 };
        // int target = 9;
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[i] + arr[j] == target) {
        // System.out.println(i);
        // }
        // }
        // }
        // int res = fibonacci(10);
        // System.out.println("fib" + res);

        // Multidimensional array
        int num[][] = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 100); // type casting from double to int
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        // enhance for loop
        for (int n[] : num) { // n represent the entire single dimensional array
            for (int m : n) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
        // 3d array
        int num3[][][] = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    num3[i][j][k] = (int) (Math.random() * 100);
                    System.out.print(num3[i][j][k] + " ");
                }
            }
            System.out.println();
        }

    }

    public static int fibonacci(int num) {
        int first = 0;
        int second = 1;
        int num3;
        for (int i = 2; i < num; i++) {
            num3 = first + second;
            first = second;
            second = num3;
        }
        return second;
    }

}
