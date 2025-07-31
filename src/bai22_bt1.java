import java.util.Calendar;
import java.util.Scanner;

public class bai22_bt1 {
    public static void main(String[] args) {
        int day, month, year, age;
        Scanner input = new Scanner(System.in);
        System.out.println(" mời bạn nhập năm sinh : ");
        year = input.nextInt();
        System.out.println(" mời bạn nhập tháng sinh : ");
        month = input.nextInt();
        System.out.println("mời bạn nhập ngày sinh : ");
        day = input.nextInt();
        // khởi tạo calendar
        Calendar birthday = Calendar.getInstance();
        // sét ngày tháng năm sinh do người dùng nhập vào
        birthday.set(year, month - 1, day);
        // xuất ngày tháng năm sinh :
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);
        int thangSinh = birthday.get(Calendar.MONTH);
        int namSinh = birthday.get(Calendar.YEAR);
        System.out.println("ngày tháng năm : "
                + ngaySinh + "/" + (thangSinh+1) + "/" + namSinh
        );
        // tính tuổi
        // lấy năm hiện tại :
        Calendar now = Calendar.getInstance();
        int namhientai = now.get(Calendar.YEAR);
        // tính tuổi
         age = namhientai - namSinh;
        System.out.println(" tuổi của bạn là " + age);






    }
}
