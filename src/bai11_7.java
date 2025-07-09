import java.util.Scanner;

public class bai11_7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi ban nhap vao thang tu 1 den 12");
        int a = sc.nextInt();
        switch (a){
            case 1,2,3:
                System.out.println("quy 1");
                      break;
            case 4,5,6:
                System.out.println("quy 2");
                break;

            case 7,8,9:
                System.out.println("quy 3");
                break;

            case 10,11,12:
                System.out.println("quy 4");
                break;
            default:
                System.out.println("moi ban nhap lai");
        }

    }
}