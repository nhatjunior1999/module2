import java.util.Scanner;

public class bai17_bt13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập vào 1 số  :");
        int a = sc.nextInt();
        int sum = 0;
        if (a % 2 == 0) {
            for (int i = 0; i <= a; i++) {
                sum += i;
            }
            System.out.println("tổng các số chẵn từ 0 đến a :   " + sum);
        } else {
            System.out.println("không tính số lẻ ");
        }

    }
}
