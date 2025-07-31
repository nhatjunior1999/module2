import java.util.Scanner;

public class bai21_bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("moi ban nhap so a :");
        double a = sc.nextDouble();
        System.out.printf("moi ban nhap so b :");
        double b = sc.nextDouble();
        System.out.printf("moi ban nhap phep tinh : + - * / :");
        String x = sc.next();
        double result = PhepTinh(a, b, x);
        System.out.printf("ket qua phep tinh la  : " + result);
    }

    public static double PhepTinh(double a, double b, String x) {
        if (x.equals("+")) {
            return a + b;
        } else if (x.equals("-")) {
            return a - b;
        } else if (x.equals("*")) {
            return a * b;
        } else if (x.equals("/")) {
            if (b == 0) {
                System.out.printf(" moi ban nhap so khac");
                return 0;

            } else
                return a / b;

        } else {
            System.out.printf("nhap phep tinh khong hop le ! ");
        }
        return 0;
    }

}





