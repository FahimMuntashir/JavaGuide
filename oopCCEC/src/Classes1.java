
public class Classes1 {

    String name;
    int rollno;
    double cgpa;

    void studentName()
    {
        System.out.println("The name of student.");
    }
    void studentFee()
    {
        System.out.println("The roll no of student.");
    }

    public static void main(String[] args) {
        Classes1 s1= new Classes1();   //creating object of class
        s1.studentFee();
        s1.studentName();
    }
}
