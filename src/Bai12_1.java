import java.util.Scanner;

public class Bai12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập để chọn chương trình");
        System.out.println("1 : tìm theo tên tác giả");
        System.out.println("2 : tìm theo năm");
        System.out.println("3 : tìm theo sách");
        System.out.println("0 : thoát chương trình ");
        System.out.print("Nhập lựa chọn của bạn: ");
        int a = sc.nextInt();
        sc.nextLine();
        switch (a) {
            case 1:
                System.out.println("Bạn đã chọn: Tìm theo tên tác giả của Dế Mèn Phiêu Lưu Ký.");
                System.out.print("Nhập tên tác giả: ");
                String ten = sc.nextLine().trim().toLowerCase();
                if (ten.equals("tô hoài") || ten.equals("to hoai")) {
                    System.out.println("Chúc mừng bạn đã đoán đúng!");
                    System.out.println("Tô Hoài chính là tác giả của Dế Mèn Phiêu Lưu Ký.");
                } else {
                    System.out.println("Sai rồi! Mời bạn nhập lại tên tác giả.");
                }
                break;
            case 2:

                System.out.println("tìm theo năm : ");
                System.out.println("tác giả viết dế mèn phiêu lưu kí vào năm nào : ");
                int nam = sc.nextInt();
                if (nam == 1942) {
                    System.out.println("bạn đã đoán đúng ");
                } else {
                    System.out.println("bạn đã đoán sai năm vui lòng đoán lại");
                }
                break;

            case 3:
                System.out.println("tìm theo sách");
                System.out.println("tác giả tô hoài có viết cuốn sách tên là gì vào năm 1942 :");
                String sach = sc.nextLine();
                if (sach == "dê mèn phiêu ký") {
                    System.out.println("chúc mừng bạn đã đoán đúng");
                } else {
                    System.out.println("vui lòng nhập lại tên sách");
                }
                break;
            case 0:

                System.out.println("chương trình đã thoát !!!!");
            default:
                System.out.println("⚠ Lựa chọn không hợp lệ. Vui lòng nhập số từ 0 đến 3.");
                break;
        }


    }

}
