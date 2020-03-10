
public class Classes2 {

    String name="Java";
    int rollno; //instance variable
    double cgpa;
    static int fee; //class variable

    void studentName()
    {
        System.out.println("Name :"+name);
    }
    void studentFee()
    {
        System.out.println("The roll no of student.");
    }

    public static void main(String[] args) {
        Classes2 s1= new Classes2();   //creating object of class
        s1.studentFee();
        s1.studentName();
    }
}
