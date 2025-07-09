import java.util.Scanner;

public class bai11_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn chọn bài tập");
        System.out.println("bài tập 1 : kiểm tra số âm hay số dương");
        System.out.println("bài tập 2 : kiểm tra số chẵn lẻ");
        System.out.println("bài tập 3 : kiểm tra số lớn nhất trong 3 số : ");
        System.out.println(" nhập lựa chọn của bạn : ");
        int Choice = sc.nextInt();
        switch (Choice) {
            case 1:
                KiemTraAmDuong();
                break;
            case 2:
                kiemTraChanLe();
                break;
            case 3:
                SoLonNhat();
                break;
            default:
                System.out.println(" mời bạn nhập lại");
        }
    }

    public static void KiemTraAmDuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào 1 số  : ");
        int a = sc.nextInt();
        if (a < 0) {
            System.out.println(" là số âm ");
        } else if (a > 0) {
            System.out.println("là số dương ");
        } else {
            System.out.println(" là số dương");
        }
    }

    public static void kiemTraChanLe() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println(" số bạn nhập là số chẵn");
        } else {
            System.out.println(" số bạn nhập là số lẻ");
        }
    }

    public static void SoLonNhat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số thứ nhất : ");
        int a =  sc.nextInt();
        System.out.println(" mời bạn nhập vào số thứ hai : ");
        int b = sc.nextInt();
        System.out.println(" mời bạn nhập vào số thứ ba : ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Số lớn nhất là: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("Số lớn nhất là: " + b);
        } else {
            System.out.println("Số lớn nhất là: " + c);
        }
    }

}
