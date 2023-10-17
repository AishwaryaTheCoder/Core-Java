class Human {
    private String name;
    private int age;

    public Human() {
        name = "GK";
        age = 30;
    }

    public int getAge() {
        return age;
    }

    // static {
    // System.out.println("in static 1");
    // }
    // static {
    // System.out.println("in static 2");
    // }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String n) {
        name = n;
    }
}

public class encapsulation {
    public static void main(String args[]) {

        Human aish = new Human();
        // aish.setAge(27);
        aish.setName("Aishwarya");
        System.out.println(aish.getName());

    }
}
