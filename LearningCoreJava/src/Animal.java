public class Animal {
    private String name;
    private int age;
    private String colour;
    public Animal(String name, int age, String colour) {
        this.name = name;
        this.age = age;
        this.colour = colour;
    }
    // getter setter for encapsulated class
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getColour() {
        return colour;
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    // Abstract method

    public void makeSound(){
        System.out.println("Animal Makes a Sound");

    }
    public void eating(){
        System.out.println("Animal eats");
    }
    public void sleep(){
        System.out.println("Animal sleeps");
    }
    public void climbing(){
        System.out.println("Some Animal climbs");
    }
}
