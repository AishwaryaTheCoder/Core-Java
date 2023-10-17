
import java.util.Arrays;
import java.util.List;

public class StreamApiInJava {
    public static void main(String args[]) {
        List<Integer> l = Arrays.asList(1, 2, 3, 4, 6);

        int res = l.stream().filter(n -> n % 2 == 0).map(n -> n * 2).reduce(0, (c, e) -> c + e);
        // Stream<Integer> s = l.stream(); //called once
        // s.forEach(n -> System.out.println(n));
        System.out.println(res);
    }
}
