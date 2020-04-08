public class DefaultCatch {
    public static void main(String[] args) {
        int balance = 10000;
        int withdrawAmount = 9000;

        if (withdrawAmount>balance)
            throw new ArithmeticException("You dont have enough balance");

        balance = balance-withdrawAmount;
        System.out.println("Amount withdraw successfully");
        System.out.println("Our program is going to continue");
    }
}
