//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // now we are creating objects
        Animal animal = new Animal("General Animal", 5, "White");
        Dog dog = new Dog("BULLDOG", 3, "Black");
        Cat cat = new Cat("KETTY", 1, "Brown");

        // now we access and modify objects
        System.out.println("Animal : " + animal.getName() + ", Age : " + animal.getAge() + ", Colour : " + animal.getColour());
        animal.setName("Whisky");
        animal.setAge(6);
        animal.setColour("blue");
        System.out.println("Animal : " + animal.getName() + ", Age : " + animal.getAge() + ", Colour : " + animal.getColour());

        // calling overriding methods
        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        cat.climbing();
        cat.eating();
        dog.eating();
    }
}