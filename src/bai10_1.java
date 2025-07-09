import java.util.Scanner;

public class bai10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        while (true) {
            System.out.print("Nhập vào số nguyên dương (>= 2): ");

            if (sc.hasNextInt()) { // Kiểm tra có phải số nguyên không
                a = sc.nextInt();

                if (a >= 2) {
                    break; // Nhập đúng → thoát khỏi vòng lặp
                } else {
                    System.out.println("Số phải >= 2. Nhập lại!");
                }

            } else {
                System.out.println("Không phải số nguyên! Nhập lại.");
                sc.next(); // Đọc bỏ dữ liệu sai để tránh lặp vô hạn
            }
        }
        if (isPrie(a)) {
            System.out.println("la so ngyen to");
        } else {
            System.out.println("nhap ko phai so ngyen to");
        }
        sc.close();
    }

    public static boolean isPrie(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(a) ; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
