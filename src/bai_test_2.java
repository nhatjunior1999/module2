import java.util.Scanner;

public class bai_test_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("mời bạn nhập vào 1 số không từ 1 đến  999");
        int number = sc.nextInt();
        if (number < 0 || number > 999) {
            System.out.println("mời bạn nhập lại ");
            return;
        }
        if (number < 10) {
            System.out.println(motSo(number));
        } else if (number < 20) {
            System.out.println(haiSo(number));
        } else if (number < 100) {
            System.out.println(baSo(number));
        } else {
            System.out.println(baSoTo(number));
        }

    }

    public static String motSo(int num) {
        switch (num) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "sai gia tri";

        }
    }

    public static String haiSo(int num) {
        switch (num) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String baSo(int num) {
        int tens = num / 10;
        int ones = num % 10;
        String result = "";

        switch (tens) {
            case 2:
                result = "twenty";
                break;
            case 3:
                result = "thirty";
                break;

            case 4:
                result = "forty";
                break;

            case 5:
                result = "fifty";
                break;

            case 6:
                result = "sixty";
                break;

            case 7:
                result = "seventy";
                break;

            case 8:
                result = "eighty";
                break;

            case 9:
                result = "ninety";
                break;


        }
        if (num != 0) {
            result += " " + motSo(ones);
        }

        return result;
    }

    public static String baSoTo(int num) {
        int hundreds = num / 100;
        int remainder = num % 100;
        String result = motSo(hundreds) + "hundred";
        if (remainder != 0) {
            result += " and ";
            if (remainder < 10) {
                result += motSo(remainder);
            } else if (remainder < 20) {
                result += haiSo(remainder);
            } else {
                result += baSo(remainder);
            }
        }

        return result;
    }


}

