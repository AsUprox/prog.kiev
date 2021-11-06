package task1;

public class Main {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        Dog d1 = new Dog();
        Veterinarian v1 = new Veterinarian();
        c1.setName("Barsik");
        d1.setName("Sharik");
        v1.setName("Sandy");
        v1.treatment(c1);
        v1.treatment(d1);
    }
}
