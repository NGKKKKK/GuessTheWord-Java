package Java;

import java.util.Date;
//import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

//Tính tuổi

public class TestCal {
    public static void main(String[] args) {
        //Locale vn = new Locale("vi", "VN");
        SimpleDateFormat test = new SimpleDateFormat("dd/MM/yyyy");
        int year, month, day, k;
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        try{
            do{
            if (cnt > 0) System.out.println("Bạn nhập dữ liệu bị nhầm rùi, hãy thử lại!");
            System.out.println("Mời bạn nhập các thông tin sau: ");
            System.out.print("Ngày sinh: "); day = sc.nextInt();
            System.out.print("Tháng sinh: "); month = sc.nextInt();
            System.out.print("Năm sinh: "); year = sc.nextInt();
            System.out.print("Nhập khoảng thời gian sau bao nhiêu năm: "); k = sc.nextInt();
            cnt++;
            System.out.println();
            } while(day <= 0 || month <= 0 || year <= 0);
            Calendar cal = Calendar.getInstance();
            month--; //month : 0 -> 11
            cal.set(year, month, day);
            Date birthday = cal.getTime();
            //System.out.println(birthday);
            Calendar new_cal = Calendar.getInstance();
            int res_1 = (new_cal.get(Calendar.YEAR) - year);
            int res_2 = res_1 + k;
            String bd = test.format(birthday);
            System.out.println("Sinh nhật của bạn: " + bd);
            System.out.println("Hiện tại bạn đang " + res_1 + " tuổi");
            System.out.println("Sau " + k + " năm nữa, bạn sẽ " + res_2 + " tuổi");
        } catch(Exception ex){
            System.out.println("Lỗi: Đầu vào không hợp lệ !");
            //System.out.println(ex);
        }
        sc.close();
    }
    
}
