import java.util.Scanner;

public class bai25_char {
    public static void main(String[] args) {
        // khoi tao
        char ch = 'a';
        char ch1 = 'A';
        char ch2 = 65;
        System.out.println(ch2);
        char ch3;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao ky  : ");
        ch3 = sc.next().charAt(0);
        System.out.println("chuoi " + ch3 + " la " + (int) ch3);
        // so sanh
        System.out.println(Character.compare('a', 'b'));
        char ch5 = 'a';
        char ch6 = 'B';
        char ch7 = ' ';
        char ch8 = '9';


        System.out.println(Character.isLowerCase(ch5));
        // là viết chu thường phải không


        System.out.println(Character.isLetter(ch5));
        // là chữ cái phải không


        System.out.println(Character.isUpperCase(ch6));
        // là viết hoa phải không


        System.out.println(Character.isWhitespace(ch7));
        // là khoảng trắng phải không

        System.out.println(Character.isDigit(ch8));
        // là số phải không

    }
}
