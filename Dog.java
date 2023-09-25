public class Dog {
   String name; 

    public Dog(String name) {
        this.name = name;
    }

    public void bark() {
        System.out.println(name + " says Woof!");
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("Fido");
        myDog.bark(); // Output: Fido says Woof!
    }
}
