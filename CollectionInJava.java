import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInJava {
    public static void main(String agrs[]) {
        ArrayList<Integer> num = new ArrayList<Integer>(); // from list interface

        Set<Integer> num2 = new HashSet<Integer>(); // doesnt give sorted and sequenced value

        Set<Integer> num3 = new TreeSet<Integer>(); // will give sorted value
        num.add(1);
        num.add(2);

        num2.add(3);
        num2.add(6);

        num3.add(3);
        num3.add(3);

        // for (int n : num) {
        // System.out.println(n);
        // }
        Map<String, Integer> students = new HashMap<>();

        students.put("Aishwarya", 99);
        students.put("Gopal", 67);

        for (String key : students.keySet()) {
            System.out.println(key + "" + students.get(key));
        }
    }
}
