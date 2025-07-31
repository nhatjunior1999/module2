public class bai26_2_stringp2 {
    public static void main(String[] args) {
        StringBuilder s  = new StringBuilder();
        String s7 =  "tôi đi tìm tôi ";
            // IndexOfkiểm tra vị trí xuất hiện đầu tiên của kí tự hoac chuỗi trả về -1 nếu không tìm thấy
        System.out.println(s7.indexOf("tôi"));
        // LastIndexOf trả về vị trí index xuất hiện cuối cùng của ký tự hoặc chuỗi , trả về nếu không tìm thấy
        System.out.println(s7.lastIndexOf("tôi"));
        // contains kiểm tra chuỗi con
        String s9 = ".mp3";
        String s10 = "tolongnhat.mp3";
        // kiem tra xem s10 có chứa cụm string của s9 không
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("có .mp3 trong chuỗi");
        else
            System.out.println("không có .mp3 trong chuỗi");
        // substring trích lọc chuỗi con từ chuỗi ban đầu
        String s11 = "hagfsjdak";
        System.out.println(s11);
        String s121 = s11.substring(2);
        System.out.println(s121);
        String s12 = s11.substring(2,5);
        System.out.println(s12);
        // replace ("str old" , "str new");
        // thay thế toàn bộ chuỗi
        String s14 = " học học nữa học mãi ";
        String s15 =  s14.replace("học" , "ngủ");
        System.out.println(s14);
        System.out.println(s15);
        // replaceFirst
        // thay thế chuỗi cũ đầu tiên bằng chuỗi mới
        String s16 = " học học nữa học mãi ";
        String s17 = s16.replaceFirst("học","ngủ")  ;
        System.out.println(s16);
        System.out.println(s17);
        // trim xóa toàn bộ khoảng trắng đầu và cuối
        String s18 = "          học học nữa học mãi           ";
        String s19 = s18.trim();
        System.out.println(s19);
        // trim() xoa toàn bộ khoảng trắng ở cuối
        // cách 1  :  biểu thức chính quy (regular expression)
        // cách dùng : \s+$ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s20 =  s18.replaceAll("\\s+$","");
        System.out.println(s18.length());
        System.out.println(s20);
        // cách 2 : xóa khoảng trắng ở cuối chuỗi bằng vòng lặp while
        String s21 = "         tô long nhật         ";
        while (s21.endsWith(" ")){
            s21 = s21.substring(0,s21.length()-1);

        }
        // trim() xoa toàn bộ khoảng trắng ở cuối
        // cách 1  :  biểu thức chính quy (regular expression)
        // cách dùng : ^\\s+$\ để xóa tất cả các khoảng trắng ở cuối chuỗi
        String s23 =  "        tô long  nhật    ";
        String s24 = s23.replaceFirst("^\\s+","");
        System.out.println(s24);
        // cách 2 : xóa khoảng trắng ở cuối chuỗi bằng vòng lặp while
        String s25 = "        kkkk         ";
        while (s25.startsWith(" ")){
            s25 = s25.substring(1);
        }

    }
}
