package task1;

public class Dog extends Animal {
    public String name;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String ration, String color, int weight, String name) {
        super(ration, color, weight);
        this.name = name;
    }

    public Dog() {
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
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public String getVoice() {
        return "Dog " + this.name + ": gaw!";
    }

    @Override
    public void eat () {
        System.out.println("Dog " + this.name + " eats");
    }

    @Override
    public void sleep () {
        System.out.println("Dog " + this.name + " sleeps");
    }
}
