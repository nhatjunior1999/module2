import java.util.Scanner;

public class bai11_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao tong 2 so");
        double Nhap1 = sc.nextDouble();
        System.out.println("nhap vao hieu  2 so");
        double Nhap2 = sc.nextDouble();

        double x = (Nhap1 + Nhap2) / 2;
        System.out.println("gia tri x can tim la " + x);
        double y  = (Nhap1 - Nhap2) /2;
        System.out.println("gia tri y can tim la " + y);

    }
}
