import java.util.Scanner;

public class bai17_bt17 {
    public static void main(String[] args) {
       /* int n = 6;
        int sum  = 0 ;
        for (int i = 1; i < n ; i++) {
            if(n % i == 0 ){
                sum +=i;
            }
        }
        if(sum == n){
            System.out.println(n+ " la so hoan hao");
        }else
            System.out.println("khong phai la so hoan hao ");*/
        int sum = 0;
        double x = 0.0 / 0.0;
        Scanner sc = new Scanner(System.in);
        int a = -1;

        while (true) {
            System.out.println("moi ban nhap vao so nguyen duong :");
                if(sc.hasNextInt()){
                    a = sc.nextInt();
                    if(a > 0){
                        break;
                    }else {
                        System.out.println("so phai lon hon so 0");
                    }


                }else {
                    System.out.println("khong phai so nguyen");
                    sc.next();

                }

        }
        for (int i = 1; i < a; i++) {
            if (a % i == 0) {
                sum += i;
            }
        }
        if (sum == a) {
            System.out.println(a + " la so hoan hao");
        }else
            System.out.println(a + " khong phai la  hoan hao");


    }
}
