import java.util.Scanner;

public class bai17_bt16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" hãy nhập số để tính tổng gia thừa từ 1! đến n!");
        int a = sc.nextInt();
        int sum = 0;
        long giaThua = 1;
        for (int i = 1; i <= a; i++) {
            giaThua *= i;
            System.out.println(i + "! = " +giaThua);

            sum += giaThua;
        }
        System.out.println(" tổng các giai thừa từ 1! đến "+a+"!  là :" +sum);

    }
}
