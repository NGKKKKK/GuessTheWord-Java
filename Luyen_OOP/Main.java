package Java.Luyen_OOP;

import java.util.Random;

public class Main {

    public static final int MAX_STUDENTS = 42;
    public static void main(String[] args) {
        Student[] ClassCS = new Student[MAX_STUDENTS];
        Random RandomGPA = new Random();
        for (int i = 0 ; i < MAX_STUDENTS ; ++i){
            String ID = (i+1) + "";
            String NAME = "Nguyen Duc Khiem";
            int AGE = 18;
            double GPA = RandomGPA.nextDouble(3.2, 4.0);
            GPA = Math.round(GPA*100)/100.0;
            ClassCS[i] = new Student(ID, NAME, AGE, GPA);
        }
        for (Student tmp : ClassCS) tmp.getINFO();
    }
}
