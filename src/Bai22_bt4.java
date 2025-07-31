import java.util.Calendar;
import java.util.Scanner;

public class Bai22_bt4 {
    public static void main(String[] args) {
        int day, month, year;
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào ngày :");
        day = sc.nextInt();
        System.out.println(" mời bạn nhập vào tháng :  ");
        month = sc.nextInt();
        System.out.println(" mời bạn nhập vào năm ");
        year = sc.nextInt();
        // sét ngày c
        Calendar dayInput = Calendar.getInstance();
        dayInput.set(year, month - 1, day);
        // cộng thêm một
        dayInput.add(Calendar.DAY_OF_MONTH, 1);
        // lấy lại ngày tháng năm sau khi cộng :
        int nextDay = dayInput.get(dayInput.DAY_OF_MONTH);
        int nextMonth = dayInput.get(dayInput.MONTH) + 1;
        int nextYear = dayInput.get(dayInput.YEAR);
        // in kết quả :
        System.out.println(" ngày mai là : " + nextDay + "/" + nextMonth + "/" + nextYear + "");

    }
}
