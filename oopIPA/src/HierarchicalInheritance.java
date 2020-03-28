
class Person
{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person
{
    int fees;
    double cgpa;

    public int getFees() {
        return fees;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    class Teacher extends Person
    {
        private int salary;

        public int getSalary() {
            return salary;
        }

        public void setSalary(int salary) {
            this.salary = salary;
        }
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setName("Fahim Muntashir ");
        s1.setAge(20);
        s1.setFees(5000);
        s1.setCgpa(4.00);

        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        System.out.println(s1.getFees());
        System.out.println(s1.getCgpa());

      
    }
}
