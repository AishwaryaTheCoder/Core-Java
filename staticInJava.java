//static can only be used for inner classe
class Mobile {
    static String name; // shared among all the instance of class. single copy
    String brand;
    int price;

    public void show() {
        System.out.println(name + ":" + brand + ":" + price);
    }

    // you cant use non static var directly with static method. but if you have
    // object reference then we can as below
    // bxoz if you have multiple instance of same class then static method will get
    // confused which var to refer for non static
    public static void show1(Mobile mob) {
        System.out.println(name + ":" + mob.brand + ":" + mob.price);
    }
}

public class staticInJava {
    public static void main(String args[]) {
        Mobile mob1 = new Mobile();
        mob1.brand = "IPhone";
        mob1.price = 120000;
        Mobile.name = "Phone";

        Mobile mob2 = new Mobile();
        mob2.brand = "IPhone";
        mob2.price = 120000;
        // Mobile.name = "Phone";

        mob1.show();
        mob2.show();
        // static method can be call only with class
        Mobile.show1(mob2);

    }

}
