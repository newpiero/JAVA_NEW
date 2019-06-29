public class Main {

    public static void main(String[] args) {

        System.out.println("Максимальное число " + findMax(3, 4));

    }

    public static int findMax(int a, int b) {

        return a <= b ? b : a;

    }

}
