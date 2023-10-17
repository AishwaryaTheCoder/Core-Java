class Laptop {

    int price;
    String model;

    public String toString() {
        return "Hello Aish";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

}

public class objectClass {
    public static void main(String args[]) {
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo";
        obj1.price = 1000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo";
        obj2.price = 1000;

        boolean res = obj1 == obj2; // this wont give corerct ans
        boolean result = obj1.equals(obj2);
        System.out.println(result + ":" + res);

        System.out.println(obj1.toString()); // it will give classname along with hashcode
        // every time when you create obj, it will call toString method by default
    }
}
