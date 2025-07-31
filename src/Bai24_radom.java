import java.util.Random;

public class Bai24_radom {
    public static void main(String[] args) {
        Random rd = new Random();
        int a = rd.nextInt(-12, 100);
        System.out.println(a);
        double b = rd.nextDouble(10,100);
        if (b % 2 == 0) {
            System.out.println(b + " là số chăn ");
        } else {
            System.out.println(  " là số lẻ ");
        }
        System.out.println(b);
        if (a % 2 == 0) {
            System.out.println(a + " là số chăn ");
        } else {
            System.out.println(a + " là số lẻ ");
        }
    }
}
