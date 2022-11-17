public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.bark();
    }
}

class Dog {
    private String name = "noName";

    Dog(String name) {
        this.name = name;
    }

    Dog() {
    }

    public void bark() {
        System.out.println(this.name);
    }
}