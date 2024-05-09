public class Cat extends Animal {
    public Cat(String name, int age, String color) {
        super(name, age, color);
    }
    // polymorphism

    @Override
    public void makeSound() {
        System.out.println("Cats meow..");
    }

    @Override
    public void eating() {
        System.out.println("Cats eats..");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleeps..");
    }
    public void climbing(){
        System.out.println("Cats Can climb..");
    }
}
