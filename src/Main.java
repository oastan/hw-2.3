public class Main {
    public static void main(String[] args) {

        final Bicycle a1 = new Bicycle("a1", 2);
        final Bicycle a2 = new Bicycle("a2", 2);
        final Car c1 = new Car("c1", 4);
        final Car c2 = new Car("c2", 4);
        final Truck t1 = new Truck("t1", 12);
        final Truck t2 = new Truck("t2", 12);

        a1.check();
        a2.check();
        c1.check();
        c2.check();
        t1.check();
        t2.check();

    }
}