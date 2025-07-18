import java.util.Scanner;

public class bai17_bt12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen N :");
        int  n  =  sc.nextInt();
        long giaiThua = 1;
        if (n < 0 ){
            System.out.println(" mời bạn nhập lại gian thừa bạn nhập là số âm ");
        }
        else {
            for (int i = 1; i <= n; i++) {
                giaiThua*= i;
            }
            System.out.println(n+ "!  = " + giaiThua );
        }
        long giaiThua1 =1 ;
                int i = 1;
        while (i <= n){
            giaiThua1*=i;
            i++ ;
        }
        System.out.println("gia thừa 1 là  : " + giaiThua1);



    }
}
