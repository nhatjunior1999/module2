import java.util.Scanner;

public class bai14_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap so 1-99 :");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("moi ban nhap lai");
            n = sc.nextInt();
        }
        System.out.println("ban da nhap dung");
    }

}
