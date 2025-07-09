import java.util.Scanner;
import java.text.DecimalFormat;
public class doi_tien_te {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("chuyển đổi tiền tệ");
        System.out.println("nếu bạn muốn hãy nhập 1 là chuyển tiền việt nam sang đô la  hoặc 2 là chuyển từ đô la sang việt nam :");
        System.out.println("mời bạn nhập : ");
        int a = sc.nextInt();
        switch (a) {
            case 1:
                VietNam();
                break;
            case 2:
                Dola();
                break;
            default:
                System.out.println(" mời bạn nhập lại");
        }
    }

    public static void VietNam() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập số tiền việt cần đổi");
        double a = sc.nextDouble();
        double tienDoi = 26.122 / a;
        DecimalFormat usdFormat = new DecimalFormat("#,###.00");
        System.out.println("số tiền đô của bạn là " + usdFormat.format(tienDoi) + "$");
    }

    public static void Dola() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập vào số tiền đô sang tiền việt :");
        int a = sc.nextInt();
        int tienDoi = a * 26122;
        DecimalFormat vndFormat = new DecimalFormat("#,###");
        String hienThi = vndFormat.format(tienDoi).replace(",", ".");
        System.out.println(" số tiền bạn đổi là " + hienThi + "VNĐ");
    }
}
