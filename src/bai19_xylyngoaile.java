public class bai19_xylyngoaile {
    public static void main(String[] args) {
       int a = 0 ;
       int b = 10;

       try{
           int c = b/a;
           System.out.println(c);
       } catch (Exception e) {
           System.out.println("có lỗi rồi e");
           e.printStackTrace();
       }
        System.out.println("đoạn code phía sau");
    }
}
