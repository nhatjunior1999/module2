import java.util.Scanner;

public class bai11_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao so nam ");
        int n = sc.nextInt();
        if(n % 4 == 0 && n % 100 !=0 || n % 400 == 0 ){
            System.out.println(n + " la nam nhuan");
        }else {
            System.out.println(n + " ko phai nam nhuan");
        }
    }
}
