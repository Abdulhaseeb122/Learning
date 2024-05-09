public class Dog extends Animal{
    public Dog(String name, int age, String color){
        super(name, age, color);
    }
    // polymorphism  overriding methods

    @Override
    public void makeSound(){
        System.out.println("Dogs Barks...");
    }

    @Override
    public void eating() {
        System.out.println("Dogs Eating Meat..");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs Sleeps..");
    }


}


