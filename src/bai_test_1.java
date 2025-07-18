import java.util.Scanner;

public class bai_test_1 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào số a :");
        a = sc.nextInt();
        System.out.println("mời bạn nhập vào số b :");
        b = sc.nextInt();
        System.out.println("bạn hãy chọn các phép tính trên ");
        System.out.println("1 : a  + b ");
        System.out.println("2 : a  - b ");
        System.out.println("3 : a  / b ");
        System.out.println("4 : a  * b ");
        int choose = sc.nextInt();
        if (choose == 1) {
            int kq = a + b;
            System.out.println("kết quả của a + b " + kq);
        } else if (choose == 2) {
            int kq1 = a - b;
            System.out.println("kết quả của a - b " + kq1);

        } else if (choose == 3) {
            int kq2 = a  / b;
            System.out.println("kết quả của a / b " + kq2);
        }else {
            int kq3 = a * b;
            System.out.println("kết quả của a * b " + kq3);
        }

    }
}
