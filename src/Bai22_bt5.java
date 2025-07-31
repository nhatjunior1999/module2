import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Bai22_bt5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Nhập ngày (định dạng dd/MM/yyyy) : ");
        String input = sc.nextLine();
        try{
            //chuyển chuỗi sang Date :
            Date ngay = sdf.parse(input);

            // tạo calendar từ Date :
            Calendar cl = Calendar.getInstance();
            cl.setTime(ngay);
            // cộng thêm 1 ngày :
            cl.add(cl.DATE, 1);
            // lấy lại ngày mai :
            Date nextDate = cl.getTime();
            String formattedNextDate =sdf.format(nextDate);
            System.out.println("Ngày mai là : " + formattedNextDate );


        } catch (ParseException e){
            System.out.println("lỗi định dạng ngày , hãy nhập theo dd/MM/yyyy");
        }
    }
}
