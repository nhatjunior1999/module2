import java.util.Calendar;
import java.util.Scanner;

public class bai22_bt3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời nhập tháng sinh :");
        int month = sc.nextInt();
        System.out.println("mời nhập ngày sinh");
        int day = sc.nextInt();
        // lấy ngày hiện tại :
        Calendar today = Calendar.getInstance();
        int ngaySinh = today.get(Calendar.DAY_OF_MONTH);
        int thangSinh = today.get(Calendar.MONTH) + 1;
        // so sánh ngày và tháng
        if (month == thangSinh && day == ngaySinh) {
            System.out.println(" hôm nay là sinh nhật của bạn ! chúc mừng nha!");
        }else {
            System.out.println("hôm nay không phải sinh nhật  bạn ");
        }
    }
}
