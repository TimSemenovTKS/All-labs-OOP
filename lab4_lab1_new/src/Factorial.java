public class Factorial {
    public static void main(String[] args) {
        int a = 0, f = 1;
        int[] massif = {1, 2, 3, 4, 5};
        for (a = 0; a < 5; a++) {
            f = f * massif[a];
        }
        System.out.println("5! = " + f);
    }
}
