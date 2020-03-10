public class ConstructorClass {

    public static class Student
    {
        private String name;
        private int rollno;
        private int fee;

        Student()
        {
            name="Java";
            rollno=300;
            fee=10000;
        }
        Student(String n, int r, int f)
        {

            name=n;
            fee=f;
            rollno=r;
        }
        String getName()
        {
            return name;
        }
        int getRollno()
        {
            return rollno;

        }
        int getFee()
        {
            return fee;
        }
    }
    public static void main(String[] args) {

        Student s1 = new Student("Fahim", 5000,200);
        System.out.println(s1.getFee());
        System.out.println(s1.getName());
        System.out.println(s1.getRollno());


        Student s2 = new Student();
        System.out.println(s2.getFee());
        System.out.println(s2.getName());
        System.out.println(s2.getRollno());
    }
}
