class Example
{
    public void printArray(String []s)
    {
        for (int  i = 0; i<=s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
    public void printArray(int []s)
    {
        for (int  i = 0; i<=s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}

public class Generics {
    public static void main(String[] args) {

        String []languages = {"Java", "C++", "Python", "PHP", "Ruby"};
        int []numbers = {45,85,66,96,36,88};

        Example e  = new Example();
        e.printArray(languages);
        e.printArray(numbers);
    }
}
