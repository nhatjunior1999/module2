import java.util.Scanner;

public class bai21_bt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("moi nhap vao so a : ");
        int a = sc.nextInt();
        System.out.printf("moi nhap vao so a : ");
        int b = sc.nextInt();
        System.out.printf("moi ban cho cac phep tinh : + - * /  :");
        String x = sc.next();
        double result = PhepTinh(a, b, x);
        System.out.printf("Kết quả: %.2f\n", result);


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
                System.out.printf("khong chia duoc");
                return 0;

            } else
                return a / b;
        } else
            System.out.printf("phep tinh ko hop le ");
        return 0;

    }
}
