import java.util.Scanner;

public class bai17_bt18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean next = true;
        while (next) {
            System.out.println(" mời bạn nhập vào 1 số : ");
            int a = sc.nextInt();
            if (a <= 0) {
                System.out.println(" mời bạn nhập lại số khác lớn hơn 0 hoặc khác 0 ");
                continue;
            }
            if (laSoNguyenTo(a)) {
                System.out.println(a + " là số nguyên tố ");
            } else
                System.out.println("số bạn nhập không phải là số nguyên tố");

            sc.nextLine();



            while (next) {
                System.out.print("bạn có muốn tiếp tục không yes / no : ");
                String result = sc.nextLine();
                if (result.equalsIgnoreCase("no")) {
                    next = false; // dòng này dừng vòng lặp chính
                    System.out.println("chương trình tạm kết thúc");
                    break; // thoát vòng lặp phụ
                } else if (result.equalsIgnoreCase("yes")) {
                    break;
                } else
                    System.out.println("vui lòng nhập đúng yes hoặc no");
            }
        }
    };





    public static boolean laSoNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    ;
}
