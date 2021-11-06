package task1;

import java.util.Objects;

public class Animal {
    private String ration;
    private String color;
    private int weight;

    public Animal() {
    }

    public Animal(String ration, String color, int weight) {
        this.ration = ration;
        this.color = color;
        this.weight = weight;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight &&
                Objects.equals(ration, animal.ration) &&
                Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ration, color, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "ration='" + ration + '\'' +
                ", color='" + color + '\'' +
                ", weigt=" + weight +
                '}';
    }

    public String getVoice() {
        return "Animal eee";
    }

    public void eat() {
        System.out.println("Animal eats");
    }

    public void sleep() {
        System.out.println("Animal sleeps");
    }
}
