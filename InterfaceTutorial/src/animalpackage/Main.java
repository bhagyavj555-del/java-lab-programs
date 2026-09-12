package animalpackage;

public class Main {

    public static void main(String[] args) {

        // Spider object
        Spider spider = new Spider();

        System.out.println("----- Spider -----");
        spider.walk();
        spider.eat();

        // Cat object
        Cat cat = new Cat("Kitty");

        System.out.println("\n----- Cat -----");
        cat.walk();
        cat.eat();
        cat.play();

        // Change Cat's name
        cat.setName("Tom");
        System.out.println("Cat's new name: " + cat.getName());
        cat.play();

        // Fish object
        Fish fish = new Fish();

        System.out.println("\n----- Fish -----");
        fish.setName("Nemo");
        System.out.println("Fish name: " + fish.getName());
        fish.walk();
        fish.eat();
        fish.play();

        // Polymorphism
        System.out.println("\n----- Polymorphism -----");

        Animal animal1 = new Spider();
        Animal animal2 = new Cat("Milo");
        Animal animal3 = new Fish();

        animal1.eat();
        animal2.eat();
        animal3.eat();

        // Interface reference
        System.out.println("\n----- Interface Reference -----");

        Pet pet1 = new Cat("Luna");
        Pet pet2 = new Fish();

        pet1.play();
        pet2.setName("Goldie");
        pet2.play();
    }
}