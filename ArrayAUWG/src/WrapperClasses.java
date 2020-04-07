public class WrapperClasses {
    public static void main(String[] args) {

        int a= 5;
        Integer i = new Integer(5);

        String str = "Java";//this is not object
        String s1 = new String("Java");//this is a object of String class

        System.out.println("Primative data type: "+a);
        System.out.println("Wrapper class: "+i);

        System.out.println(str);
        System.out.println(s1);
    }
}
