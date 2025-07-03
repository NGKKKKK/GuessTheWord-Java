package Java;

import java.util.Scanner;

//Giải phương trình bậc 2

public class Hello {

    public static void solve(double a, double b, double c){
        if (a == 0){
            if (b == 0){
                if (c == 0) System.out.print("Phương trình đã cho có vô số nghiệm.");
                else System.out.print("Phương trình đã cho vô nghiệm.");
            }
            else{
                double res = -c/b;
                System.out.print("Phương trình đã cho có 1 nghiệm duy nhất: x = ");
                System.out.printf("%.3f", res);
            }
        }
        else{
            double delta = b*b - 4.0*a*c;
            if (delta < 0) System.out.print("Phương trình đã cho vô nghiệm.");
            else if (delta == 0){
                double res = -b/(2.0*a);
                System.out.print("Phương trình đã cho có 1 nghiệm duy nhất: x = ");
                System.out.printf("%.3f", res);
            }
            else{
                //System.out.println(SQRT(delta));
                double res1 = (-b - Math.sqrt(delta))/(2.0*a);
                double res2 = (-b + Math.sqrt(delta))/(2.0*a);
                System.out.println("Phương trình đã cho có 2 nghiệm phân biệt:");
                System.out.print("x = "); System.out.printf("%.3f%n", res1);
                System.out.print("x = "); System.out.printf("%.3f", res2);
            }

        }

    }

    public static void main(String[] agrs){
        System.out.println("Chương trình giải phương trình bậc 2");
        System.out.println();
        System.out.println("Mời bạn nhập dữ liệu vào:");
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        try{
        System.out.print("Hệ số a: "); a = sc.nextDouble(); 
        System.out.print("Hệ số b: "); b = sc.nextDouble(); 
        System.out.print("Hệ số c: "); c = sc.nextDouble();
        solve(a, b, c);
        } catch(Exception ex){
            System.out.println("Lỗi: Đầu vào không hợp lệ !");
        }
        sc.close();
    }
}
