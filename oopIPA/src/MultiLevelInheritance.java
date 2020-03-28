import java.util.Scanner;

class Electronics
{
    private String name;
    private int price;


     void setName(String name) {
        this.name = name;
    }
    String getName()
    {
        return name;
    }

     void setPrice(int price) {
        this.price = price;
    }

     int getPrice() {
        return price;
    }
}

class Fans extends Electronics
{
    private int airSpeed;

     void setAirSpeed(int airSpeed) {
        this.airSpeed = airSpeed;
    }

     int getAirSpeed() {
        return airSpeed;
    }
}

class WaterFans extends Fans
{
    private int waterCapacity;

     void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

     int getWaterCapacity() {
        return waterCapacity;
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        WaterFans f1 = new WaterFans();
        System.out.println("Enter name of fan :");
        Scanner s1 = new Scanner(System.in);
        String name = s1.next();

        System.out.println("Enter price of fan :");
        Scanner s2 = new Scanner(System.in);
        int price = s2.nextInt();

        System.out.println("Enter air speed :");
        Scanner s3 = new Scanner(System.in);
        int fansSpeed= s3.nextInt();


        System.out.println("Enter water capacity:");
        Scanner s4 = new Scanner(System.in);
        int capacity= s3.nextInt();

        f1.setName(name);
        f1.setPrice(price);
        f1.setAirSpeed(fansSpeed);
        f1.setWaterCapacity(capacity);

        System.out.println("Name: "+f1.getName());
        System.out.println("Price:"+f1.getPrice());
        System.out.println("Air Speed"+f1.getAirSpeed());
        System.out.println("Water Capacity"+f1.getWaterCapacity());

    }
}
