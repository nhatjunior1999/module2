import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao so :");
        int a = sc.nextInt();
        String traloi = (a % 2 ==0) ? "chan" : "le";
        System.out.println("so cua ban la so " + traloi);

    }
}
