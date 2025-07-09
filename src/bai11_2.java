import java.util.Scanner;

public class bai11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu cao");
        double chieuCao = sc.nextDouble();
        System.out.println("nhap vao can nang");
        double canNang = sc.nextDouble();
        double bmi = canNang / (chieuCao * chieuCao);
        System.out.println("BMI cua ban la " + bmi);
        if (bmi < 15) {
            System.out.println("than hinh qua gay");
        } else if (bmi >= 15 && bmi < 16) {
            System.out.println("than hinh gay");
        } else if (bmi >= 16 && bmi < 18.5) {
            System.out.println("than hinh hoi gay");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("than hinh binh thuong");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("than hinh hoi beo");
        } else if (bmi >= 30 && bmi < 35) {
            System.out.println("than hinh beo");
        } else{
            System.out.println("than hinh qua beo");
        }

    }
}
