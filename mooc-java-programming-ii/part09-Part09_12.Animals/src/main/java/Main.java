
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here
        NoiseCapable dog = new Dog("Cordu");
        dog.makeNoise();

        NoiseCapable cat = new Cat("Garfield");
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
        Dog a = (Dog) dog;
        a.bark();

    }

}
