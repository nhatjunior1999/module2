import java.util.Scanner;

public class Bai11_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = sc.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = sc.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phương trình vô nghiệm ");
                } else {
                    System.out.println("phương trình có vô số nghiêm");
                }
            } else {
                double x = -c / b;
                System.out.println("phuong trinh co nghiem x = " + x);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vo  nghiem");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("phuong trinh co nghiem x = " + x);

            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("phuong trinh co 2 nghiem : ");
                System.out.println(" x1 = " + x1);
                System.out.println(" x2 = " + x2);
            }

        }

    }
}

