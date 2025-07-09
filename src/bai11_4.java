import java.util.Scanner;

public class bai11_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao thang 1 den 12 :");
        int n = sc.nextInt();
        if (n > 12 || n < 1) {
            System.out.println("yeu cau nhap la so thang trong nam ");
        } else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) {
            System.out.println(n + " la thang co 31 ngay");
        } else if (n == 2) {
            System.out.println("nhap so na");
            int a = sc.nextInt();
            if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
                System.out.println("thang" + n + "cua nam " + a + " la nam nhuan va co 29");
            } else {
                System.out.println("thang" + n + "cua nam " + a + " ko phai  nam nhuan va co 28");
            }
        } else {
            System.out.println("thang"+ n + " co 30 ngay");
        }
    }
}
