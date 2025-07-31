import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_datetime {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year);
        System.out.println(month + 1);
        System.out.println(day);
        // thiết lập ngày tháng
        cal.set(Calendar.YEAR, 2000);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        // kiểm tra ngày tháng sau thiết lập :
        int year11 = cal.get(Calendar.YEAR);
        int month1 = cal.get(Calendar.MONTH);
        int day1 = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(year11);
        System.out.println(month1 + 1);
        System.out.println(day1);
        // xuất theo định dạng ngày tháng năm
        SimpleDateFormat dinh = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
        // tạo ra một đối tượng date get time trong đối tượng cal
        Date d = cal.getTime();
        String s = dinh.format(d);
        System.out.println(s);


    }
}
