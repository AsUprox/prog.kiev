package task1;

public class Main {
    public static void main(String[] args) {
        Commodity a1 = new Commodity("10021", "tonn", 112.345D, "iron ore");
        a1.about();
        Commodity a2 = new Commodity("00001", "barrel", 81.532D, "brent oil");
        a2.about();
        a2.setPrice(82.901D);
        a2.about();
    }
}
