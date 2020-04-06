interface reg1
{
    void studentRollNo();
}

interface Registration extends reg1
{
    void studentCard();
    void studentSection();
}

class BS implements Registration
{
    @Override
    public void studentRollNo()
    {
        System.out.println("BS-1");
    }
    @Override
    public void studentCard()
    {
        System.out.println("BS student card");
    }

    @Override
    public void studentSection()
    {
        System.out.println("BS section A");
    }
}

class MS implements Registration
{
    @Override
    public void studentRollNo()
    {
        System.out.println("MS-1");
    }
    @Override
    public void studentCard()
    {
        System.out.println("MS student card");
    }

    @Override
    public void studentSection()
    {
        System.out.println("MS section A");
    }
}

class Phd implements Registration
{
    @Override
    public void studentRollNo()
    {
        System.out.println("Phd-1");
    }
    @Override
    public void studentCard()
    {
        System.out.println("Phd student card");
    }

    @Override
    public void studentSection()
    {
        System.out.println("Phd section A");
    }
}

public class InterfaceDetails {
    public static void main(String[] args) {


        BS bs = new BS();
        bs.studentRollNo();
        bs.studentCard();
        bs.studentSection();


        MS ms = new MS();
        ms.studentRollNo();
        ms.studentCard();
        ms.studentSection();

        Phd phd = new Phd();
        phd.studentRollNo();
        phd.studentCard();
        phd.studentSection();
    }
}
