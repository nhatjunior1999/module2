public class bai26_1_stringp1 {
    public static void main(String[] args) {
    String s = "một hai ba bốn năm " +
            "\nsáu bảy tám chín mười \n";
    StringBuilder sb = new StringBuilder();
        System.out.println();
    // appen thêm vào cuối chuỗi
        sb.append("xin chào,");
        sb.append("mình là ,");
        sb.append("rất vui được làm quen với bạn ,");
        System.out.println(sb);
        // insert vị trí index , chuỗi cần chèn
        ;sb.insert(17, "Tô long nhật");
        System.out.println(sb);
        // delete xóa kí tự từ bị trí start đến vị trí end-1
        sb.delete(4,8);
        System.out.println(sb);



    }
}
