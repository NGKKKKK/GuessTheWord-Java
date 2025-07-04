package Java.Luyen_OOP;

public class Student {
    private String ID;
    private String NAME;
    private int AGE;
    private double GPA;

    public Student(){
        ID = "0"; NAME = ""; AGE = 0; GPA = 0.0;
    }

    public Student(String ID, String NAME, int AGE, double GPA){
        this.ID = ID; this.NAME = NAME; this.AGE = AGE; this.GPA = GPA;
    }

    public void getINFO(){
        System.out.println("----- INFO -----");
        System.out.println("ID: " + ID);
        System.out.println("NAME: " + NAME);
        System.out.println("AGE: " + AGE);
        System.out.println("GPA: " + GPA);
        System.out.println();
    }

    public void setGPA(double GPA){
        this.GPA = GPA;
    }

    public void setAGE(int AGE){
        this.AGE = AGE;
    }


}
