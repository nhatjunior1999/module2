import java.util.Scanner;

public class bai_test12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        while (true) {
            System.out.print("Hãy nhập vào số nguyên: ");
            a = sc.nextInt();

            if (a == 0) {
                System.out.println("Chương trình kết thúc!");
                break;
            }

            if (a < 0) {
                System.out.println("Số không hợp lệ! Hãy nhập lại.");
                continue;
            }

            int sum = 0;
            for (int i = 0; i <= a; i++) {
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            System.out.println("Tổng các số chia hết cho 3 từ 0 đến " + a + " là: " + sum);
        }

        sc.close();
    }
}
