import java.util.Calendar;
import java.util.Scanner;

public class Bai22_bt6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" mời bạn nhập ngày : ");
        int day = sc.nextInt();
        System.out.println(" mời bạn nhập tháng : ");
        int month = sc.nextInt();
        Calendar today = Calendar.getInstance();

        Calendar Nextbirthday = Calendar.getInstance();
        Nextbirthday.set(Calendar.MONTH, month - 1);
        Nextbirthday.set(Calendar.DAY_OF_MONTH,day);
        if (Nextbirthday.before(today) || sameDay(today, Nextbirthday)) {Nextbirthday.add(Calendar.YEAR, 1); // sang năm sau
        }

        // Tính số milliseconds còn lại
        long millisLeft = Nextbirthday.getTimeInMillis() - today.getTimeInMillis();

        // Đổi sang số ngày
        long daysLeft = millisLeft / (1000 * 60 * 60 * 24);

        System.out.println("🎂 Còn " + daysLeft + " ngày nữa đến sinh nhật tiếp theo của bạn.");
    }
    public static boolean sameDay(Calendar c1, Calendar c2) {
        return c1.get(Calendar.DAY_OF_MONTH) == c2.get(Calendar.DAY_OF_MONTH)
                && c1.get(Calendar.MONTH) == c2.get(Calendar.MONTH);
    }
    }

