import java.util.Scanner;

public class bai17_bt14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập vào 1 số lẻ :");
        int a = sc.nextInt();
        int sum = 0;
        if (a % 2 != 0) {
            for (int i = 1; i <= a; i+=2) {
                if (i == 3 ){
                    continue;
                }
                 sum += i;
            }
            System.out.println("tổng các số lẻ :  " + sum);
        }
        else
            System.out.println("hãy nhập số lẻ");


    }
}
