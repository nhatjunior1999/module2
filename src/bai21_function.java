import java.util.Scanner;

public class bai21_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a :");
        double a = sc.nextDouble();
        System.out.println("nhap vao so b :");
        double b = sc.nextDouble();
        System.out.println("nhap vao chuoi cac ham + - * / :");
        String x = sc.next();
        switch (x){
            case "+":
                Cong(a,b);
                break;
            case "-":
                Tru(a,b);
                break;
            case "*":
                Nhan(a,b);
                break;
            case "/":
                Chia(a,b);
                break;
            default:
                System.out.println("nhap sai kí tự");
        }

    }

    public static void Cong(double a, double b) {
        double kq = a + b;
        System.out.println("ket quả của a + b : " + kq);
    }

    public static void Tru(double a, double b) {
        double kq = a - b;
        System.out.println("ket quả của a - b : " + kq);
    }

    public static void Nhan(double a, double b) {
        double kq = a * b;
        System.out.println("ket quả của a * b : " + kq);
    }

    public static void Chia(double a, double b) {
        if (b == 0) {
            System.out.println("không chia duoc");
        } else {
            double kq = a / b;
            System.out.println("ket quả của a / b : " + kq);
        }
    }
}