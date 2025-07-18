import java.util.Scanner;

public class bai17_bt18_2 {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("mời bạn nhập số nguyên dương lơn hơn 0 : ");
            a = sc.nextInt();
            while (a <= 0) {
                System.out.println("mời bạn nhập số nguyên và lớn hơn hoặc bằng 0 :");
                a = sc.nextInt();
            }
            System.out.println("bạn đã nhập số nguyên a = " + a);

            int sumUoc = 0;

            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    sumUoc++;
                }
            }
            if (sumUoc == 2)
                System.out.println(a + " là số nguyên tố ");
            else
                System.out.println(a + " không phải là số nguyên tố");

            sc.nextLine();

            System.out.println("ban có muốn thoát không bấm Y để thoát");
                String traloi = sc.nextLine();
                if(traloi.equals("y")|| traloi.equals("Y")){
                    System.out.println("chương trình kết thúc , hẹn gặp lại bạn");
                    break;
                }
        }


    }
}
