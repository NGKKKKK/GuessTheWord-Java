package Java;

public class Lon {
    public static void main(String[] args) {
        String welcome = "     Welcome to my house       ";
        System.out.println(welcome.length());
        //C1: Dùng replaceAll(2 tham số truyền vào).
        //C2: Dùng vòng lặp.
        while (welcome.charAt(0) == ' '){
            String rpl = welcome.substring(1);
            welcome = rpl;
        }
        System.out.println(welcome.length());
        System.out.println(welcome);
    }
}

