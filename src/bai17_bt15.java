import java.util.Scanner;

public class bai17_bt15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" những số chia hết cho từ 10 đến 50 :");
            int a  = sc.nextInt();
        for (int i = 1; i < a; i++) {
            if (i % 3 == 0 ){
                System.out.print(i+" ");
            }
        }
    }
}
