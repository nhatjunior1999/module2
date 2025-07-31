import java.util.Calendar;
import java.util.Scanner;

public class bai22_bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập vào ngày sinh ");
        int a = sc.nextInt();
        System.out.println("nhập vào tháng  sinh ");
        int b = sc.nextInt();
        System.out.println("nhập vào năm  sinh ");
        int c = sc.nextInt();

        Calendar birthday = Calendar.getInstance();
        birthday.set(c, b - 1, a);
        Calendar today = Calendar.getInstance();
        long time = today.getTimeInMillis() - birthday.getTimeInMillis();
        long day = time / (1000 * 60 * 60 * 24);
        System.out.println("bạn đã sống được số ngày là :   " + day);

    }
}
