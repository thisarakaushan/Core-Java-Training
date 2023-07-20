package mypackage;

class Animals {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

class Dogs extends Animals {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cats extends Animals {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animals animal = new Animals();
        animal.sound();

        Animals dog = new Dogs();
        dog.sound();

        Animals cat = new Cats();
        cat.sound();
    }
}

