import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap diem trng binh ba ");
        double dtb = sc.nextDouble();
        if(dtb < 5.0 ){
            System.out.println(" ban la hoc sinh ye");
        }else if(dtb >= 5.0 && dtb <= 6.5 ){
            System.out.println(" ban da do ");
        }else if( dtb < 8.0 ){
            System.out.println(" ban la hoc sinh tien tien  ");
        }else{
            System.out.println(" ban hoc sinh gioi ");
        }

    }
}
