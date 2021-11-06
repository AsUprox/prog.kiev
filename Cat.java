package task1;

public class Cat extends Animal {
    public String name;

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Cat() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getVoice() {
        return "Cat " + this.name + ": meow!";
    }

    @Override
    public void eat () {
        System.out.println("Cat " + this.name + " eats");
    }

    @Override
    public void sleep () {
        System.out.println("Cat " + this.name + " sleeps");
    }
}
