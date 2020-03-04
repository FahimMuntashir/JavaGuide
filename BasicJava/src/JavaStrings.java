public class JavaStrings {
    public static void main(String[] args) {

        String str = "My name is";
        String str2 = " Fahim Muntashir";
        String str3 = str + str2;
        System.out.println(str3);
        String str4 = "java is Everywhere.";
        System.out.println("My name is " + "Fahim Muntashir");
        System.out.println(str4.length());
        System.out.println(str4.charAt(10));
        System.out.println(str4.toUpperCase());
        System.out.println(str.contains(str4));
        System.out.println(str4.indexOf("w"));
    }

}
