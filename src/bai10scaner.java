import java.util.Scanner;

public class bai10scaner {
    public static void main(String[] args) {
//        Scanner ac = new Scanner(System.in);
//        cho phep nhap ch
//        System.out.println("nhap vao k cap 1");
//        String k = ac.nextLine();
//        System.out.println("kha la " + k);
//
//        System.out.println("nhap vao so ngyen");
//        int a = ac.nextInt();
//        System.out.println("so ngyen la " + a);
//
//        System.out.println("nhap vao so thc");
//        float b = ac.nextFloat();
//        System.out.println(b);


//        System.out.println("nhap vao  so ngyen");
//        int n = new Scanner(System.in).nextInt();
//        System.out.println(n);
//
//        System.out.println("nhap vao ten");
//        String s = new Scanner(System.in).nextLine();
//        System.out.println(s);
//
//        System.out.println("nao vao so thc");
//        float n1 = new Scanner(System.in).nextFloat();
//        System.out.println(n1);
//
//        System.out.println("nao vao so thc");
//        double n2 = new Scanner(System.in).nextDouble();
//        System.out.println(n2);
//    baitap
//        Scanner sc =  new Scanner(System.in);
//        System.out.println("nhap a ");
//        int a = sc.nextInt();
//        System.out.println("nhap b");
//        int b = sc.nextInt();
//        int kq = a + b ;
//        System.out.println(kq);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a ");
        double a = sc.nextDouble();
        System.out.println("nhap vao so a ");
        double b = sc.nextDouble();
        double dt = a * b;
        double cv = (a + b) * 2;
        double rounded = Math.round(dt * 100.0) / 100.0;
        double rounded2 = Math.round(cv * 100.0) / 100.0;
        System.out.println("dien t la " + rounded  );
        System.out.println("ch vi  la " +rounded2);
    }
}
