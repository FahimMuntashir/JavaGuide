
class Animal {
    String name;
    String color;


    Animal() {
        name = "Name of animal";
        color = "Color of animal";
    }

    void getName() {
        System.out.println("The name of animal goes here");
    }

    void getColor() {
        System.out.println("The color of animal goes here");
    }
}
    class Dog extends Animal
    {
        void Bark()
        {
            System.out.println("Dog is Barking");
        }
    }

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.getName();
        d1.getColor();
        d1.Bark();

    }
}
