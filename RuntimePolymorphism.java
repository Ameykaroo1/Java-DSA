import java.util.Scanner;

abstract class RuntimePolymorphism {
    abstract void speak();
}

class Dogz extends RuntimePolymorphism {
    @Override
    void speak() {
        System.out.println("The dog goes woof 🐶");
    }
}

class Catz extends RuntimePolymorphism {
    @Override
    void speak() {
        System.out.println("The cat says meow 🐱");
    }
}

class Mainz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RuntimePolymorphism animal;

        System.out.print("Would you like a dog or cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dogz();
            animal.speak();
        } 
        else if (choice == 2) {
            animal = new Catz();
            animal.speak();
        } 
        else {
            System.out.println("Invalid choice ❌");
        }

        scanner.close();
    }
}