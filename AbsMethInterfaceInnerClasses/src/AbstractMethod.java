abstract class Account
{
    private String name;
    public abstract void rateOFInterest();
}

class SavingAccount extends Account
{
    @Override
    public void rateOFInterest()
    {
        System.out.println("6%");
    }

}
class CurrentAccount extends Account
{
    @Override
    public void rateOFInterest()
    {
        System.out.println("5%");
    }
}

public class AbstractMethod {
    public static void main(String[] args) {
        SavingAccount s = new SavingAccount();
        s.rateOFInterest();
        CurrentAccount c = new CurrentAccount();
        c.rateOFInterest();

    }
}
