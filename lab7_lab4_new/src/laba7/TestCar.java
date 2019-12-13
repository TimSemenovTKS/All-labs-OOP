package laba7;

public class TestCar {
    public static void main(String[] args) {
        Car c1 = new Car("BMW", "X7", "M50d", 7320000, 2019);
        Car c2 = new Car("Volkswagen", "Passat", "cc", 1500000, 2017);
        Car c3 = new Car("Audi", "A8", "Q8", 9000000, 2019);
        c1.println();
        c2.println();
        c3.println();
    }
}