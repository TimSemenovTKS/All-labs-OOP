public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(5.3, 2.8, 1.5);
        c1.print();
        c1.setX(4.6);
        c1.setY(3.7);
        c1.setRadius(3);
        System.out.print(c1.getLenght());
    }
}